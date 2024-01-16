package com.lucasdefranca.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasdefranca.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
