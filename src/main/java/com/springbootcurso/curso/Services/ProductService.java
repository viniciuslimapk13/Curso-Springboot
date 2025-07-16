package com.springbootcurso.curso.Services;

import com.springbootcurso.curso.Entities.Product;
import com.springbootcurso.curso.Repositories.ProductRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepositorie productRepositorie;

    public List<Product> findAll() {
        return productRepositorie.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = productRepositorie.findById(id);
        return obj.get();
    }
}
