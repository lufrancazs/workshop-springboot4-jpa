package com.lucasdefranca.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasdefranca.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
