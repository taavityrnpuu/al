-- teeme kehtetuks asutused, millel on duplikaadid aga jätame alles viimati lisatud
UPDATE enterprise SET reg_id = reg_id || '_x', active = false WHERE id IN (
	SELECT e.id
	FROM enterprise e
	JOIN (
		SELECT x.reg_id
		FROM enterprise x
		JOIN enterprise y ON x.reg_id = y.reg_id AND x.id != y.id
		WHERE x.reg_id not like '%x%'
		GROUP BY x.reg_id
	) e2 ON e2.reg_id = e.reg_id
	WHERE e.balance = 0 AND e.created != (SELECT MAX(created) FROM enterprise WHERE reg_id = e.reg_id)
);

-- kui viimati lisatud polnud balansiga 0 siis laseme kõik ülejäänud duplikaadiks
UPDATE enterprise SET reg_id = reg_id || '_x', active = false WHERE id IN (
	SELECT e.id
	FROM enterprise e
	JOIN (
		SELECT x.reg_id
		FROM enterprise x
		JOIN enterprise y ON x.reg_id = y.reg_id AND x.id != y.id
		WHERE x.reg_id not like '%x%'
		GROUP BY x.reg_id
	) e2 ON e2.reg_id = e.reg_id
	WHERE e.balance = 0
);

UPDATE enterprise SET balance = balance + (SELECT balance FROM enterprise WHERE id = 4862), change_reason = 'Balanss lisatud juurde (' || (SELECT balance FROM enterprise WHERE id = 4862) || '), kantud üle vana kirje küljest (id 4862)' where id = 20037;
UPDATE enterprise SET active = false, reg_id = reg_id || '_x', balance = 0, change_reason = 'Balanss viidud 0 peale ja raha (' || balance || ') kantud üle uue kirje külge (id 20037)' where id = 4862;

UPDATE enterprise SET balance = balance + (SELECT balance FROM enterprise WHERE id = 13003), change_reason = 'Balanss lisatud juurde (' || (SELECT balance FROM enterprise WHERE id = 13003) || '), kantud üle vana kirje küljest (id 13003)' where id = 25352;
UPDATE enterprise SET active = false, reg_id = reg_id || '_x', balance = 0, change_reason = 'Balanss viidud 0 peale ja raha (' || balance || ') kantud üle uue kirje külge (id 25352)' where id = 13003;

/*
-- "VP Market OÜ" (4862) -> "Maxima Eesti OÜ" (20037) : 10765896
INSERT INTO payment_matching_log (id, created_by, 
		amount, 
		payer_name, 
		reg_nr, 
		payer_enterprise_id, 
		description) 
	VALUES (nextval("payment_matching_log_seq"), 'sys', 
		(SELECT balance FROM enterprise WHERE reg_id = '10765896' AND name = 'VP Market OÜ'), 
		'VP Market OÜ', 
		'10765896', 
		(SELECT id FROM enterprise WHERE reg_id = '10765896' AND name = 'VP Market OÜ'), 
		'Mahakanne aegunud dupliakaat asutuselt, balanss liikus õige nimega asutuse alla: Maxima Eesti OÜ');
INSERT INTO payment_matching_log (id, created_by, 
		amount, 
		payer_name, 
		reg_nr, 
		payer_enterprise_id, 
		description) 
	VALUES (nextval("payment_matching_log_seq"), 'sys', 
		-1*(SELECT balance FROM enterprise WHERE reg_id = '10765896' AND name = 'VP Market OÜ'), 
		'Maxima Eesti OÜ', 
		'10765896', 
		(SELECT id FROM enterprise WHERE reg_id = '10765896' AND name = 'Maxima Eesti OÜ'), 
		'Juurdekanne aegunud dupliakaat asutuselt, balanss liikus vale nimega asutuse alt: VP Market OÜ');

UPDATE enterprise SET balance = balance + (SELECT balance FROM enterprise WHERE reg_id = '10765896' AND name = 'VP Market OÜ') WHERE reg_id = '10765896' AND name = 'Maxima Eesti OÜ';
UPDATE enterprise SET reg_id = reg_id || '_x', balance = 0 WHERE reg_id = '10765896' AND name = 'VP Market OÜ';

-- "Ecotrade AT OÜ" (13003) -> "Austan Loodust Grupp OÜ" (25352) : 11360931
INSERT INTO payment_matching_log (id, created_by, 
		amount, 
		payer_name, 
		reg_nr, 
		payer_enterprise_id, 
		description) 
	VALUES (nextval("payment_matching_log_seq"), 'sys', 
		(SELECT balance FROM enterprise WHERE reg_id = '11360931' AND name = 'Ecotrade AT OÜ'), 
		'Ecotrade AT OÜ', 
		'11360931', 
		(SELECT id FROM enterprise WHERE reg_id = '11360931' AND name = 'Ecotrade AT OÜ'), 
		'Mahakanne aegunud dupliakaat asutuselt, balanss liikus õige nimega asutuse alla: Austan Loodust Grupp OÜ');
INSERT INTO payment_matching_log (id, created_by, 
		amount, 
		payer_name, 
		reg_nr, 
		payer_enterprise_id, 
		description) 
	VALUES (nextval("payment_matching_log_seq"), 'sys', 
		-1*(SELECT balance FROM enterprise WHERE reg_id = '11360931' AND name = 'Ecotrade AT OÜ'), 
		'Austan Loodust Grupp OÜ', 
		'11360931', 
		(SELECT id FROM enterprise WHERE reg_id = '11360931' AND name = 'Austan Loodust Grupp OÜ'), 
		'Juurdekanne aegunud dupliakaat asutuselt, balanss liikus vale nimega asutuse alt: Ecotrade AT OÜ');
		
UPDATE enterprise SET balance = balance + (SELECT balance FROM enterprise WHERE reg_id = '11360931' AND name = 'Ecotrade AT OÜ') WHERE reg_id = '11360931' AND name = 'Austan Loodust Grupp OÜ';
UPDATE enterprise SET reg_id = reg_id || '_x', balance = 0 WHERE reg_id = '11360931' AND name = 'Ecotrade AT OÜ';
*/

-- uue logimise loogika
CREATE TABLE user_authlog (
 id serial primary key,
 id_code varchar(13) NULL,
 created timestamp NOT NULL DEFAULT current_timestamp,
 last_login timestamp NOT NULL DEFAULT current_timestamp 
); 
alter table user_authlog add name varchar(500);
 
CREATE TABLE user_arireg (
 id serial primary key,
 id_code varchar(13) NULL,
 created timestamp NOT NULL DEFAULT current_timestamp,
 reg_nr varchar(10),
 ent_name varchar(500) 
); 
alter table user_arireg add last_checked timestamp not null default current_timestamp;
 
CREATE TABLE user_session (
 id serial primary key,
 id_code varchar(13) NULL,
 reg_nr varchar(10),
 ent_name varchar(500),
 created timestamp NOT NULL DEFAULT current_timestamp,
 valid_until timestamp NOT NULL DEFAULT current_timestamp + (interval '1 minute')
); 

CREATE TABLE enterprise_person_ref(
 id serial primary key, 
 id_code varchar(13) NULL,
 enterprise_id int,
 created_by varchar(13),
 revoked timestamp,
 valid boolean NOT NULL DEFAULT true,
 created timestamp NOT NULL DEFAULT current_timestamp,
 valid_until timestamp DEFAULT NULL,
 CONSTRAINT fk_enterprise FOREIGN KEY (enterprise_id)
      REFERENCES enterprise (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);
alter table enterprise_person_ref add name varchar(500);

CREATE TABLE delete_reason (
 id serial primary key,
 title text NULL,
 note text NULL,
 created timestamp NOT NULL DEFAULT current_timestamp
);
alter table reg_doc add reason text;

--update sys_user  set password = (select password from sys_user where name = 'EIT');

-- taotluse järjekord, koodis lisame sorti
UPDATE classificator SET order_nr = 10 WHERE code = 'ENT' and category = 'ApplicationState';
UPDATE classificator SET order_nr = 20 WHERE code = 'NMO' and category = 'ApplicationState';
UPDATE classificator SET order_nr = 30 WHERE code = 'ADD' and category = 'ApplicationState';
UPDATE classificator SET order_nr = 40 WHERE code = 'CTL' and category = 'ApplicationState';
UPDATE classificator SET order_nr = 50 WHERE code = 'PRO' and category = 'ApplicationState';
UPDATE classificator SET order_nr = 60 WHERE code = 'RGE' and category = 'ApplicationState';
UPDATE classificator SET order_nr = 70 WHERE code = 'REXT' and category = 'ApplicationState';
UPDATE classificator SET order_nr = 80 WHERE code = 'RGN' and category = 'ApplicationState';
UPDATE classificator SET order_nr = 90 WHERE code = 'REXTN' and category = 'ApplicationState';
UPDATE classificator SET order_nr = 100 WHERE code = 'VOID' and category = 'ApplicationState';

-- uus conf tabel
CREATE TABLE config (
 key VARCHAR(200) NOT NULL,
 value text NULL,
 note text NULL,
 created timestamp NOT NULL DEFAULT current_timestamp,
 PRIMARY KEY ( key )
);
ALTER TABLE config ADD type VARCHAR(200);

insert into config(key, value, type, note) VALUES ('DIGIDOCSERVICE_URL','https://tsp.demo.sk.ee', 'DIGIDOC', 'TEKST. Digidoc teenuse url, mille peal toimub allkirjastamine.');
insert into config(key, value, type, note) VALUES ('XTEESERVICE_URL','http://192.168.0.6/cgi-bin/xroad_proxy', 'XTEE_URL', 'TEKST. Turvaserveri url, mille peal toimuvad xtee äriregistri päringud.'); -- 10.2.0.245

insert into config(key, value, type, note) VALUES ('XTEE_PROTOCOL_VERSION','4.0', 'XTEE_PARAMS', 'TEKST. xtee äriregistri päringus väli "protocolVersion"');
insert into config(key, value, type, note) VALUES ('XTEE_ISSUE','Isiku esindatavad asutused alkoholiregistrisse sisse logimiseks', 'XTEE_PARAMS', 'TEKST. xtee äriregistri esinduse päringus väli "issue". Kirjeldab päringu tegemise põhjust.');
insert into config(key, value, type, note) VALUES ('XTEE_XROADINSTANCE','ee-dev', 'XTEE_PARAMS', 'TEKST. xtee äriregistri päringus väli "xRoadInstance"');
insert into config(key, value, type, note) VALUES ('XTEE_MEMBERCLASS','GOV', 'XTEE_PARAMS', 'TEKST. xtee äriregistri päringus väli "memberClass"');
insert into config(key, value, type, note) VALUES ('XTEE_MEMBERCODE','70000310', 'XTEE_PARAMS', 'TEKST. xtee äriregistri päringus väli "memberCode"');
insert into config(key, value, type, note) VALUES ('XTEE_SUBSYSTEMCODE','arireg', 'XTEE_PARAMS', 'TEKST. xtee äriregistri päringus väli "subsystemCode"');
insert into config(key, value, type, note) VALUES ('XTEE_SERVICECODE','esindus_v1', 'XTEE_PARAMS', 'TEKST. xtee äriregistri esinduse päringus väli "serviceCode"');
insert into config(key, value, type, note) VALUES ('XTEE_SERVICEVERSION','v1', 'XTEE_PARAMS', 'TEKST. xtee äriregistri esinduse päringus väli "serviceVersion"');
insert into config(key, value, type, note) VALUES ('XTEE_SENDER_XROADINSTANCE','ee-dev', 'XTEE_PARAMS', 'TEKST. xtee päringus väli "xRoadInstance"');
insert into config(key, value, type, note) VALUES ('XTEE_SENDER_MEMBERCLASS','COM', 'XTEE_PARAMS', 'TEKST. xtee päringus väli "memberClass" ');
insert into config(key, value, type, note) VALUES ('XTEE_SENDER_MEMBERCODE','10126529', 'XTEE_PARAMS', 'TEKST. xtee päringus väli "memberCode"');
insert into config(key, value, type, note) VALUES ('XTEE_SENDER_SUBSYSTEMCODE','alkor2', 'XTEE_PARAMS', 'TEKST. xtee päringus väli "subsystemCode"');

insert into config(key, value, type, note) VALUES ('XTEE_ISSUE_DETAIL','Asutuse detailandmete uuendamiseks nende pärimine alkoholiregistris', 'XTEE_PARAMS', 'TEKST. xtee äriregistri detailandmete päringus väli "issue". Kirjeldab päringu tegemise põhjust.');
insert into config(key, value, type, note) VALUES ('XTEE_SERVICECODE_DETAIL','detailandmed_v1', 'XTEE_PARAMS', 'TEKST. xtee äriregistri detailandmete päringus väli "serviceCode"');
insert into config(key, value, type, note) VALUES ('XTEE_SERVICEVERSION_DETAIL','v1', 'XTEE_PARAMS', 'TEKST. xtee äriregistri detailandmete päringus väli "serviceVersion"');

insert into config(key, value, type, note) VALUES ('XTEESERVICE_URL_MTR','http://192.168.0.6/cgi-bin/xroad_proxy', 'XTEE_URL', 'TEKST. Turvaserveri url, mille peal toimuvad xtee mtr päringud.'); -- 10.2.0.245
insert into config(key, value, type, note) VALUES ('XTEE_ISSUE_MTR','Asutuse tegevuslubade uuendamiseks nende pärimine alkoholiregistris', 'XTEE_PARAMS', 'TEKST. xtee mtr registreeringu päringus väli "issue". Kirjeldab päringu tegemise põhjust.');
insert into config(key, value, type, note) VALUES ('XTEE_SERVICECODE_MTR','registreering', 'XTEE_PARAMS', 'TEKST. xtee mtr registreeringu päringus väli "serviceCode"');
insert into config(key, value, type, note) VALUES ('XTEE_SERVICEVERSION_MTR','v1', 'XTEE_PARAMS', 'TEKST. xtee mtr registreeringu päringus väli "serviceVersion"');
insert into config(key, value, type, note) VALUES ('XTEE_SUBSYSTEMCODE_MTR','mtr', 'XTEE_PARAMS', 'TEKST. xtee mtr registreeringu päringus väli "subsystemCode"');
insert into config(key, value, type, note) VALUES ('XTEE_MEMBERCODE_MTR','70003158', 'XTEE_PARAMS', 'TEKST. xtee mtr registreeringu päringus väli "memberCode"');
insert into config(key, value, type, note) VALUES ('XTEE_XROADINSTANCE_MTR','ee-test', 'XTEE_PARAMS', 'TEKST. xtee mtr registreeringu päringus väli "xRoadInstance"');
insert into config(key, value, type, note) VALUES ('XTEE_MEMBERCLASS_MTR','COM', 'XTEE_PARAMS', 'TEKST. xtee mtr registreeringu päringus väli "memberClass"');

insert into config(key, value, type, note) VALUES ('APPL_SAVE_EXTEND_DAYS','1', 'APPLICATION', 'NUMBER (võib olla ka negatiivne). Päevade arv. VTA saab salvestada pikendamise taotlust enne aegumist.');



update enterprise set ent_repr_subj_id = null;

CREATE TABLE config_history (
 created timestamp NOT NULL DEFAULT current_timestamp,
 created_by VARCHAR(200) NULL,
 key VARCHAR(200) NULL,
 previous_value text NULL
); 

DROP VIEW public.report_view;
CREATE OR REPLACE VIEW public.report_view AS 
    SELECT list.id, list.report_ent_id, list.load_enterprise_id, ent.name, ent.reg_id, ent.phone, ent.mobile, ent.email, ent.fax, list.created, list.report_date, list.load_person_id,   
   (SELECT count(*) FROM product_move_report_record rw WHERE rw.report_id = list.id) as total
           FROM product_move_report list
    JOIN enterprise ent ON list.report_ent_id = ent.id;

update enterprise set version = 1 where version is null or version = 0;
    
INSERT INTO enterprise_role (id, version, ent_role_id, enterprise_id) 
select nextval('enterprise_role_seq'), 0, (SELECT id FROM classificator WHERE category = 'EnterpriseRole' AND code = 'APL'), e.id
from enterprise e 
left outer join enterprise_role r on e.id = r.enterprise_id AND r.ent_role_id = 260
where r.id is null and e.active = true and (e.reg_id is not null AND e.reg_id not like '%x%');


select setval('ENTERPRISE_SEQ', (SELECT MAX(id) FROM enterprise) + 1 ,true);

DROP VIEW public.report_view;

CREATE OR REPLACE VIEW public.report_view AS 
 SELECT list.id,
    list.report_ent_id,
    list.load_enterprise_id,
    ent.name,
    ent.reg_id,
    ent.phone,
    ent.mobile,
    ent.email,
    ent.fax,
    list.created,
    list.report_date,
    list.load_person_id,
    COALESCE(ent.phone || ',', '') || COALESCE(ent.mobile || ',', '') || COALESCE(ent.email || ',', '') || COALESCE(ent.fax, '') as contacts,
    date_part('year', list.report_date) || ', ' || date_part('month', list.report_date)  as period,
    ( SELECT count(*) AS count
           FROM product_move_report_record rw
          WHERE rw.report_id = list.id) AS total
   FROM product_move_report list
     JOIN enterprise ent ON list.report_ent_id = ent.id;


--CREATE OR REPLACE FUNCTION set_sys_user_passwords() 
--RETURNS trigger AS $$
--    BEGIN
--	update sys_user set password = '2f13cd3806cd4889ad3';
--	return NEW;
--    END;
--$$ LANGUAGE plpgsql;
--
--CREATE TRIGGER sys_user_update_password 
--AFTER UPDATE OF name OR INSERT ON sys_user
--FOR EACH ROW EXECUTE PROCEDURE set_sys_user_passwords();


delete from user_group where grp_class_id = 603 and user_id != (select id from sys_user where person_id = 100000);

alter table classificator add order_nr_vta integer null;

UPDATE classificator SET order_nr_vta = 10 WHERE code = 'ADD' and category = 'ApplicationState';
UPDATE classificator SET order_nr_vta = 20 WHERE code = 'CTL' and category = 'ApplicationState';
UPDATE classificator SET order_nr_vta = 30 WHERE code = 'NMO' and category = 'ApplicationState';
UPDATE classificator SET order_nr_vta = 40 WHERE code = 'PRO' and category = 'ApplicationState';
UPDATE classificator SET order_nr_vta = 50 WHERE code = 'RGE' and category = 'ApplicationState';
UPDATE classificator SET order_nr_vta = 60 WHERE code = 'REXT' and category = 'ApplicationState';
UPDATE classificator SET order_nr_vta = 70 WHERE code = 'RGN' and category = 'ApplicationState';
UPDATE classificator SET order_nr_vta = 80 WHERE code = 'REXTN' and category = 'ApplicationState';
UPDATE classificator SET order_nr_vta = 90 WHERE code = 'VOID' and category = 'ApplicationState';
UPDATE classificator SET order_nr_vta = 100 WHERE code = 'ENT' and category = 'ApplicationState';



insert into config(key, value, type, note) VALUES ('CAS_LOGIN_URL','https://cas.agri.ee/epm-cas/login?iframeLogin=1', 'cas_urls', 'TEKST. CAS i-frame sisse logimise URL');
insert into config(key, value, type, note) VALUES ('CAS_BACK_URL','https://192.168.0.37:8443/caslogin', 'cas_urls', 'TEKST. Alkori keskkonna URL, vajalik CAS sisse logimisel');
insert into config(key, value, type, note) VALUES ('CAS_LOGOUT_URL','https://cas.agri.ee/epm-cas/logout', 'cas_urls', 'TEKST. CAS välja logimise URL');

insert into config(key, value, type, note) VALUES ('EMAIL_FROM_MAIL','noreply@alkoreg.agri.ee', 'email', 'TEKST. Kasutaja registreerimine, kellelt saadetakse e-mail');
insert into config(key, value, type, note) VALUES ('EMAIL_SMTP_HOST','mail.neti.ee', 'email', 'TEKST. Kasutaja registreerimine, SMTP host');
insert into config(key, value, type, note) VALUES ('EMAIL_BASE_URL','https://192.168.0.37:8443/', 'email', 'TEKST. Kasutaja registreerimine, baas link kuhu kasutaja suunatakse enda kinnitamiseks');


DROP VIEW public.searchview;

ALTER TABLE reg_application ALTER COLUMN decision_explanation TYPE text;
ALTER TABLE reg_application ALTER COLUMN extend_until_decision_explanation TYPE text;

ALTER TABLE reg_application_history ALTER COLUMN decision_explanation TYPE text;
ALTER TABLE reg_application_history ALTER COLUMN extend_until_decision_explanation TYPE text;

CREATE OR REPLACE VIEW public.searchview AS 
 SELECT
        CASE
            WHEN p.id IS NULL THEN 0::bigint
            ELSE p.id
        END AS product_id,
    p.name AS product_name,
    p.prod_class_id,
    p.ethanol_rate AS product_ethanol_rate,
    p.capacity_class_id,
    p.org_country_class_id,
    p.code AS product_kn_code,
    p.stocking AS product_has_stocking,
    p.packmat_class_id,
    p.botshape_class_id,
    p.labels_no AS product_number_of_labels,
    p.notes,
    p.botcol_class_id,
    p.crkmat_class_id,
    p.crkcol_class_id,
    p.crkshape_class_id,
    p.stockcol_class_id,
    p.front_label AS product_has_front_label,
    p.rear_label AS product_has_rear_label,
    p.neck_label AS product_has_neck_label,
    p.other_label AS product_has_other_label,
        CASE
            WHEN pr.id IS NULL THEN 0::bigint
            ELSE pr.id
        END AS producer_id,
    pr.name AS producer_name,
    pr.country_class_id AS prod_country_class_id,
        CASE
            WHEN a.id IS NULL THEN 0::bigint
            ELSE a.id
        END AS application_id,
    a.nr AS application_nr,
    a.arrived AS application_arrived,
    a.appl_state_class_id,
    a.entry_dec_class_id,
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
    pa.name AS packager_name
   FROM reg_application a
     LEFT JOIN product p ON a.product_id = p.id
     LEFT JOIN enterprise ap ON a.appl_subj_id = ap.id
     LEFT JOIN reg_entry re ON a.regentry_id = re.id
     LEFT JOIN enterprise pr ON p.producer_subj_id = pr.id
     LEFT JOIN enterprise im ON p.importer_subj_id = im.id
     LEFT JOIN enterprise ma ON p.marketer_subj_id = ma.id
     LEFT JOIN enterprise pa ON p.packager_subj_id = pa.id
     LEFT JOIN person pe ON a.process_subj_id = pe.id;
     
     
update reg_doc set name = replace(name, '(asic)', '(asice)') where name like '%(asic)%';
update reg_doc_history set name = replace(name, '(asic)', '(asice)') where name like '%(asic)%';


UPDATE enterprise SET reg_id = replace(reg_id, '_x', '') WHERE id in (
	select MAX(e.id) 
	from enterprise e
	left outer join enterprise e2 on e.reg_id = e2.reg_id || '_x'
	where e.reg_id like '%x' AND e2.id is null
	GROUP BY e.reg_id
) -- teeme korda reg_id sellistel asutustel mida on _x koodiga aga mida pole olemas õige koodiga
     
---- payment_matching_log
-- enterprise_binded_to

ALTER TABLE payment_matching_log ADD prev_enterprise_binded_to BIGINT NULL;
UPDATE payment_matching_log SET prev_enterprise_binded_to = enterprise_binded_to;

UPDATE payment_matching_log AS o SET enterprise_binded_to = e2.id
FROM payment_matching_log AS s
JOIN enterprise e ON e.id = s.enterprise_binded_to
JOIN enterprise e2 ON e2.reg_id || '_x' = e.reg_id
WHERE e.reg_id like '%x' AND o.id = s.id;


---- product
-- producer_subj_id
-- packager_subj_id
-- marketer_subj_id
-- importer_subj_id

ALTER TABLE product ADD prev_producer_subj_id BIGINT NULL;
ALTER TABLE product ADD prev_packager_subj_id BIGINT NULL;
ALTER TABLE product ADD prev_marketer_subj_id BIGINT NULL;
ALTER TABLE product ADD prev_importer_subj_id BIGINT NULL;
UPDATE product SET prev_producer_subj_id = producer_subj_id;
UPDATE product SET prev_packager_subj_id = packager_subj_id;
UPDATE product SET prev_marketer_subj_id = marketer_subj_id;
UPDATE product SET prev_importer_subj_id = importer_subj_id;

UPDATE product AS o SET producer_subj_id = e2.id
FROM product AS s
JOIN enterprise e ON e.id = s.producer_subj_id
JOIN enterprise e2 ON e2.reg_id || '_x' = e.reg_id
WHERE e.reg_id like '%x' AND o.id = s.id;

UPDATE product AS o SET packager_subj_id = e2.id
FROM product AS s
JOIN enterprise e ON e.id = s.packager_subj_id
JOIN enterprise e2 ON e2.reg_id || '_x' = e.reg_id
WHERE e.reg_id like '%x' AND o.id = s.id;

UPDATE product AS o SET marketer_subj_id = e2.id
FROM product AS s
JOIN enterprise e ON e.id = s.marketer_subj_id
JOIN enterprise e2 ON e2.reg_id || '_x' = e.reg_id
WHERE e.reg_id like '%x' AND o.id = s.id;

UPDATE product AS o SET importer_subj_id = e2.id
FROM product AS s
JOIN enterprise e ON e.id = s.importer_subj_id
JOIN enterprise e2 ON e2.reg_id || '_x' = e.reg_id
WHERE e.reg_id like '%x' AND o.id = s.id;


---- product_move_report
-- load_enterprise_id
-- report_ent_id

ALTER TABLE product_move_report ADD prev_load_enterprise_id character varying(40) NULL;
ALTER TABLE product_move_report ADD prev_report_ent_id BIGINT NULL;
UPDATE product_move_report SET prev_load_enterprise_id = load_enterprise_id;
UPDATE product_move_report SET prev_report_ent_id = report_ent_id;

UPDATE product_move_report AS o SET load_enterprise_id = e2.id
FROM product_move_report AS s
JOIN enterprise e ON e.reg_id = s.load_enterprise_id
JOIN enterprise e2 ON e2.reg_id || '_x' = e.reg_id
WHERE e.reg_id like '%x' AND o.id = s.id;

UPDATE product_move_report AS o SET report_ent_id = e2.id
FROM product_move_report AS s
JOIN enterprise e ON e.id = s.report_ent_id
JOIN enterprise e2 ON e2.reg_id || '_x' = e.reg_id
WHERE e.reg_id like '%x' AND o.id = s.id;

---- reg_application
-- appl_subj_id

ALTER TABLE reg_application ADD prev_appl_subj_id BIGINT NULL;
UPDATE reg_application SET prev_appl_subj_id = appl_subj_id;

UPDATE reg_application AS o SET appl_subj_id = e2.id
FROM reg_application AS s
JOIN enterprise e ON e.id = s.appl_subj_id
JOIN enterprise e2 ON e2.reg_id || '_x' = e.reg_id
WHERE e.reg_id like '%x' AND o.id = s.id;

---- reg_payment
-- payer_enterprise_id

ALTER TABLE reg_payment ADD prev_payer_enterprise_id BIGINT NULL;
UPDATE reg_payment SET prev_payer_enterprise_id = payer_enterprise_id;

UPDATE reg_payment AS o SET payer_enterprise_id = e2.id
FROM reg_payment AS s
JOIN enterprise e ON e.id = s.payer_enterprise_id
JOIN enterprise e2 ON e2.reg_id || '_x' = e.reg_id
WHERE e.reg_id like '%x' AND o.id = s.id;

---- reg_payment_log
-- payer_enterprise_id

ALTER TABLE reg_payment_log ADD prev_payer_enterprise_id BIGINT NULL;
UPDATE reg_payment_log SET prev_payer_enterprise_id = payer_enterprise_id;

UPDATE reg_payment_log AS o SET payer_enterprise_id = e2.id
FROM reg_payment_log AS s
JOIN enterprise e ON e.id = s.payer_enterprise_id
JOIN enterprise e2 ON e2.reg_id || '_x' = e.reg_id
WHERE e.reg_id like '%x' AND o.id = s.id;



--ALTER TABLE reg_application ALTER COLUMN decision_explanation TYPE character varying(100000);
--ALTER TABLE reg_application ALTER COLUMN extend_until_decision_explanation TYPE character varying(100000);

-- TESTIS baasi taastamisel
-- GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA public TO alkor;

-- MEIE TESTIS baasi taastamisel
-- update person set reg_id = '48707262221' where id = 5152;
-- update person set reg_id = '48012300041' where id = 5153;


