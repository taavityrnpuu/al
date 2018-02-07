-- DROP VIEW public.searchview_primitive;

CREATE OR REPLACE VIEW public.searchview_primitive AS 
 SELECT
        CASE
            WHEN p.id IS NULL THEN 0::bigint
            ELSE p.id
        END AS product_id,
    p.name AS product_name,
    p.ethanol_rate AS product_ethanol_rate,
    p.code AS product_kn_code,
    p.stocking AS product_has_stocking,
    p.labels_no AS product_number_of_labels,
    p.notes,
    p.front_label AS product_has_front_label,
    p.rear_label AS product_has_rear_label,
    p.neck_label AS product_has_neck_label,
    p.other_label AS product_has_other_label,
        CASE
            WHEN pr.id IS NULL THEN 0::bigint
            ELSE pr.id
        END AS producer_id,
    pr.name AS producer_name,
        CASE
            WHEN a.id IS NULL THEN 0::bigint
            ELSE a.id
        END AS application_id,
    a.nr AS application_nr,
    a.arrived AS application_arrived,
    a.decision_date AS application_decision_date,
    a.exampl_count AS application_examples_nr,
    a.decision_explanation AS application_decision_explanation,
        CASE
            WHEN ap.id IS NULL THEN 0::bigint
            ELSE ap.id
        END AS applicant_id,
    ap.name AS applicant_name,
    ap.reg_id AS applicant_regnr,
    ap.mtr_code AS applicant_mtr_code,
    ap.excise_store_nr AS applicant_excise_store_house_nr,
    ap.ack_nr AS applicant_acknowledgement_nr,
    ap.ack_date AS applicant_acknowledgement_date,
    re.nr AS registry_entry_nr,
    re.valid_from AS registry_entry_valid_from,
    re.valid_until AS registry_entry_valid_until,
        CASE
            WHEN im.id IS NULL THEN 0::bigint
            ELSE im.id
        END AS importer_id,
    im.name AS importer_name,
        CASE
            WHEN ma.id IS NULL THEN 0::bigint
            ELSE ma.id
        END AS marketer_id,
    ma.name AS marketer_name,
        CASE
            WHEN pe.id IS NULL THEN 0::bigint
            ELSE pe.id
        END AS processor_id,
    pe.first_name AS processor_forname,
    pe.last_name AS processor_lastname,
        CASE
            WHEN pa.id IS NULL THEN 0::bigint
            ELSE pa.id
        END AS packager_id,
    pa.name AS packager_name,
    
    ct.code AS prod_class_code,
    cv.code AS capacity_class_code,
    cog.code AS org_country_class_code,
    cpm.code AS packmat_class_code,
    cbs.code AS botshape_class_code,
    cbc.code AS botcol_class_code,
    ccm.code AS crkmat_class_code,
    ccc.code AS crkcol_class_code,
    ccs.code AS crkshape_class_code,
    csc.code AS stockcol_class_code,
    cpc.code AS prod_country_class_code,
    cas.code AS appl_state_class_code,
    cet.code AS entry_dec_class_code,
    
    ct.name AS prod_class_name,
    cv.name AS capacity_class_name,
    cog.name AS org_country_class_name,
    cpm.name AS packmat_class_name,
    cbs.name AS botshape_class_name,
    cbc.name AS botcol_class_name,
    ccm.name AS crkmat_class_name,
    ccc.name AS crkcol_class_name,
    ccs.name AS crkshape_class_name,
    csc.name AS stockcol_class_name,
    cpc.name AS prod_country_class_name,
    cas.name AS appl_state_class_name,
    cet.name AS entry_dec_class_name

   FROM reg_application a
   LEFT JOIN product p ON a.product_id = p.id
   LEFT JOIN enterprise ap ON a.appl_subj_id = ap.id
   LEFT JOIN reg_entry re ON a.regentry_id = re.id
   LEFT JOIN enterprise pr ON p.producer_subj_id = pr.id
   LEFT JOIN enterprise im ON p.importer_subj_id = im.id
   LEFT JOIN enterprise ma ON p.marketer_subj_id = ma.id
   LEFT JOIN enterprise pa ON p.packager_subj_id = pa.id
   LEFT JOIN person pe ON a.process_subj_id = pe.id
   LEFT JOIN classificator ct ON ct.id = p.prod_class_id
   LEFT JOIN classificator cv ON cv.id = p.capacity_class_id
   LEFT JOIN classificator cog ON cog.id = p.org_country_class_id
   LEFT JOIN classificator cpm ON cpm.id = p.packmat_class_id
   LEFT JOIN classificator cbs ON cbs.id = p.botshape_class_id
   LEFT JOIN classificator cbc ON cbc.id = p.botcol_class_id
   LEFT JOIN classificator ccm ON ccm.id = p.crkmat_class_id
   LEFT JOIN classificator ccc ON ccc.id = p.crkcol_class_id
   LEFT JOIN classificator ccs ON ccs.id = p.crkshape_class_id
   LEFT JOIN classificator csc ON csc.id = p.stockcol_class_id
   LEFT JOIN classificator cpc ON cpc.id = pr.country_class_id
   LEFT JOIN classificator cas ON cas.id = a.appl_state_class_id
   LEFT JOIN classificator cet ON cet.id = a.entry_dec_class_id;

ALTER TABLE public.searchview_primitive
  OWNER TO alkor;