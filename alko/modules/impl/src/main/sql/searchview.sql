drop table searchview;
-- View: searchview

-- DROP VIEW searchview;

  CREATE OR REPLACE VIEW searchview AS 
 SELECT 
        CASE
            WHEN p.id IS NULL THEN 0::bigint
            ELSE p.id
        END AS product_id, p.name AS product_name, p.prod_class_id, p.ethanol_rate AS product_ethanol_rate, p.capacity_class_id, p.org_country_class_id, p.code AS product_kn_code, p.stocking AS product_has_stocking, p.packmat_class_id, p.botshape_class_id, p.labels_no AS product_number_of_labels, p.notes, p.botcol_class_id, p.crkmat_class_id, p.crkcol_class_id, p.crkshape_class_id, p.stockcol_class_id, p.front_label AS product_has_front_label, p.rear_label AS product_has_rear_label, p.neck_label AS product_has_neck_label, p.other_label AS product_has_other_label, 
        CASE
            WHEN pr.id IS NULL THEN 0::bigint
            ELSE pr.id
        END AS producer_id, pr.name AS producer_name, pr.country_class_id AS prod_country_class_id, 
        CASE
            WHEN a.id IS NULL THEN 0::bigint
            ELSE a.id
        END AS application_id, a.nr AS application_nr, a.arrived AS application_arrived, a.appl_state_class_id, a.entry_dec_class_id, a.decision_date AS application_decision_date, a.exampl_count AS application_examples_nr, a.decision_explanation AS application_decision_explanation, 
        CASE
            WHEN ap.id IS NULL THEN 0::bigint
            ELSE ap.id
        END AS applicant_id, ap.name AS applicant_name, ap.reg_id AS applicant_regnr, ap.mtr_code AS applicant_mtr_code, ap.excise_store_nr AS applicant_excise_store_house_nr, ap.ack_nr AS applicant_acknowledgement_nr, ap.ack_date AS applicant_acknowledgement_date, re.nr AS registry_entry_nr, re.valid_from AS registry_entry_valid_from, re.valid_until AS registry_entry_valid_until, 
        CASE
            WHEN im.id IS NULL THEN 0::bigint
            ELSE im.id
        END AS importer_id, im.name AS importer_name, 
        CASE
            WHEN ma.id IS NULL THEN 0::bigint
            ELSE ma.id
        END AS marketer_id, ma.name AS marketer_name,
        CASE
            WHEN pe.id IS NULL THEN 0::bigint
            ELSE pe.id
        END AS processor_id, pe.first_name AS processor_forname,pe.last_name as processor_lastname
   FROM reg_application a
   LEFT JOIN product p ON a.product_id = p.id
   LEFT JOIN enterprise ap ON a.appl_subj_id = ap.id
   LEFT JOIN reg_entry re ON a.regentry_id = re.id
   LEFT JOIN enterprise pr ON p.producer_subj_id = pr.id
   LEFT JOIN enterprise im ON p.importer_subj_id = im.id
   LEFT JOIN enterprise ma ON p.marketer_subj_id = ma.id
   LEFT JOIN person pe on a.process_subj_id = pe.id;