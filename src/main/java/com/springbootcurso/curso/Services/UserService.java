package com.springbootcurso.curso.Services;

import com.springbootcurso.curso.Entities.User;
import com.springbootcurso.curso.Repositories.UserRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepositorie userRepositorie;

    public List<User> findAll() {
        return userRepositorie.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = userRepositorie.findById(id);
        return obj.get();
    }
}
