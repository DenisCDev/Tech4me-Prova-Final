package br.com.tech4me.tech4price.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4me.tech4price.model.Price;

public interface PriceRepository extends MongoRepository<Price, String>{
  
}