package com.example.demo.Services;

import com.example.demo.Entities.Ingredient;
import com.example.demo.Repositories.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class IngredientService {

    @Autowired
    public IngredientRepository IngredientRepo;

    public void insertIngredientTest(Ingredient ingredient){
        IngredientRepo.save(ingredient);
    }

    public List<Ingredient> getAllIngredient(){
        return IngredientRepo.findAll();
    }

    public Optional<Ingredient> getIngredient(Long id){
        return IngredientRepo.findById(id);
    }

    public void updateIngredient(Ingredient i){
        IngredientRepo.deleteById(i.getId());
        IngredientRepo.save(i);
    }

    public void deleteIngredient(Long id){
        IngredientRepo.deleteById(id);
    }
}