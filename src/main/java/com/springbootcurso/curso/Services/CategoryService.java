package com.springbootcurso.curso.Services;

import com.springbootcurso.curso.Entities.Category;
import com.springbootcurso.curso.Repositories.CategoryRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepositorie categoryRepositorie;

    public List<Category> findAll() {
        return categoryRepositorie.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = categoryRepositorie.findById(id);
        return obj.get();
    }
}
