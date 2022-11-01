algoritmo Usuario

inicio
	
	Pessoa pessoa;
	texto login, senha, tipoUsuario;
	
	escreva("\t\t\t ** Cadastra Vacinas ** \n\n");
	
	escreva("Digite pessoa ");
	leia(pessoa);
	escreva("Digita login: ");
	leia(login);
	escreva("Digita senha: ");
	leia(senha);
	escreva("Digita tipoUsuario: ");
	leia(tipoUsuario);
	
	escreva("\t\t\t ** " + cadastraVacina(pessoa, login, senha, tipoUsuario) + " ** \n\n");
	
fim


texto cadastraVacina(Pessoa pessoa, texto login, texto senha, texto tipoUsuario)
inicio
	guardaDadosNaBase(pessoa, login, senha, tipoUsuario);
	retorna "Cadastro efetuado com sucesso";
fim