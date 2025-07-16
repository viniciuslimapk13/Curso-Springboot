package com.springbootcurso.curso.Repositories;

import com.springbootcurso.curso.Entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepositorie extends JpaRepository<Category, Long> {

}
