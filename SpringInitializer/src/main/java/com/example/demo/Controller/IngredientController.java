package com.example.demo.Controller;
import com.example.demo.Entities.Ingredient;
import com.example.demo.Services.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {

    @Autowired
    public IngredientService IngredientService;

    @PostMapping("/add-ingredient")
    public ResponseEntity<?> insertIngredient(@RequestBody Ingredient ingredient){
        IngredientService.insertIngredientTest(ingredient);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/get-all-ingredients")
    public List<Ingredient> getAllIngredients(){
        return IngredientService.getAllIngredient();
    }

    @GetMapping("/get-ingredient/{id}")
    public ResponseEntity<?> getIngredient(@PathVariable("id") Long id){
        return ResponseEntity.ok().body(IngredientService.getIngredient(id));
    }

    @PutMapping("/update-ingredient/{id}")
    public ResponseEntity<?> updateIngredient(@RequestBody Ingredient i, @PathVariable("id") Long id){
        IngredientService.updateIngredient(i);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteIngredient(@PathVariable("id") Long id){
        IngredientService.deleteIngredient(id);
        return ResponseEntity.ok().build();
    }
}