Use db_BancoEtec;
Go

-- Dados de Correntista
Insert Into tb_Correntista(nomeCorrentista, dataNascCorrentista, cpfCorrentista, rgCorrentista) Values
('Rogério Ceni', 1973-01-22, '123.456.789-00', '12.545.122-01'),
('Raí Vieira de Oliveira', 1965-05-15, '232.322.321-99', '18.332.232-10'),
('Armelindo Donizetti', 1965-10-10, '222.333.232-00', '12.433.233-00');


-- Dados de CC
Insert Into tb_ContaCorrentista(numAgenciaCC, numCC, digitoCC, senhaNumericaCC, senhaAlfaNumCC, saldoCC, dataAberturaCC, idCorrentista) Values
(1021, 123122, 11, 111111, '6B3L3M', 100000, '2017-10-10', 1),
(1022, 212121, 12, 12211, '2x1SP', 90000, '2014-12-12', 2),
(1021, 123121, 11, 123456, '01MITO', 1200000, '2017-05-10', 1),
(1021, 324544, 10, 839222, 'ZETTO1', 23498.90, '2015-05-10', 3);

-- Dados de CP
Insert Into tb_ContaPoupanca(numAgenciaCP, numCP, digitoCP, saldoCP, dataAberturaCP, idCorrentista) Values
(1021, 434433, 4, 2000000, 2017-06-10, 1),
(1022, 322222, 5, 4000000, 2017-05-15, 2),
(1021, 232222, 6, 220000, 2017-04-10, 3);

SELECT * FROM tb_Correntista;