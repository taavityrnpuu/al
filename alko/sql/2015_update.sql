alter table reg_doc add public smallint default 0;
alter table reg_doc add archived smallint default 0;

CREATE OR REPLACE VIEW reg_entry_view AS 
 SELECT re.id, p.name AS prod_name, p.org_country_class_id AS prod_org_country_class_id, p.prod_class_id, p.notes AS prod_notes, p.capacity_class_id, p.ethanol_rate, e.name AS pe_name, e.country_class_id AS pe_country_class_id, ae.name AS ae_name, re.valid_from, re.valid_until, re.nr, a.decision_date, ( SELECT count(*) AS count
           FROM reg_doc
          WHERE reg_doc.doc_appl_id = a.id AND reg_doc.public = 1) AS public_doc_count
   FROM reg_application a
   LEFT JOIN product p ON a.product_id = p.id
   LEFT JOIN enterprise e ON p.producer_subj_id = e.id
   LEFT JOIN enterprise ae ON a.appl_subj_id = ae.id
   LEFT JOIN reg_entry re ON a.regentry_id = re.id
   LEFT JOIN classificator tcl ON a.appl_type_class_id = tcl.id
   LEFT JOIN classificator scl ON a.appl_state_class_id = scl.id
  WHERE tcl.code::text = 'ARE'::text AND scl.code::text = 'RGE'::text AND 'now'::text::date >= date(re.valid_from) AND 'now'::text::date <= date(re.valid_until);

ALTER TABLE reg_entry_view
  OWNER TO alkor;