package com.aulaspringdatajpaalura.service;

import com.aulaspringdatajpaalura.orm.Cargo;
import com.aulaspringdatajpaalura.repository.CargoRepository;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class CrudCargoService {

    private Boolean system = true;
    private final CargoRepository cargoRepository;

    public CrudCargoService(CargoRepository cargoRepository){
        this.cargoRepository = cargoRepository;
    }

    public void inicial(Scanner scanner){
        while (system){
            System.out.println("Qual acao de cargo deseja executar");
            System.out.println("0 - Sair");
            System.out.println("1 - salvar");
            System.out.println("2 - atualizar");

            int action = scanner.nextInt();
            switch (action){
                case 1:
                    salvar(scanner);
                    break;
                case 2:
                    atualizar(scanner);
                    break;

                default:
                    system = false;
                    break;
            }

        }

        salvar(scanner);
    }
    private void salvar(Scanner scanner){
        System.out.println("Descricao do cargo");
        String descricao = scanner.next();
        Cargo cargo = new Cargo();
        cargo.setDescricao(descricao);
        cargoRepository.save(cargo);
        System.out.println("Salvo");
    }

    private void atualizar(Scanner scanner){
        System.out.println("Id");
        int id = scanner.nextInt();
        System.out.println("Descricao do cargo");
        String descricao = scanner.next();

        Cargo cargo = new Cargo();
        cargo.setId(id);
        cargo.setDescricao(descricao);
        cargoRepository.save(cargo);
        System.out.println("Atualizado");



    }

}
