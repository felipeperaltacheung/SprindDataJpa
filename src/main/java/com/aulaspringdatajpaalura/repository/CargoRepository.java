package com.aulaspringdatajpaalura.repository;

import com.aulaspringdatajpaalura.orm.Cargo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoRepository extends CrudRepository<Cargo, Integer> {
}
