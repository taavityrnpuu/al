update product set appl_id = null where appl_id in (select id from reg_application where appl_state_class_id = (select id from classificator where code = 'CTL') and created_by is null);

delete from reg_application where appl_state_class_id = (select id from classificator where code = 'CTL') and created_by is null;