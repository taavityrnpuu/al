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

insert into config(key, value, type, note) VALUES ('DIGIDOCSERVICE_URL','https://digidocservice.sk.ee', 'DIGIDOC', 'TEKST. Digidoc teenuse url, mille peal toimub allkirjastamine.');
insert into config(key, value, type, note) VALUES ('XTEESERVICE_URL','http://10.2.0.244/cgi-bin/xroad_proxy', 'XTEE_URL', 'TEKST. Turvaserveri url, mille peal toimuvad xtee äriregistri päringud.'); -- 10.2.0.245

insert into config(key, value, type, note) VALUES ('XTEE_PROTOCOL_VERSION','4.0', 'XTEE_PARAMS', 'TEKST. xtee äriregistri päringus väli "protocolVersion"');
insert into config(key, value, type, note) VALUES ('XTEE_ISSUE','Isiku esindatavad asutused alkoholiregistrisse sisse logimiseks', 'XTEE_PARAMS', 'TEKST. xtee äriregistri esinduse päringus väli "issue". Kirjeldab päringu tegemise põhjust.');
insert into config(key, value, type, note) VALUES ('XTEE_XROADINSTANCE','ee-test', 'XTEE_PARAMS', 'TEKST. xtee äriregistri päringus väli "xRoadInstance"');
insert into config(key, value, type, note) VALUES ('XTEE_MEMBERCLASS','GOV', 'XTEE_PARAMS', 'TEKST. xtee äriregistri päringus väli "memberClass"');
insert into config(key, value, type, note) VALUES ('XTEE_MEMBERCODE','70000310', 'XTEE_PARAMS', 'TEKST. xtee äriregistri päringus väli "memberCode"');
insert into config(key, value, type, note) VALUES ('XTEE_SUBSYSTEMCODE','arireg', 'XTEE_PARAMS', 'TEKST. xtee äriregistri päringus väli "subsystemCode"');
insert into config(key, value, type, note) VALUES ('XTEE_SERVICECODE','esindus_v1', 'XTEE_PARAMS', 'TEKST. xtee äriregistri esinduse päringus väli "serviceCode"');
insert into config(key, value, type, note) VALUES ('XTEE_SERVICEVERSION','v1', 'XTEE_PARAMS', 'TEKST. xtee äriregistri esinduse päringus väli "serviceVersion"');
insert into config(key, value, type, note) VALUES ('XTEE_SENDER_XROADINSTANCE','ee-test', 'XTEE_PARAMS', 'TEKST. xtee päringus väli "xRoadInstance"');
insert into config(key, value, type, note) VALUES ('XTEE_SENDER_MEMBERCLASS','GOV', 'XTEE_PARAMS', 'TEKST. xtee päringus väli "memberClass" ');
insert into config(key, value, type, note) VALUES ('XTEE_SENDER_MEMBERCODE','70000734', 'XTEE_PARAMS', 'TEKST. xtee päringus väli "memberCode"');
insert into config(key, value, type, note) VALUES ('XTEE_SENDER_SUBSYSTEMCODE','alkor2', 'XTEE_PARAMS', 'TEKST. xtee päringus väli "subsystemCode"');

insert into config(key, value, type, note) VALUES ('XTEE_ISSUE_DETAIL','Asutuse detailandmete uuendamiseks nende pärimine alkoholiregistris', 'XTEE_PARAMS', 'TEKST. xtee äriregistri detailandmete päringus väli "issue". Kirjeldab päringu tegemise põhjust.');
insert into config(key, value, type, note) VALUES ('XTEE_SERVICECODE_DETAIL','detailandmed_v1', 'XTEE_PARAMS', 'TEKST. xtee äriregistri detailandmete päringus väli "serviceCode"');
insert into config(key, value, type, note) VALUES ('XTEE_SERVICEVERSION_DETAIL','v1', 'XTEE_PARAMS', 'TEKST. xtee äriregistri detailandmete päringus väli "serviceVersion"');

insert into config(key, value, type, note) VALUES ('XTEESERVICE_URL_MTR','http://10.2.0.244/cgi-bin/xroad_proxy', 'XTEE_URL', 'TEKST. Turvaserveri url, mille peal toimuvad xtee mtr päringud.'); -- 10.2.0.245
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

delete from user_group where grp_class_id = 603 and user_id != (select id from sys_user where person_id = 100000)

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
insert into config(key, value, type, note) VALUES ('CAS_BACK_URL','https://10.2.0.194:8443/caslogin', 'cas_urls', 'TEKST. Alkori keskkonna URL, vajalik CAS sisse logimisel');
insert into config(key, value, type, note) VALUES ('CAS_LOGOUT_URL','https://cas.agri.ee/epm-cas/logout', 'cas_urls', 'TEKST. CAS välja logimise URL');


UPDATE sys_user SET password = 'decc8686654b465e531' WHERE id = 3;
UPDATE sys_user SET password = '3530b70a8ad856cbad1' WHERE id = 127;
UPDATE sys_user SET password = '85760c213b3578cb66e' WHERE id = 173;
UPDATE sys_user SET password = 'c3876863ef3b9af43c8' WHERE id = 164;
UPDATE sys_user SET password = 'ec0f2ada4308d1a1f6d' WHERE id = 169;
UPDATE sys_user SET password = 'a90af05a0af1441ed60' WHERE id = 140;
UPDATE sys_user SET password = '2e5983745f70038dba5' WHERE id = 171;
UPDATE sys_user SET password = '0cd1876e06c3d20a2a7' WHERE id = 172;
UPDATE sys_user SET password = '3493a735ffd9cae4565' WHERE id = 174;
UPDATE sys_user SET password = '774bc6cd85317215a3c' WHERE id = 175;
UPDATE sys_user SET password = '6b8555a44eb82f498d6' WHERE id = 12;
UPDATE sys_user SET password = '82f638aa464ff548844' WHERE id = 13;
UPDATE sys_user SET password = '0717a136f6189f67e8e' WHERE id = 15;
UPDATE sys_user SET password = '2b66bc105814feae63c' WHERE id = 18;
UPDATE sys_user SET password = '4b9d3eae489df06604a' WHERE id = 21;
UPDATE sys_user SET password = '642b63b9433fed27d4c' WHERE id = 22;
UPDATE sys_user SET password = 'c0670c766dbb8f18382' WHERE id = 23;
UPDATE sys_user SET password = 'e0ecc620ceab63643d1' WHERE id = 24;
UPDATE sys_user SET password = '8b7a1402c919cc6da65' WHERE id = 25;
UPDATE sys_user SET password = '43cc5c9def52d75c92b' WHERE id = 27;
UPDATE sys_user SET password = '9ac3ee7746a9d9c96e0' WHERE id = 29;
UPDATE sys_user SET password = '55f4a076d3c9cff0f6e' WHERE id = 30;
UPDATE sys_user SET password = '035b056e203fcc91020' WHERE id = 31;
UPDATE sys_user SET password = '4ccbef4b5e9eece5bc2' WHERE id = 32;
UPDATE sys_user SET password = '4871fedb2a7b5bbefea' WHERE id = 33;
UPDATE sys_user SET password = '3a556fd679ec998852c' WHERE id = 34;
UPDATE sys_user SET password = '1bcbcdb1b2488a8c6d5' WHERE id = 35;
UPDATE sys_user SET password = 'cef11283d0aa3f348b2' WHERE id = 38;
UPDATE sys_user SET password = '664bb99f023cad27fff' WHERE id = 42;
UPDATE sys_user SET password = '2be4c4c84e63d6c15b0' WHERE id = 43;
UPDATE sys_user SET password = '2432d9e83a2cb658fad' WHERE id = 45;
UPDATE sys_user SET password = '1771ea4c84c984cee18' WHERE id = 46;
UPDATE sys_user SET password = '4defe9a9804bfb94a55' WHERE id = 47;
UPDATE sys_user SET password = '90ea9e9ea90c5987ba1' WHERE id = 54;
UPDATE sys_user SET password = 'ecb81f483b29452d57a' WHERE id = 56;
UPDATE sys_user SET password = '2ae2cd952fe4a6905c5' WHERE id = 58;
UPDATE sys_user SET password = 'b175187e5e6d6f8d43b' WHERE id = 59;
UPDATE sys_user SET password = '7a809528bdaa39dd728' WHERE id = 61;
UPDATE sys_user SET password = '2e0d7c7a1f5cce50240' WHERE id = 166;
UPDATE sys_user SET password = '8efca2fbe5e88363432' WHERE id = 62;
UPDATE sys_user SET password = '636a0dafb396fdf081c' WHERE id = 63;
UPDATE sys_user SET password = 'f982ea9c4d457caa8b3' WHERE id = 64;
UPDATE sys_user SET password = 'f09ffe824e86aa421e2' WHERE id = 66;
UPDATE sys_user SET password = 'a39da6b3d72934fece4' WHERE id = 67;
UPDATE sys_user SET password = '6f0e554d61c1bd98591' WHERE id = 69;
UPDATE sys_user SET password = 'f0457786a50976a0be8' WHERE id = 70;
UPDATE sys_user SET password = '657ec782148192d0fdd' WHERE id = 76;
UPDATE sys_user SET password = 'f0045f4454c2b369a61' WHERE id = 80;
UPDATE sys_user SET password = 'aacbbaa2df64d38219f' WHERE id = 81;
UPDATE sys_user SET password = '8026e77d5dd135c1502' WHERE id = 83;
UPDATE sys_user SET password = 'f6e7df9fd87fa56367d' WHERE id = 84;
UPDATE sys_user SET password = '5bc2fbaf06ec97db33c' WHERE id = 88;
UPDATE sys_user SET password = '4d6a7babacc1cb6392d' WHERE id = 89;
UPDATE sys_user SET password = 'a677cb493aa342644f9' WHERE id = 92;
UPDATE sys_user SET password = '1328067fee833a892d4' WHERE id = 82;
UPDATE sys_user SET password = '80297a822f06b6de2d4' WHERE id = 71;
UPDATE sys_user SET password = '756ec3d81084afe2a42' WHERE id = 74;
UPDATE sys_user SET password = '817688e8fc87e23cc40' WHERE id = 77;
UPDATE sys_user SET password = '0a7287d394a728f5fc4' WHERE id = 79;
UPDATE sys_user SET password = 'e9837f2c185838931ac' WHERE id = 86;
UPDATE sys_user SET password = '44bb93ba85e3b4c185f' WHERE id = 87;
UPDATE sys_user SET password = '5d0fbbb63e5c9dbd067' WHERE id = 90;
UPDATE sys_user SET password = '1e205e91dfbc8428569' WHERE id = 91;
UPDATE sys_user SET password = 'cfaca58fc68d9c42cff' WHERE id = 14;
UPDATE sys_user SET password = '18f36f012afeea94edb' WHERE id = 99;
UPDATE sys_user SET password = '759ff8c55bbe24540b2' WHERE id = 101;
UPDATE sys_user SET password = '6da41593020b4c2ef0c' WHERE id = 102;
UPDATE sys_user SET password = '5dcb0a2afc616f9dae0' WHERE id = 119;
UPDATE sys_user SET password = '2e068abc9f0519bd0c5' WHERE id = 121;
UPDATE sys_user SET password = '96d58d53ce371935999' WHERE id = 5;
UPDATE sys_user SET password = '1765e297d0efb97e551' WHERE id = 16;
UPDATE sys_user SET password = 'ddb521ea4f672359081' WHERE id = 124;
UPDATE sys_user SET password = '7367b034a93774245ff' WHERE id = 125;
UPDATE sys_user SET password = 'c7a3284df9df86eab44' WHERE id = 126;
UPDATE sys_user SET password = 'e7b571862186a0f51e0' WHERE id = 123;
UPDATE sys_user SET password = '79971e479b2ac4b2553' WHERE id = 128;
UPDATE sys_user SET password = '38f3310c9e1470673c0' WHERE id = 98;
UPDATE sys_user SET password = 'd3dbb533ebe6aa72ef9' WHERE id = 132;
UPDATE sys_user SET password = 'decc8686654b465e531' WHERE id = 4;
UPDATE sys_user SET password = 'f8cab49fb2e4d8f4856' WHERE id = 106;
UPDATE sys_user SET password = '324751abf302dd24727' WHERE id = 133;
UPDATE sys_user SET password = 'd5fd0b0fb9c48b2d0f8' WHERE id = 136;
UPDATE sys_user SET password = '2e88573584b5a1c1793' WHERE id = 137;
UPDATE sys_user SET password = 'b300802d63f2dc5a079' WHERE id = 28;
UPDATE sys_user SET password = '74e258d8c9854007354' WHERE id = 107;
UPDATE sys_user SET password = '779aeeb888d7992c53c' WHERE id = 138;
UPDATE sys_user SET password = 'b353a325e576025416f' WHERE id = 142;
UPDATE sys_user SET password = '915d9de24793d91585f' WHERE id = 8;
UPDATE sys_user SET password = 'b8e37ff0a7d7921e42a' WHERE id = 97;
UPDATE sys_user SET password = '8fc0de4314e1c2b5a1e' WHERE id = 17;
UPDATE sys_user SET password = '2f9e271f34a915c8d10' WHERE id = 72;
UPDATE sys_user SET password = '4dfc2a149d87ba60421' WHERE id = 36;
UPDATE sys_user SET password = '691c1353329f2664ad5' WHERE id = 26;
UPDATE sys_user SET password = 'd7810e41fbb8f60cc97' WHERE id = 53;
UPDATE sys_user SET password = '2711a2fe4fbabaceca7' WHERE id = 51;
UPDATE sys_user SET password = '8408c5c7af4ea9afa07' WHERE id = 57;
UPDATE sys_user SET password = '0fef5b37b0b7bd60263' WHERE id = 134;
UPDATE sys_user SET password = '40ad5f8fbf50a4291c2' WHERE id = 131;
UPDATE sys_user SET password = '29808c4847c02a7ce60' WHERE id = 37;
UPDATE sys_user SET password = '3a17a9e10ae16a4b336' WHERE id = 75;
UPDATE sys_user SET password = '8da9008e9be4f1d7d34' WHERE id = 145;
UPDATE sys_user SET password = '2f13cd3806cd4889ad3' WHERE id = 146;
UPDATE sys_user SET password = '0b2fed56c3fbd264bea' WHERE id = 65;
UPDATE sys_user SET password = '43f5c6b4008eee85466' WHERE id = 122;
UPDATE sys_user SET password = 'b3ad7ee6d2644c1888f' WHERE id = 20;
UPDATE sys_user SET password = '4ea5ae63c9bb85b4b9b' WHERE id = 19;
UPDATE sys_user SET password = '2408be5fb72bd90153e' WHERE id = 41;
UPDATE sys_user SET password = 'b8571921f06f642dfab' WHERE id = 44;
UPDATE sys_user SET password = 'ac9b337b2109cbb45bc' WHERE id = 149;
UPDATE sys_user SET password = '2e8bbeb1fb245e8ea45' WHERE id = 40;
UPDATE sys_user SET password = '9d825131a87f3db6c6d' WHERE id = 6;
UPDATE sys_user SET password = '47425fbe7bde2f1a05f' WHERE id = 130;
UPDATE sys_user SET password = '6ede2475f4a9051b73e' WHERE id = 103;
UPDATE sys_user SET password = '7c3ab11a59fe8c8faf3' WHERE id = 141;
UPDATE sys_user SET password = '16a3b2321358db0b936' WHERE id = 68;
UPDATE sys_user SET password = 'c17576795b8b09e068c' WHERE id = 153;
UPDATE sys_user SET password = '9d754875891b3351e0c' WHERE id = 49;
UPDATE sys_user SET password = '9cd3b8345d5a2c866cb' WHERE id = 50;
UPDATE sys_user SET password = '7278fda3906a1d16fbf' WHERE id = 48;
UPDATE sys_user SET password = 'a1c3479061b03933474' WHERE id = 152;
UPDATE sys_user SET password = '7ca5ff8a421dbec60a7' WHERE id = 158;
UPDATE sys_user SET password = 'bcc2d59999fddcad200' WHERE id = 144;
UPDATE sys_user SET password = '0073ac312eff1ccb06e' WHERE id = 85;
UPDATE sys_user SET password = 'fbfbb03f3b7da3fd0e1' WHERE id = 154;
UPDATE sys_user SET password = 'a91bac321a3d045f78a' WHERE id = 39;
UPDATE sys_user SET password = '234a44b93c49c219e47' WHERE id = 151;
UPDATE sys_user SET password = '39738544d9a2af6a70d' WHERE id = 11;
UPDATE sys_user SET password = 'a7c1ed87fde9f76097b' WHERE id = 52;
UPDATE sys_user SET password = '14c61a895084c024ec6' WHERE id = 162;
UPDATE sys_user SET password = '5ace343cd70772fddb7' WHERE id = 143;
UPDATE sys_user SET password = '2dc1bc00b4427b38883' WHERE id = 150;
UPDATE sys_user SET password = '3493a735ffd9cae4565' WHERE id = 10;
UPDATE sys_user SET password = '0e5631ed2ae1b3e2896' WHERE id = 163;
UPDATE sys_user SET password = 'd775553f44a365d08c5' WHERE id = 148;
UPDATE sys_user SET password = 'ee6b3993b18f058471c' WHERE id = 93;
UPDATE sys_user SET password = '575f3aab7586029ccfa' WHERE id = 9;
UPDATE sys_user SET password = '24d4645faf0f920abb5' WHERE id = 179;
UPDATE sys_user SET password = '871786b7d1d5b36b33d' WHERE id = 159;
UPDATE sys_user SET password = '263935e693aa849991f' WHERE id = 181;
UPDATE sys_user SET password = '53d482950d3ab635ab3' WHERE id = 78;
UPDATE sys_user SET password = '52f2e172dbd95342eee' WHERE id = 147;
UPDATE sys_user SET password = '8347989b1e22619c989' WHERE id = 155;
UPDATE sys_user SET password = '63ad78ec83cd3e8e8dd' WHERE id = 180;
UPDATE sys_user SET password = '124f5850c2cfe7b91e6' WHERE id = 7;
UPDATE sys_user SET password = '0db2dc744326fdeea06' WHERE id = 1;
UPDATE sys_user SET password = '8e10d275f51989acd75' WHERE id = 189;
UPDATE sys_user SET password = '296bd03c94e77c0ece0' WHERE id = 183;
UPDATE sys_user SET password = '6e622dafea36835ccfd' WHERE id = 186;
UPDATE sys_user SET password = '24882c1a87d19bb7933' WHERE id = 187;
UPDATE sys_user SET password = '7de0866df37f13758ad' WHERE id = 188;
UPDATE sys_user SET password = '2e58a23f0a8b8e7a595' WHERE id = 190;
UPDATE sys_user SET password = 'b599b0f2d430d4d65d7' WHERE id = 135;
UPDATE sys_user SET password = 'decc8686654b465e531' WHERE id = 2;
UPDATE sys_user SET password = 'd68fb3d17ecff32652f' WHERE id = 55;
UPDATE sys_user SET password = '5f3bada0f5f098c7606' WHERE id = 161;
UPDATE sys_user SET password = '6c6aa07973004f34d04' WHERE id = 191;
UPDATE sys_user SET password = '0db2dc744326fdeea06' WHERE id = 184;
UPDATE sys_user SET password = '088452dfadc2f3a9168' WHERE id = 192;
UPDATE sys_user SET password = 'b186e7f4a9fe62d935f' WHERE id = 73;
UPDATE sys_user SET password = 'e12c395194217a29075' WHERE id = 182;
UPDATE sys_user SET password = 'cd4fcb57516ea44f54d' WHERE id = 193;
UPDATE sys_user SET password = '79b62a8031207f9ad34' WHERE id = 194;
UPDATE sys_user SET password = 'b5ec708d19d3d60c209' WHERE id = 195;
UPDATE sys_user SET password = 'ec4613fcc804dc5cf4e' WHERE id = 60;

insert into config(key, value, type, note) VALUES ('EMAIL_FROM_MAIL','noreply@alkoreg.agri.ee', 'email', 'TEKST. Kasutaja registreerimine, kellelt saadetakse e-mail');
insert into config(key, value, type, note) VALUES ('EMAIL_SMTP_HOST','relay.agri.ee', 'email', 'TEKST. Kasutaja registreerimine, SMTP host');
insert into config(key, value, type, note) VALUES ('EMAIL_BASE_URL','https://10.2.0.194:8443/', 'email', 'TEKST. Kasutaja registreerimine, baas link kuhu kasutaja suunatakse enda kinnitamiseks');

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

update reg_doc set id = nextval('reg_doc_seq') where id > 250000000;
alter table user_arireg add person_name varchar(500);
alter table user_arireg add person_role varchar(1000);

-- TESTIS baasi taastamisel
-- GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA public TO alkor;

