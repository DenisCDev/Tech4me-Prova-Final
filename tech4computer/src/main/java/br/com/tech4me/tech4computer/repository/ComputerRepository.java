package br.com.tech4me.tech4computer.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4me.tech4computer.model.Computer;

public interface ComputerRepository extends MongoRepository<Computer, String> {

  List<Computer> findByPreco(String preco);

}
