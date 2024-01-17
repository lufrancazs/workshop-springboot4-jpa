package com.lucasdefranca.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasdefranca.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
