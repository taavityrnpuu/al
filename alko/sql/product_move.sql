alter table PRODUCT_MOVE_REPORT add REPORT_DATE date;
CREATE INDEX PRODUCT_MOVE_REP_DATE ON PRODUCT_MOVE_REPORT (REPORT_DATE);
update PRODUCT_MOVE_REPORT set REPORT_DATE = to_date((select r.REP_YEAR||'-'||c.code||'-1' from PRODUCT_MOVE_REPORT r, classificator c where c.id =r.MONTH_CLASS_ID and r.id=PRODUCT_MOVE_REPORT.id),'YYYY-MM-DD');

alter table PRODUCT_MOVE_REPORT_HISTORY add REPORT_DATE date;
update PRODUCT_MOVE_REPORT_HISTORY set REPORT_DATE = to_date((select r.REP_YEAR||'-'||c.code||'-1' from PRODUCT_MOVE_REPORT r, classificator c where c.id =r.MONTH_CLASS_ID and r.id=PRODUCT_MOVE_REPORT_HISTORY.id),'YYYY-MM-DD');

DROP VIEW report_list_view;

CREATE OR REPLACE VIEW report_list_view AS 
 SELECT apl.id AS apl_id, apl.product_id AS apl_product_id, list.nr, list.id, list.created, list.amount, list.receiver, list.party_nr, list.market_place, list.market_addr, list.market_distr, list.market_orgunit, list.regentry_id, list.report_id, list.report_date, list.reporting_ent, list.reporting_ent_reg_id, apl.name, apl.prod_class_id AS product_class_id, apl.org_country_class_id AS product_orig_country_class_id, apl.country_class_id AS producer_country_class_id, apl.ent_name AS producer_name
   FROM ( SELECT reg.nr, rep.id, rep.created, rep.amount, rep.receiver, rep.party_nr, rep.market_place, rep.market_addr, rep.market_distr, rep.market_orgunit, rep.regentry_id, rep.report_id,rec.report_date, ent.name AS reporting_ent, ent.reg_id AS reporting_ent_reg_id
           FROM product_move_report_record rep
      LEFT JOIN reg_entry reg ON rep.regentry_id = reg.id
   LEFT JOIN product_move_report rec ON rep.report_id = rec.id
   LEFT JOIN enterprise ent ON rec.report_ent_id = ent.id) list
   LEFT JOIN ( SELECT reg.regentry_id, reg.id, reg.product_id, prod.name, prod.prod_class_id, prod.org_country_class_id, ent.country_class_id, ent.name AS ent_name
           FROM reg_application reg
      LEFT JOIN product prod ON reg.product_id = prod.id
   LEFT JOIN enterprise ent ON prod.producer_subj_id = ent.id
  WHERE reg.id = prod.appl_id) apl ON apl.regentry_id = list.regentry_id;

ALTER TABLE report_list_view OWNER TO alkor;

DROP VIEW report_view;

CREATE OR REPLACE VIEW report_view AS 
 SELECT list.id, list.report_ent_id, list.load_enterprise_id, ent.name, ent.reg_id, ent.phone, ent.mobile, ent.email, ent.fax, list.created, list.report_date, list.load_person_id, list.total
   FROM ( SELECT rep.id, rep.created, rep.load_enterprise_id, rep.load_person_id, rep.report_date, rep.report_ent_id, rec.total
           FROM product_move_report rep
      LEFT JOIN ( SELECT product_move_report_record.report_id, count(*) AS total
                   FROM product_move_report_record
                  GROUP BY product_move_report_record.report_id) rec ON rep.id = rec.report_id) list
   LEFT JOIN enterprise ent ON list.report_ent_id = ent.id;

ALTER TABLE report_view OWNER TO alkor;

/*alter table PRODUCT_MOVE_REPORT drop REP_YEAR;
alter table PRODUCT_MOVE_REPORT drop MONTH_CLASS_ID;
alter table PRODUCT_MOVE_REPORT_HISTORY drop REP_YEAR;
alter table PRODUCT_MOVE_REPORT_HISTORY drop REP_MONTH;

live 28.11.2011 seisuga:

CREATE OR REPLACE VIEW report_list_view AS 
 SELECT apl.id AS apl_id, apl.product_id AS apl_product_id, list.nr, list.id, list.created, list.amount, list.receiver, list.party_nr, list.market_place, list.market_addr, list.market_distr, list.market_orgunit, list.regentry_id, list.report_id, list.report_month, list.rep_year, list.reporting_ent, list.reporting_ent_reg_id, apl.name, apl.prod_class_id AS product_class_id, apl.org_country_class_id AS product_orig_country_class_id, apl.country_class_id AS producer_country_class_id, apl.ent_name AS producer_name
   FROM ( SELECT reg.nr, rep.id, rep.created, rep.amount, rep.receiver, rep.party_nr, rep.market_place, rep.market_addr, rep.market_distr, rep.market_orgunit, rep.regentry_id, rep.report_id, rec.month_class_id AS report_month, rec.rep_year, ent.name AS reporting_ent, ent.reg_id AS reporting_ent_reg_id
           FROM product_move_report_record rep
      LEFT JOIN reg_entry reg ON rep.regentry_id = reg.id
   LEFT JOIN product_move_report rec ON rep.report_id = rec.id
   LEFT JOIN enterprise ent ON rec.report_ent_id = ent.id) list
   LEFT JOIN ( SELECT reg.regentry_id, reg.id, reg.product_id, prod.name, prod.prod_class_id, prod.org_country_class_id, ent.country_class_id, ent.name AS ent_name
           FROM reg_application reg
      LEFT JOIN product prod ON reg.product_id = prod.id
   LEFT JOIN enterprise ent ON prod.producer_subj_id = ent.id
  WHERE reg.id = prod.appl_id) apl ON apl.regentry_id = list.regentry_id;

ALTER TABLE report_list_view OWNER TO alkor;

-----------
live 28.11.2011 seisuga:

CREATE OR REPLACE VIEW report_view AS 
 SELECT list.id, list.report_ent_id, list.load_enterprise_id, ent.name, ent.reg_id, ent.phone, ent.mobile, ent.email, ent.fax, list.created, list.rep_year, list.month_class_id, list.load_person_id, list.total
   FROM ( SELECT rep.id, rep.created, rep.load_enterprise_id, rep.load_person_id, rep.rep_year, rep.month_class_id, rep.report_ent_id, rec.total
           FROM product_move_report rep
      LEFT JOIN ( SELECT product_move_report_record.report_id, count(*) AS total
                   FROM product_move_report_record
                  GROUP BY product_move_report_record.report_id) rec ON rep.id = rec.report_id) list
   LEFT JOIN enterprise ent ON list.report_ent_id = ent.id;

ALTER TABLE report_view OWNER TO alkor;



*/