package com.projetointegrado.sistemacontrolevacina;

import com.projetointegrado.sistemacontrolevacina.servicos.DBServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan("com.projetointegrado.sistemacontrolevacina")
@EnableWebMvc
public class SistemaControleVacinaApplication implements CommandLineRunner {

	@Autowired
	private DBServer dbServer;

	public static void main(String[] args) {
		SpringApplication.run(SistemaControleVacinaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		dbServer.insereDadosIniciais();
	}

}
