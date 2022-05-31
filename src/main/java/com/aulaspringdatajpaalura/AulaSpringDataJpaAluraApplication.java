package com.aulaspringdatajpaalura;

import com.aulaspringdatajpaalura.orm.Cargo;
import com.aulaspringdatajpaalura.repository.CargoRepository;
import com.aulaspringdatajpaalura.service.CrudCargoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class AulaSpringDataJpaAluraApplication implements CommandLineRunner {

	private  final CrudCargoService cargoService;

	private Boolean system = true;

	public AulaSpringDataJpaAluraApplication(CrudCargoService cargoService){
		this.cargoService = cargoService;
	}
	public static void main(String[] args) {
		SpringApplication.run(AulaSpringDataJpaAluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Scanner scanner = new Scanner(System.in);

		while (system){
			System.out.println("Qual acao voce quer executar");
			System.out.println("0 - Sair");
			System.out.println("1 - Cargo");

			int action = scanner.nextInt();
			if(action == 1) {
				cargoService.inicial(scanner);
			} else {
				system = false;
			}
		}
	}
}

