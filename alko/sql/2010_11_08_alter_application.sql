ALTER TABLE reg_application ADD COLUMN ent_repr_subj_id bigint;
ALTER TABLE reg_application ADD CONSTRAINT FK_ENT_REPR_SUBJECT FOREIGN KEY (ENT_REPR_SUBJ_ID) REFERENCES person (id);
ALTER TABLE reg_application_history ADD COLUMN ENT_REPRESENTATIVE_ID bigint;