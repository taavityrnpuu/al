ALTER TABLE reg_payment ADD COLUMN order_num character varying(50);
ALTER TABLE reg_payment_history ADD COLUMN order_num character varying(50);