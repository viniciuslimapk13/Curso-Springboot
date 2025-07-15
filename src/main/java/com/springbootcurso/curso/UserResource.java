package com.springbootcurso.curso;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> FindAll(){
        User u = new User(1L, "Maria", "m@gmail.com", "998979861", "123");
        return ResponseEntity.ok().body(u);
    }
}
