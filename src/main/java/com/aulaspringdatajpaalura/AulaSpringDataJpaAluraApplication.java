package com.aulaspringdatajpaalura;

import com.aulaspringdatajpaalura.orm.Cargo;
import com.aulaspringdatajpaalura.repository.CargoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AulaSpringDataJpaAluraApplication implements CommandLineRunner {

	private  final CargoRepository repository;

	public AulaSpringDataJpaAluraApplication(CargoRepository repository){
		this.repository = repository;
	}
	public static void main(String[] args) {
		SpringApplication.run(AulaSpringDataJpaAluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Cargo cargo = new Cargo();
		cargo.setDescricao("ANALISTA");

		repository.save(cargo);
	}
}
