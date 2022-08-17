package ru.geekbrains.spring.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.geekbrains.spring.web.model.Product;
import ru.geekbrains.spring.web.repositories.InMemoryRepository;

import java.util.List;

@Service
public class ProductServices {
    private InMemoryRepository repository;

    @Autowired
    public void setRepository(InMemoryRepository repository) {
        this.repository = repository;
    }

    public List findAll(){
        return repository.findAllProducts();
    }

    public Product findProductByID(Long id){
        return repository.findProductByID(id);
    }
}
