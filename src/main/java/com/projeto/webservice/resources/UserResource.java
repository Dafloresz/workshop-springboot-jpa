package com.projeto.webservice.resources;

import com.projeto.webservice.entities.User;
import com.projeto.webservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> listUser = service.findAll();
        return ResponseEntity.ok().body(listUser);
    }

    @GetMapping (value = "/{id}")
    public ResponseEntity<User> findById (@PathVariable Long id) {
        User userById = service.findByID(id);
        return ResponseEntity.ok().body(userById);
    }

    @PostMapping
    public ResponseEntity<User> insert (@RequestBody User user){
        user = service.insert(user);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(uri).body(user);
    }
}