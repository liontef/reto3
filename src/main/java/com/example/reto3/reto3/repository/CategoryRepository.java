package com.example.reto3.reto3.repository;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.reto3.reto3.model.Category;
import com.example.reto3.reto3.repository.crud.CategoryCrudRepository;

@Repository
public class CategoryRepository {

    @Autowired
    private CategoryCrudRepository categoryCrudRepository;


    public List<Category> getAll(){

        return (List<Category>) categoryCrudRepository.findAll();
    }

    public Optional<Category> getCategory(int id){

        return categoryCrudRepository.findById(id);

    }

    public Category save(Category cate){

        return categoryCrudRepository.save(cate);
    }
    
}

