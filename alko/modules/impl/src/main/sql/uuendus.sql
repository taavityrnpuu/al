--drop the tables
drop table report_view;
drop table report_list_view;
drop table reg_entry_view;
drop table reg_payment_view;
--create views
create or replace view report_view as
select list.id
     , list.report_ent_id
     , list.load_enterprise_id
     , ent.name
     , ent.reg_id
     , ent.phone
     , ent.mobile
     , ent.email
     , ent.fax
     , list.created
     , list.rep_year
     , list.month_class_id
     , list.load_person_id
     , list.total
from (select rep.*
           , rec.total
      from product_move_report rep
      left join (select report_id
                      , count(*) as total
                 from product_move_report_record
                 group by report_id) rec
      on rep.id = rec.report_id) as list
left join enterprise ent
on list.report_ent_id = ent.id;


create or replace view report_list_view as
SELECT apl.id AS apl_id, apl.product_id AS apl_product_id, list.nr, list.id, list.created, list.amount, list.receiver, list.party_nr, list.market_place, list.market_addr, list.market_distr, list.market_orgunit, list.regentry_id, list.report_id, list.report_month, list.rep_year, list.reporting_ent, list.reporting_ent_reg_id, apl.name, apl.prod_class_id AS product_class_id, apl.org_country_class_id AS product_orig_country_class_id, apl.country_class_id AS producer_country_class_id, apl.ent_name AS producer_name
   FROM ( SELECT reg.nr, rep.id, rep.created, rep.amount, rep.receiver, rep.party_nr, rep.market_place, rep.market_addr, rep.market_distr, rep.market_orgunit, rep.regentry_id, rep.report_id, rec.month_class_id AS report_month, rec.rep_year, ent.name AS reporting_ent, ent.reg_id AS reporting_ent_reg_id
           FROM product_move_report_record rep
      LEFT JOIN reg_entry reg ON rep.regentry_id = reg.id
   LEFT JOIN product_move_report rec ON rep.report_id = rec.id
   LEFT JOIN enterprise ent ON rec.report_ent_id = ent.id) list
   left join
     (select reg.regentry_id,reg.id,reg.product_id,prod.name, prod.prod_class_id, prod.org_country_class_id, ent.country_class_id , ent.name as ent_name from reg_application reg
    LEFT JOIN product prod ON reg.product_id = prod.id
   LEFT JOIN enterprise ent ON prod.producer_subj_id = ent.id
   where reg.id = prod.appl_id) apl on apl.regentry_id = list.regentry_id;


--select * from report_view

--

CREATE OR REPLACE VIEW reg_entry_view AS 
  SELECT re.id, p.name AS prod_name, p.org_country_class_id AS prod_org_country_class_id, p.prod_class_id, p.notes AS prod_notes, p.capacity_class_id, p.ethanol_rate, e.name AS pe_name, e.country_class_id AS pe_country_class_id, ae.name AS ae_name, re.valid_from, re.valid_until, re.nr, a.decision_date
   FROM reg_application a
   LEFT JOIN product p ON a.product_id = p.id
   LEFT JOIN enterprise e ON p.producer_subj_id = e.id
   LEFT JOIN enterprise ae ON a.appl_subj_id = ae.id
   LEFT JOIN reg_entry re ON a.regentry_id = re.id
   LEFT JOIN classificator cl ON a.appl_type_class_id = cl.id
  WHERE cl.code::text = 'ARE'::text AND current_timestamp >= re.valid_from AND current_timestamp <= re.valid_until;

CREATE OR REPLACE VIEW reg_payment_view AS 
 SELECT p.id, p.payment_time, p.amount, e.name AS enterprise_name, e.reg_id AS enterprise_reg_id, NULL::unknown AS application_nr, p.payer_name, 'payment' AS type, NULL::unknown AS app_id, e.id AS enterprise_id
   FROM reg_payment p
   LEFT JOIN enterprise e ON p.payer_enterprise_id = e.id
UNION ALL 
 SELECT pl.id, pl.created AS payment_time, pl.amount, e1.name AS enterprise_name, e1.reg_id AS enterprise_reg_id, ap.nr AS application_nr, NULL::unknown AS payer_name, cl.code AS type, ap.id AS app_id, ap.appl_subj_id AS enterprise_id
   FROM payment_matching_log pl
   LEFT JOIN reg_application ap ON pl.payment_application_id = ap.id
   LEFT JOIN enterprise e1 ON ap.appl_subj_id = e1.id
   LEFT JOIN classificator cl ON ap.appl_type_class_id = cl.id;


-- to guarantee unique id value for reg_payment_view
alter SEQUENCE reg_payment_seq
  INCREMENT 1
  MINVALUE 1223372036854775
  MAXVALUE 9223372036854775
  START 4223372036854775
  CACHE 1;
  

alter SEQUENCE payment_matching_log_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 4223372036854774
  START 1
  CACHE 1;

create SEQUENCE extend_decision_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775
  START 1
  CACHE 1;

create SEQUENCE reg_application_nr_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775
  START 48516
  CACHE 1;