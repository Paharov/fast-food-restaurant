package com.epam.training.designpatterns.fastfoodrestaurant;

public class Meal {

    Product product;

    public Meal(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Meal [product=" + product + "]";
    }

}
