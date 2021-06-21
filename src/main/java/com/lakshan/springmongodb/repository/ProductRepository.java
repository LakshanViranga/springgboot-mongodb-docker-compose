package com.lakshan.springmongodb.repository;


import com.lakshan.springmongodb.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, Integer> {
}
