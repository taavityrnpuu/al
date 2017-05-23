select convert(varchar(10), c.pro_time, 104) as reg_aeg, 
c.reg_book_nr, i.name as alkohol, i.volume as etanoolisisaldus, 
i.volume, w.name as maaletooja_n, w.forenames as maaletooja_f, 
m.name as tootja_n, 
m.forenames as tootja_f, 
cn.name as tootja_riik, 
p.name as capacity, 
t.name as toote_liik, 
x.state, x.city, x.address, x.zip, x.phone, x.fax, x.email,
i.comment as comment 

from 
ar_ve_doc_add_commiprot c join ar_doc_add_appl a on c.doc_add_appl_id = a.id join ar_item i on a.item_id = i.id 
left join ar_actor w on a.app_actor_id = w.id join ar_actor m on a.man_actor_id = m.id 
join ar_capacity p on p.id = i.b_capacity 
left join ar_producttype t on i.producttype_id = t.id 
left join AR_ACTOR_ADD_CONT x on m.ACTOR_ADD_CONT_ID_DEF = x.id 
left join ar_country cn on x.country_id = cn.id 

where (c.reg_book_nr is not null and c.reg_book_nr <> '') 
and (not(i.flags&1=1)) 
and i.out_time is null 

ORDER BY toote_liik, 
replicate('0',10-len(substring(substring(REG_BOOK_NR,charindex('/',REG_BOOK_NR)+1,255),1,charindex('/',substring(REG_BOOK_NR,charindex('/',REG_BOOK_NR)+1,255))))) + substring(substring(REG_BOOK_NR,charindex('/',REG_BOOK_NR)+1,255),1,charindex('/',substring(REG_BOOK_NR,charindex('/',REG_BOOK_NR)+1,255))) DESC,
c.reg_book_nr DESC