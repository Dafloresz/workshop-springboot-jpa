package com.projeto.webservice.services;

import com.projeto.webservice.entities.User;
import com.projeto.webservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }
    
    public User findByID (Long id){
        Optional<User> userById = repository.findById(id);
        return userById.get();
    }

    public User insert (User user){
        return repository.save(user);
    }
}
