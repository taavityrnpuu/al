/*START of script */
CREATE INDEX indx_rep_created ON product_move_report(created);
CREATE INDEX indx_rec_rep_id ON product_move_report_record(report_id);
CREATE INDEX indx_rec_entry_id ON product_move_report_record(regentry_id);
CREATE INDEX indx_rep_ent_id ON product_move_report(load_enterprise_id);
CREATE INDEX indx_rep_month_id ON product_move_report(month_class_id);
CREATE INDEX indx_ent_reg_id ON enterprise(reg_id);
CREATE INDEX indx_ent_name ON enterprise(name);
CREATE INDEX indx_reg_entry_nr ON reg_entry(nr);
/*END of script */