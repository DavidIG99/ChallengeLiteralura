package com.aluracursos.ChallengeLiteralura;

import com.aluracursos.ChallengeLiteralura.principal.Principal;
import com.aluracursos.ChallengeLiteralura.repository.AutoresRepository;
import com.aluracursos.ChallengeLiteralura.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChallengeLiteraluraApplication implements CommandLineRunner {

	@Autowired
	private AutoresRepository repositorioAutores;
	@Autowired
	private LibroRepository repositorioLibros;

	public static void main(String[] args) {
		SpringApplication.run(ChallengeLiteraluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repositorioAutores, repositorioLibros);
		principal.muestraMenu();
	}
}
