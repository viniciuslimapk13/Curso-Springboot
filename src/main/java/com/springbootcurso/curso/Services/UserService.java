package com.springbootcurso.curso.Services;

import com.springbootcurso.curso.Entities.User;
import com.springbootcurso.curso.Repositories.UserRepositorie;
import com.springbootcurso.curso.Services.exceptions.DatabaseException;
import com.springbootcurso.curso.Services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
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
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User obj){
        return userRepositorie.save(obj);
    }

    public void delete(Long id){
        try{
            userRepositorie.deleteById(id);
        }catch(EmptyResultDataAccessException e){
            throw new ResourceNotFoundException(id);
        }catch (DataIntegrityViolationException e){
            throw new DatabaseException(e.getMessage());
        }
    }

    public User update(Long id, User obj){
        try{
            User entity = userRepositorie.getReferenceById(id);
            updateData(entity, obj);
            return userRepositorie.save(entity);
        }catch(EntityNotFoundException e) {
            throw new ResourceNotFoundException(id);
        }
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
}
