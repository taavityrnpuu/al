--37904260324
--https://10.0.1.77:8443/j_acegi_security_check?nonce=1234567890123456789012345678901234567890#XTeeForm

insert into classificator (id,name,category,active,code,cat_name) values (nextval('classificator_seq'),'EITi kasutaja','SystemGroup',true,'EIT_GRP','Rollid');
insert into classificator (id,name,category,active,code,cat_name) values (nextval('classificator_seq'),' Esitamata','ApplicationState',true,'ENT','Taotluse staatuse');
insert into person ( id, version, last_name, first_name) values (nextval('person_seq'),0, 'EITXTEE', 'EITXTEE');
insert into sys_user (id,version,name,password,active,person_id) values (nextval('USER_SEQ'),0,'EIT','qcy3zev','t', (select id from person where last_name ='EITXTEE'));
insert into user_group ( id, version, user_id, grp_class_id)values (nextval('USER_GRP_SEQ'),0, (select id from sys_user where name ='EIT'), (select id from classificator where code ='EIT_GRP'));

CREATE TABLE xtee_id
(
  id character varying(40),
  code character varying(40),
  created timestamp without time zone,
  repr_code character varying(30),
  repr_name character varying(60),
  repr_occupation character varying(60)
)
WITHOUT OIDS;
ALTER TABLE xtee_id OWNER TO alkor;
