package com.epam.training.designpatterns.fastfoodrestaurant;

public class Meal {

    String orderName;

    public Meal(String orderName) {
        this.orderName = orderName;
    }

    public String getMockMeal() {
        return orderName + " meal";
    }
}
