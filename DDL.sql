-- Criando database
Create Database db_BancoEtec;
Go

Use db_BancoEtec;
Go

-- tbCorrentista
Drop Table tb_Correntista;
Create Table tb_Correntista(
	idCorrentista Int Primary Key Identity(1,1),
	nomeCorrentista Varchar(50),
	dataNascCorrentista SmallDateTime, 
	cpfCorrentista Char(14),
	rgCorrentista Varchar(25)
);

-- tbContaPoupanca
Drop Table tb_ContaPoupanca;
Create Table tb_ContaPoupanca(
	idContaPoupanca Int Primary Key Identity(1,1),
	numAgenciaCP Int,
	numCP Int,
	digitoCP Int,
	saldoCP Money,
	dataAberturaCP SmallDateTime,
	idCorrentista Int Foreign Key References tb_Correntista(idCorrentista)
);

-- tbContaCorrentista
Drop Table tb_ContaCorrentista;
Create Table tb_ContaCorrentista(
	idContaCorrente Int Primary Key Identity(1,1),
	numAgenciaCC Int,
	numCC Int,
	digitoCC Int,
	senhaNumericaCC Int,
	senhaAlfaNumCC varchar(15),
	saldoCC Money,
	dataAberturaCC SmallDateTime,
	idCorrentista Int Foreign Key References tb_Correntista(idCorrentista)
);