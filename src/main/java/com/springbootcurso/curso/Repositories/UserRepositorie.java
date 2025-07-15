package com.springbootcurso.curso.Repositories;

import com.springbootcurso.curso.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositorie extends JpaRepository<User, Long> {

}
