package com.example.demo.Entities;
import jakarta.persistence.*;

@Entity
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;
    private Boolean isSummerMeal;
    private Boolean isWinterMeal;

    public Meal() {
    }

    public Meal(Long id, String name, String description, Double price, Boolean isSummerMeal, Boolean isWinterMeal) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.isSummerMeal = isSummerMeal;
        this.isWinterMeal = isWinterMeal;
    }

    public Meal(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public Boolean getSummerMeal() {
        return isSummerMeal;
    }

    public void setSummerMeal(Boolean summerMeal) {
        isSummerMeal = summerMeal;
    }

    public Boolean getWinterMeal() {
        return isWinterMeal;
    }

    public void setWinterMeal(Boolean winterMeal) {
        isWinterMeal = winterMeal;
    }
}