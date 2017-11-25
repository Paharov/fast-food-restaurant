package com.epam.training.designpatterns.fastfoodrestaurant;

public class Robot {

    public void recordOrder(Order order) {
        prepareMeal(order);
    }

    public void prepareMeal(Order order) {
        serveMeal(new Meal(order.getName()));
    }

    public void serveMeal(Meal meal) {
        System.out.println(meal.getMockMeal());
    }
}
