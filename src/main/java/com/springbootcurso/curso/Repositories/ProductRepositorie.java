package com.springbootcurso.curso.Repositories;

import com.springbootcurso.curso.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositorie extends JpaRepository<Product, Long> {

}
