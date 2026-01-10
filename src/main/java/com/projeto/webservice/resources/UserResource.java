package com.projeto.webservice.resources;

import com.projeto.webservice.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1, "Thiago", "thiaguin@gmail", "219907774", "cavalinho");
        return ResponseEntity.ok().body(u);
    }
}