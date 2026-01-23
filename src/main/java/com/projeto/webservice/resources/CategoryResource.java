package com.projeto.webservice.resources;

import com.projeto.webservice.entities.Category;
import com.projeto.webservice.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id) {
        Category categoryById = service.findById(id);
        return ResponseEntity.ok().body(categoryById);
    }

    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        List<Category> categoryList = service.findAll();
        return ResponseEntity.ok().body(categoryList);
    }
}
