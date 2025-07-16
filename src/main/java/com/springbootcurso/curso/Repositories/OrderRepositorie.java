package com.springbootcurso.curso.Repositories;

import com.springbootcurso.curso.Entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepositorie extends JpaRepository<Order, Long> {

}
