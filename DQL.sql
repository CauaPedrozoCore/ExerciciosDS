Use db_BancoEtec
Go

-- Criar uma view vwSaldoTotal1 obtendo o nome do correntista, o saldo da Conta corrente, o Saldo da Poupança e a soma dos dois saldos
Create View vwSaldoTotal As
	Select nomeCorrentista As 'Nome do Pilantra', saldoCP As 'Saldo CP', saldoCC As 'Saldo CC', (saldoCC + saldoCP) As 'Saldo Total' From tb_Correntista
		INNER JOIN tb_ContaCorrentista ON tb_Correntista.idCorrentista = tb_ContaCorrentista.idCorrentista
			INNER JOIN tb_ContaPoupanca ON tb_Correntista.idCorrentista = tb_ContaPoupanca.idCorrentista;

	Select * From vwSaldoTotal Order By [Nome do Pilantra] ASC;

-- Criar uma view vwProjecaoSaldoPoupanca informando o nome do correntista e o saldo da poupança atualizado após acréscimo de 0.5% no próximo mes
Create View vwProjecaoSaldoPoupanca As
	Select nomeCorrentista As 'Nome do Pilantra', saldoCP As 'Saldo Atual CP', (saldoCP * 1.005) As 'Saldo com Rendimento' From tb_Correntista
		INNER JOIN tb_ContaPoupanca ON tb_Correntista.idCorrentista = tb_ContaPoupanca.idCorrentista;

	Select * From vwProjecaoSaldoPoupanca Order By [Nome do Pilantra] ASC;

-- Criar uma view vwExibeCorrentista que exiba todos os dados da conta corrente ao lado do nome do correntista (exceto a senha numérica e alfanumérica), com a data de abertura da conta corrente no formato dd/mm/aaaa e osaldo da poupança
Create View vwExibeCorrentista As
	Select tb_Correntista.nomeCorrentista As 'Nome do Pilantra', idContaCorrente As 'ID CC', 
		numAgenciaCC As 'Agencia CC', numCC As 'Numero CC', digitoCC As 'Digito CC',
		saldoCC As 'Saldo CC', CONVERT(Varchar(10), dataAberturaCC, 103) As 'Data Abertura CC',saldoCP As 'Saldo CP' From tb_Correntista
			INNER JOIN tb_ContaCorrentista ON tb_Correntista.idCorrentista = tb_ContaCorrentista.idCorrentista
				INNER JOIN tb_ContaPoupanca ON tb_Correntista.idCorrentista = tb_ContaPoupanca.idCorrentista;
				/* a parte de converter eu tive que pesquisar porque não sabia como fazia */

	Select * From vwExibeCorrentista Order By [Nome do Pilantra] ASC; 
	
-- Criar uma view vwCorrentistaConta que exiba o nome dos correntistas, o numero da conta corrente e o saldo na conta corrente, apenas daqueles que possuam mais de R$ 500000,00 na conta corrente. Utilizar essa view para exibir os dados ordenados por saldo da conta (do maior saldo para o menor saldo)Criar uma view vwCorrentistaConta que exiba o nome dos correntistas, o numero da conta corrente e o saldo na conta corrente, apenas daqueles que possuam mais de R$ 500000,00 na conta corrente
Create View vwCorrentistaConta As
	Select nomeCorrentista As 'Nome do Pilantra', numCC As 'Numero CC', saldoCC As 'Saldo CC' From tb_Correntista
		INNER JOIN tb_ContaCorrentista ON tb_Correntista.idCorrentista = tb_ContaCorrentista.idCorrentista
			Where tb_ContaCorrentista.saldoCC > 500000.00;

	Select * From vwCorrentistaConta Order By [Saldo CC] DESC;