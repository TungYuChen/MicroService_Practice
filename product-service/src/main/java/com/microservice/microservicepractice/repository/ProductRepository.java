package com.microservice.microservicepractice.repository;

import com.microservice.microservicepractice.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface ProductRepository extends MongoRepository<Product, String> {
}
