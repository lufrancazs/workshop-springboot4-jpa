package com.lucasdefranca.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasdefranca.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
