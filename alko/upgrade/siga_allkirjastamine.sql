delete from config WHERE key = 'DIGIDOCSERVICE_URL';

-- LIVE PARAMEETRID
insert into config(key, value, type, note) VALUES ('SIGA_URL',			'https://dsig.eesti.ee/', 				'SIGA', 'TEKST. SiGa teenuse url, mille peal toimub digitaalne allkirjastamine.');
insert into config(key, value, type, note) VALUES ('SIGA_ALGORITHM',	'HmacSHA256', 							'SIGA', 'TEKST. SiGa teenuse tokeni loomise algoritm. Nt: HmacSHA256');
insert into config(key, value, type, note) VALUES ('SIGA_UUID',			'5cd937eb-4c5d-46d3-b384-984e2f3618a9',	'SIGA', 'TEKST. SiGa teenuse tokeni loomise UUID.');
insert into config(key, value, type, note) VALUES ('SIGA_SIGNING_KEY',	'qb3WR2nuLGRnlP2cgU8JHNXGMbn84wAB', 	'SIGA', 'TEKST. SiGa teenuse tokeni loomise võti.');

-- TESTI parameetrid
insert into config(key, value, type, note) VALUES ('SIGA_URL',			'https://dsig-demo.eesti.ee', 			'SIGA', 'TEKST. SiGa teenuse url, mille peal toimub digitaalne allkirjastamine.');
insert into config(key, value, type, note) VALUES ('SIGA_ALGORITHM',	'HmacSHA256', 							'SIGA', 'TEKST. SiGa teenuse tokeni loomise algoritm. Nt: HmacSHA256');
insert into config(key, value, type, note) VALUES ('SIGA_UUID',			'fd272218-c17a-4b4a-83b8-2ad151578254', 'SIGA', 'TEKST. SiGa teenuse tokeni loomise UUID.');
insert into config(key, value, type, note) VALUES ('SIGA_SIGNING_KEY',	'dkvwXkhnSEmWqsfJrfGQbqkCcyli5oGv', 	'SIGA', 'TEKST. SiGa teenuse tokeni loomise võti.');
