package com.projeto.webservice.services;

import com.projeto.webservice.entities.User;
import com.projeto.webservice.repositories.UserRepository;
import jakarta.transaction.Transactional;
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

    public void delete(Long id){
        repository.deleteById(id);
    }

    @Transactional
    public User update(Long id, User user){
        User entity = repository.getReferenceById(id);
        updateData(entity, user);
        return entity;
    }

    private void updateData(User entity, User data){
        entity.setName(data.getName());
        entity.setEmail(data.getEmail());
        entity.setPhone(data.getPhone());
    }

}
