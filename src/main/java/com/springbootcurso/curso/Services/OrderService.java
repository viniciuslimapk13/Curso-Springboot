package com.springbootcurso.curso.Services;

import com.springbootcurso.curso.Entities.Order;
import com.springbootcurso.curso.Entities.User;
import com.springbootcurso.curso.Repositories.OrderRepositorie;
import com.springbootcurso.curso.Repositories.UserRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepositorie orderRepositorie;

    public List<Order> findAll() {
        return orderRepositorie.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = orderRepositorie.findById(id);
        return obj.get();
    }
}
