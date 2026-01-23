package com.projeto.webservice.services;

import com.projeto.webservice.entities.Product;
import com.projeto.webservice.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product findById(Long id){
        Optional<Product> productById = productRepository.findById(id);
        return productById.get();
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }
}
