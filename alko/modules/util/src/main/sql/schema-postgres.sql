
    create table AUTHLOG (
        id int8 not null,
        TIME timestamp,
        CLIENT_IP varchar(20),
        REG_NR varchar(20),
        USER_NAME varchar(20),
        AUTH_TYPE_ID int8,
        primary key (id)
    );

    create table CLASSIFICATOR (
        id int8 not null,
        VERSION int4,
        CREATED timestamp,
        CREATED_BY varchar(16),
        MODIFIED timestamp,
        MODIFIED_BY varchar(16),
        DELETED timestamp,
        DELETED_BY varchar(16),
        NAME varchar(128),
        CODE varchar(64),
        VALID_FROM timestamp,
        VALID_UNTIL timestamp,
        CATEGORY varchar(32),
        CAT_NAME varchar(40),
        SYSTEM_CLASS bool,
        primary key (id),
        unique (CATEGORY, CODE)
    );

    create table ENTERPRISE (
        id int8 not null,
        VERSION int4,
        CREATED timestamp,
        CREATED_BY varchar(16),
        MODIFIED timestamp,
        MODIFIED_BY varchar(16),
        DELETED timestamp,
        DELETED_BY varchar(16),
        ADDRESS varchar(64),
        DISTRICT varchar(100),
        ORG_UNIT varchar(100),
        ZIP varchar(10),
        NAME varchar(128) unique,
        REG_ID varchar(40) unique,
        EMAIL varchar(20),
        FAX varchar(20),
        MOBILE varchar(20),
        PHONE varchar(20),
        MTR_CODE varchar(64),
        EXCISE_STORE_NR varchar(64),
        ACK_DATE timestamp,
        ACK_NR varchar(30),
        NOTES varchar(1000),
        CHANGE_REASON varchar(1000),
        COUNTRY_CLASS_ID int8,
        ENT_REPR_SUBJ_ID int8,
        primary key (id)
    );

    create table ENTERPRISE_ROLE (
        id int8 not null,
        VERSION int4,
        CREATED timestamp,
        CREATED_BY varchar(16),
        MODIFIED timestamp,
        MODIFIED_BY varchar(16),
        DELETED timestamp,
        DELETED_BY varchar(16),
        ENT_ROLE_ID int8,
        ENTERPRISE_ID int8,
        primary key (id)
    );

    create table FAQ (
        id int8 not null,
        VERSION int4,
        CREATED timestamp,
        CREATED_BY varchar(16),
        MODIFIED timestamp,
        MODIFIED_BY varchar(16),
        DELETED timestamp,
        DELETED_BY varchar(16),
        QUESTION varchar(256),
        ANSWER varchar(2000),
        primary key (id)
    );

    create table NEWS (
        id int8 not null,
        VERSION int4,
        CREATED timestamp,
        CREATED_BY varchar(16),
        MODIFIED timestamp,
        MODIFIED_BY varchar(16),
        DELETED timestamp,
        DELETED_BY varchar(16),
        CONTENT varchar(2000),
        DATE timestamp,
        TITLE varchar(256),
        primary key (id)
    );

    create table PERSON (
        id int8 not null,
        VERSION int4,
        CREATED timestamp,
        CREATED_BY varchar(16),
        MODIFIED timestamp,
        MODIFIED_BY varchar(16),
        DELETED timestamp,
        DELETED_BY varchar(16),
        REG_ID varchar(16) unique,
        LAST_NAME varchar(64),
        FIRST_NAME varchar(32),
        OCCUPATION varchar(60),
        EMAIL varchar(20),
        FAX varchar(20),
        MOBILE varchar(20),
        PHONE varchar(20),
        primary key (id)
    );

    create table PRODUCT (
        id int8 not null,
        VERSION int4,
        CREATED timestamp,
        CREATED_BY varchar(16),
        MODIFIED timestamp,
        MODIFIED_BY varchar(16),
        DELETED timestamp,
        DELETED_BY varchar(16),
        NAME varchar(256),
        NOTES varchar(1000),
        CODE varchar(10),
        ETHANOL_RATE int4,
        FRONT_LABEL bool,
        REAR_LABEL bool,
        NECK_LABEL bool,
        OTHER_LABEL bool,
        STOCKING bool,
        LABELS_NO int4,
        PACK_VOL numeric(23, 8),
        MARKETER_SUBJ_ID int8,
        PROD_CLASS_ID int8,
        PACKMAT_CLASS_ID int8,
        BOTCOL_CLASS_ID int8,
        BOTSHAPE_CLASS_ID int8,
        ORG_COUNTRY_CLASS_ID int8,
        CRKSHAPE_CLASS_ID int8,
        IMPORTER_SUBJ_ID int8,
        STOCKCOL_CLASS_ID int8,
        CRKCOL_CLASS_ID int8,
        PRODUCER_SUBJ_ID int8,
        CRKMAT_CLASS_ID int8,
        primary key (id)
    );

    create table PRODUCT_MOVE_REPORT (
        id int8 not null,
        VERSION int4,
        CREATED timestamp,
        CREATED_BY varchar(16),
        MODIFIED timestamp,
        MODIFIED_BY varchar(16),
        DELETED timestamp,
        DELETED_BY varchar(16),
        LOAD_ENT_ID int8,
        REPORT_ENT_ID int8,
        LOAD_USER_ID int8,
        primary key (id)
    );

    create table PRODUCT_MOVE_REPORT_RECORD (
        id int8 not null,
        VERSION int4,
        CREATED timestamp,
        CREATED_BY varchar(16),
        MODIFIED timestamp,
        MODIFIED_BY varchar(16),
        DELETED timestamp,
        DELETED_BY varchar(16),
        AMOUNT int4,
        RECEIVER varchar(100),
        PARTY_NR varchar(20),
        ADDRESS varchar(64),
        DISTRICT varchar(100),
        ORG_UNIT varchar(100),
        ZIP varchar(10),
        REGENTRY_ID int8,
        COUNTRY_CLASS_ID int8,
        REPORT_ID int8,
        primary key (id)
    );

    create table REG_APPLICATION (
        id int8 not null,
        VERSION int4,
        CREATED timestamp,
        CREATED_BY varchar(16),
        MODIFIED timestamp,
        MODIFIED_BY varchar(16),
        DELETED timestamp,
        DELETED_BY varchar(16),
        NOTES varchar(1000),
        NR varchar(32),
        ARRIVED timestamp,
        EXAMPL_COUNT int4,
        EXAMPL_RECEIPT timestamp,
        EXAMPL_RETURN timestamp,
        DECISION_DATE timestamp,
        DECISION_NR varchar(10),
        DECISION_EXPLANATION varchar(1000),
        PRODUCT_ID int8,
        APPL_TYPE_CLASS_ID int8,
        ENTRY_DEC_CLASS_ID int8,
        APPL_SUBJ_ID int8,
        EXAMPL_DEC_CLASS_ID int8,
        APPL_STATE_CLASS_ID int8,
        DEC_SIGNER_ID int8,
        PROCESS_SUBJ_ID int8,
        PAYMENT_ID int8,
        primary key (id)
    );

    create table REG_DOC (
        id int8 not null,
        VERSION int4,
        CREATED timestamp,
        CREATED_BY varchar(16),
        MODIFIED timestamp,
        MODIFIED_BY varchar(16),
        DELETED timestamp,
        DELETED_BY varchar(16),
        NAME varchar(128),
        PATH varchar(128),
        MIME varchar(64),
        NOTES varchar(1000),
        NR varchar(32),
        DOC_SENT timestamp,
        DOC_APPL_ID int8,
        LANG_CLASS_ID int8,
        DOC_CLASS_ID int8,
        DOCREC_PERSON_ID int8,
        primary key (id)
    );

    create table REG_ENTRY (
        id int8 not null,
        VERSION int4,
        CREATED timestamp,
        CREATED_BY varchar(16),
        MODIFIED timestamp,
        MODIFIED_BY varchar(16),
        DELETED timestamp,
        DELETED_BY varchar(16),
        CHANGE_REASON varchar(1000),
        NR varchar(20),
        VALID_FROM timestamp,
        VALID_UNTIL timestamp,
        APPL_ID int8,
        primary key (id)
    );

    create table REG_PAYMENT (
        id int8 not null,
        VERSION int4,
        CREATED timestamp,
        CREATED_BY varchar(16),
        MODIFIED timestamp,
        MODIFIED_BY varchar(16),
        DELETED timestamp,
        DELETED_BY varchar(16),
        AMOUNT numeric(19, 2),
        PAYER_NAME varchar(64),
        PAYER_ACCNO varchar(32),
        PAYMENT_TIME timestamp,
        REF_NR varchar(64),
        REG_NR varchar(20),
        PAYER_ENTERPRISE_ID int8,
        primary key (id)
    );

    create table SYS_USER (
        id int8 not null,
        VERSION int4,
        CREATED timestamp,
        CREATED_BY varchar(16),
        MODIFIED timestamp,
        MODIFIED_BY varchar(16),
        DELETED timestamp,
        DELETED_BY varchar(16),
        NAME varchar(28) unique,
        PASSWORD varchar(12),
        PERSON_ID int8,
        primary key (id)
    );

    create table USER_GROUP (
        id int8 not null,
        VERSION int4,
        CREATED timestamp,
        CREATED_BY varchar(16),
        MODIFIED timestamp,
        MODIFIED_BY varchar(16),
        DELETED timestamp,
        DELETED_BY varchar(16),
        USER_ID int8,
        GRP_CLASS_ID int8,
        primary key (id)
    );

    alter table AUTHLOG 
        add constraint FK_AUTH_TYPE_CLASS 
        foreign key (AUTH_TYPE_ID) 
        references CLASSIFICATOR;

    alter table ENTERPRISE 
        add constraint FK_ADDR_COUNTRY_CLASS 
        foreign key (COUNTRY_CLASS_ID) 
        references CLASSIFICATOR;

    alter table ENTERPRISE 
        add constraint FK_ENT_REPR_SUBJECT 
        foreign key (ENT_REPR_SUBJ_ID) 
        references PERSON;

    alter table ENTERPRISE_ROLE 
        add constraint FK_ENT_ROLE_CLASS 
        foreign key (ENT_ROLE_ID) 
        references CLASSIFICATOR;

    alter table ENTERPRISE_ROLE 
        add constraint FK_ENTERPRISE_ROLE_ENT 
        foreign key (ENTERPRISE_ID) 
        references ENTERPRISE;

    alter table PRODUCT 
        add constraint FK_PRODUCT_BOTSHAPE_CLASS 
        foreign key (BOTSHAPE_CLASS_ID) 
        references CLASSIFICATOR;

    alter table PRODUCT 
        add constraint FK_PRODUCT_CLASS 
        foreign key (PROD_CLASS_ID) 
        references CLASSIFICATOR;

    alter table PRODUCT 
        add constraint FK_PRODUCT_CRKMAT_CLASS 
        foreign key (CRKMAT_CLASS_ID) 
        references CLASSIFICATOR;

    alter table PRODUCT 
        add constraint FK_PROD_PRODUCER_SUBJ 
        foreign key (PRODUCER_SUBJ_ID) 
        references ENTERPRISE;

    alter table PRODUCT 
        add constraint FK_PRODUCT_STOCKCOL_CLASS 
        foreign key (STOCKCOL_CLASS_ID) 
        references CLASSIFICATOR;

    alter table PRODUCT 
        add constraint FK_PRODUCT_PACKMAT_CLASS 
        foreign key (PACKMAT_CLASS_ID) 
        references CLASSIFICATOR;

    alter table PRODUCT 
        add constraint FK_PROD_IMPORTER_SUBJ 
        foreign key (IMPORTER_SUBJ_ID) 
        references ENTERPRISE;

    alter table PRODUCT 
        add constraint FK_PRODUCT_CRKSHAPE_CLASS 
        foreign key (CRKSHAPE_CLASS_ID) 
        references CLASSIFICATOR;

    alter table PRODUCT 
        add constraint FK_PRODUCT_CRKCOL_CLASS 
        foreign key (CRKCOL_CLASS_ID) 
        references CLASSIFICATOR;

    alter table PRODUCT 
        add constraint FK_PRODUCT_ORG_COUNTRY_CLASS 
        foreign key (ORG_COUNTRY_CLASS_ID) 
        references CLASSIFICATOR;

    alter table PRODUCT 
        add constraint FK_PROD_MARKETER_SUBJ 
        foreign key (MARKETER_SUBJ_ID) 
        references ENTERPRISE;

    alter table PRODUCT 
        add constraint FK_PRODUCT_BOTCOL_CLASS 
        foreign key (BOTCOL_CLASS_ID) 
        references CLASSIFICATOR;

    alter table PRODUCT_MOVE_REPORT 
        add constraint FK_REPORT_LOAD_ENT 
        foreign key (LOAD_ENT_ID) 
        references ENTERPRISE;

    alter table PRODUCT_MOVE_REPORT 
        add constraint FK_REPORT_LOAD_USER 
        foreign key (LOAD_USER_ID) 
        references SYS_USER;

    alter table PRODUCT_MOVE_REPORT 
        add constraint FK_REPORT_ENT 
        foreign key (REPORT_ENT_ID) 
        references ENTERPRISE;

    alter table PRODUCT_MOVE_REPORT_RECORD 
        add constraint FK_REPORT_RECORD_REPORT 
        foreign key (REPORT_ID) 
        references PRODUCT_MOVE_REPORT;

    alter table PRODUCT_MOVE_REPORT_RECORD 
        add constraint FK_REPORT_RECORD_REGENTRY 
        foreign key (REGENTRY_ID) 
        references REG_ENTRY;

    alter table PRODUCT_MOVE_REPORT_RECORD 
        add constraint FK_ADDR_COUNTRY_CLASS 
        foreign key (COUNTRY_CLASS_ID) 
        references CLASSIFICATOR;

    alter table REG_APPLICATION 
        add constraint FK_DEC_SIG_PERSON 
        foreign key (DEC_SIGNER_ID) 
        references PERSON;

    alter table REG_APPLICATION 
        add constraint FK_APPL_PAYMENT 
        foreign key (PAYMENT_ID) 
        references REG_PAYMENT;

    alter table REG_APPLICATION 
        add constraint FK_APPL_APPL_STATE_CLASS 
        foreign key (APPL_STATE_CLASS_ID) 
        references CLASSIFICATOR;

    alter table REG_APPLICATION 
        add constraint FK_APPL_PROCESS_SUBJ 
        foreign key (PROCESS_SUBJ_ID) 
        references SYS_USER;

    alter table REG_APPLICATION 
        add constraint FK_EXAMPL_DEC_CLASS 
        foreign key (EXAMPL_DEC_CLASS_ID) 
        references CLASSIFICATOR;

    alter table REG_APPLICATION 
        add constraint FK_APPL_TYPE_CLASS 
        foreign key (APPL_TYPE_CLASS_ID) 
        references CLASSIFICATOR;

    alter table REG_APPLICATION 
        add constraint FK_APPL_SUBJ 
        foreign key (APPL_SUBJ_ID) 
        references ENTERPRISE;

    alter table REG_APPLICATION 
        add constraint FK_APPL_PRODUCT 
        foreign key (PRODUCT_ID) 
        references PRODUCT;

    alter table REG_APPLICATION 
        add constraint FK_ENTRY_DEC_CLASS 
        foreign key (ENTRY_DEC_CLASS_ID) 
        references CLASSIFICATOR;

    alter table REG_DOC 
        add constraint FK_DOC_DOC_CLASS 
        foreign key (DOC_CLASS_ID) 
        references CLASSIFICATOR;

    alter table REG_DOC 
        add constraint FK_DOC_LANG_CLASS 
        foreign key (LANG_CLASS_ID) 
        references CLASSIFICATOR;

    alter table REG_DOC 
        add constraint FK_DOC_APPL 
        foreign key (DOC_APPL_ID) 
        references REG_APPLICATION;

    alter table REG_DOC 
        add constraint FK_DOC_DOCREC_PERSON 
        foreign key (DOCREC_PERSON_ID) 
        references PERSON;

    alter table REG_ENTRY 
        add constraint FK_REGENTRY_APPL 
        foreign key (APPL_ID) 
        references REG_APPLICATION;

    alter table REG_PAYMENT 
        add constraint FK_PAYING_ENTERPRISE 
        foreign key (PAYER_ENTERPRISE_ID) 
        references ENTERPRISE;

    alter table SYS_USER 
        add constraint FK_USER_PERSON 
        foreign key (PERSON_ID) 
        references PERSON;

    alter table USER_GROUP 
        add constraint FK_GROUP_USER 
        foreign key (USER_ID) 
        references SYS_USER;

    alter table USER_GROUP 
        add constraint FK_GROUP_CLASS 
        foreign key (GRP_CLASS_ID) 
        references CLASSIFICATOR;

    create sequence AUTHLOG_SEQ;

    create sequence CLASSIFICATOR_SEQ;

    create sequence ENTERPRISE_ROLE_SEQ;

    create sequence ENTERPRISE_SEQ;

    create sequence FAQ_SEQ;

    create sequence NEWS_SEQ;

    create sequence PERSON_SEQ;

    create sequence PRODUCT_MOVE_REPORT_RECORD_SEQ;

    create sequence PRODUCT_MOVE_REPORT_SEQ;

    create sequence PRODUCT_SEQ;

    create sequence REG_APPL_SEQ;

    create sequence REG_DOC_SEQ;

    create sequence REG_ENTRY_SEQ;

    create sequence REG_PAYMENT_SEQ;

    create sequence USER_GRP_SEQ;

    create sequence USER_SEQ;
