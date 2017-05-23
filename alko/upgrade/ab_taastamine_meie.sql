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

update sys_user  set password = (select password from sys_user where name = 'EIT');

-- Redale asutused külge
update person set reg_id = '48012300041' where reg_id = '39101022756';
insert into user_arireg(id_code, reg_nr, ent_name) VALUES ('48012300041','11740444','duoteek OÜ');
insert into user_arireg(id_code, reg_nr, ent_name) VALUES ('48012300041','10183332','Karima Elva');
insert into user_arireg(id_code, reg_nr, ent_name) VALUES ('48012300041','10422647','Näksi');
