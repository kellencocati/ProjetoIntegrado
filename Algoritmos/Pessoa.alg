algoritmo Pessoa

inicio
	inteiro numeroEndereco;
	texto nome, dataNascimento, cidadeNatal, endereco, complementoEndereco, sexo, cpf, dataCadastro, 
		  telefoneResidencial, telefoneCelular, documento, tipoDocumento, senhaAcesso, email;
	
	escreva("\t\t\t ** Cadastra Pessoas ** \n\n");
	
	escreva("Digite nome ");
	leia(nome);
	escreva("Digita dataNascimento: ");
	leia(dataNascimento);
	escreva("Digite cidadeNatal: ");
	leia(cidadeNatal);
	escreva("Digite endereco: ");
	leia(endereco);
	escreva("Digite numeroEndereco: ");
	leia(numeroEndereco);
	escreva("Digite complementoEndereco: ");
	leia(complementoEndereco);
	escreva("Digite sexo: ");
	leia(sexo);
	escreva("Digite cpf: ");
	leia(cpf);
	escreva("Digite dataCadastro: ");
	leia(dataCadastro);
	escreva("Digite telefoneResidencial: ");
	leia(telefoneResidencial);
	escreva("Digite telefoneCelular: ");
	leia(telefoneCelular);
	escreva("Digite documento: ");
	leia(documento);
	escreva("Digite tipoDocumento: ");
	leia(tipoDocumento);
	escreva("Digite senhaAcesso: ");
	leia(senhaAcesso);
	escreva("Digite email: ");
	leia(email);

	escreva("\t\t\t ** " + cadastraPessoa(nome, dataNascimento, cidadeNatal, endereco, numeroEndereco, complementoEndereco, 
		sexo, cpf, dataCadastro, telefoneResidencial, telefoneCelular, documento, tipoDocumento, senhaAcesso, email) + " ** \n\n");
	
fim


texto cadastraPessoa(texto nome, texto dataNascimento, texto cidadeNatal, texto endereco, inteiro numeroEndereco, 
	texto complementoEndereco, texto sexo, texto cpf, texto dataCadastro, texto telefoneResidencial, texto telefoneCelular,
	texto documento, texto tipoDocumento, texto senhaAcesso, texto email)
inicio
	guardaDadosNaBase(nome, dataNascimento, cidadeNatal, endereco, numeroEndereco, complementoEndereco, sexo, cpf, dataCadastro, 
		telefoneResidencial, telefoneCelular, documento, tipoDocumento, senhaAcesso, email);
	retorna "Cadastro efetuado com sucesso";
fim