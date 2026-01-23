package com.projeto.webservice.services;

import com.projeto.webservice.entities.Category;
import com.projeto.webservice.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category findById(Long id){
        Optional<Category> categoryById = categoryRepository.findById(id);
        return categoryById.get();
    }

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }
}
