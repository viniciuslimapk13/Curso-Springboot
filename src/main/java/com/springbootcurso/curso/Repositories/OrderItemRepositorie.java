package com.springbootcurso.curso.Repositories;

import com.springbootcurso.curso.Entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepositorie extends JpaRepository<OrderItem, Long> {

}
