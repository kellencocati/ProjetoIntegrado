algoritmo Vacina

inicio
	
	inteiro numeroDoses, idadeMinima, idadeMaxima, validade;
	texto nome, descricao;
	boleano obrigatoria;
	
	escreva("\t\t\t ** Cadastra Vacinas ** \n\n");
	
	escreva("Digite nome ");
	leia(nome);
	escreva("Digita descricao: ");
	leia(descricao);
	escreva("Digita numeroDoses: ");
	leia(numeroDoses);
	escreva("Digita idadeMinima: ");
	leia(idadeMinima);
	escreva("Digita idadeMaxima: ");
	leia(idadeMaxima);
	escreva("Digita validade: ");
	leia(validade);
	escreva("Digita obrigatoria: ");
	leia(obrigatoria);
	
	escreva("\t\t\t ** " + cadastraVacina(nome, descricao, numeroDoses, idadeMinima, idadeMaxima, validade, obrigatoria) + " ** \n\n");
	
fim


texto cadastraVacina(texto nome, texto descricao, inteiro numeroDoses, inteiro idadeMinima, inteiro idadeMaxima, inteiro validade, boleano obrigatoria)
inicio
	guardaDadosNaBase(nome, descricao, numeroDoses, idadeMinima, idadeMaxima, validade, obrigatoria);
	retorna "Cadastro efetuado com sucesso";
fim