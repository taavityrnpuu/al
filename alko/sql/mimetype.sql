-- varchar(64) võib mõningatel juhtudel kitsaks jääda﻿

ALTER TABLE reg_doc ALTER COLUMN mime TYPE varchar(128);
ALTER TABLE reg_doc_history ALTER COLUMN mime TYPE varchar(128);

ALTER TABLE reg_application add column from_xtee boolean;
ALTER TABLE reg_application_history add column from_xtee boolean;

-- uued klassifikaatorid:

INSERT INTO classificator (id,name,active,code,category,cat_name,order_nr) 
VALUES (nextval('classificator_seq'), 'Menetluses', 'true', 'ADDCTLNMOPRO', 'ApplicationState2', 'Taotluse staatused EIT', 1),
(nextval('classificator_seq'), 'Registrisse kantud', 'true', 'RGE2', 'ApplicationState2', 'Taotluse staatused EIT', 2),
(nextval('classificator_seq'), 'Kehtetud', 'true', 'VOID2', 'ApplicationState2', 'Taotluse staatused EIT', 3);


-- REGISTRISSE KANTUD TAOTLUSED

CREATE OR REPLACE VIEW reg_entry_view AS 
 SELECT re.id, p.name AS prod_name, p.org_country_class_id AS prod_org_country_class_id, p.prod_class_id, p.notes AS prod_notes, p.capacity_class_id, p.ethanol_rate, e.name AS pe_name, e.country_class_id AS pe_country_class_id, ae.name AS ae_name, re.valid_from, re.valid_until, re.nr, a.decision_date
   FROM reg_application a
   LEFT JOIN product p ON a.product_id = p.id
   LEFT JOIN enterprise e ON p.producer_subj_id = e.id
   LEFT JOIN enterprise ae ON a.appl_subj_id = ae.id
   LEFT JOIN reg_entry re ON a.regentry_id = re.id
   LEFT JOIN classificator tcl ON a.appl_type_class_id = tcl.id
   LEFT JOIN classificator scl ON a.appl_state_class_id = scl.id
  WHERE tcl.code::text = 'ARE'::text AND scl.code::text = 'RGE'::text AND current_date >= date(re.valid_from) AND current_date <= date(re.valid_until);
  
ALTER TABLE reg_entry_view OWNER TO alkor;
