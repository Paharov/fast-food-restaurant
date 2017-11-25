package com.epam.training.designpatterns.fastfoodrestaurant;

public class Robot {

    public void recordOrder(Client client, Order order) {
        prepareMeal(client, order);
    }

    private void prepareMeal(Client client, Order order) {
        Meal meal = new Meal(order.getMainDish());
        serveMeal(client, meal);
    }

    private void serveMeal(Client client, Meal meal) {
        client.acceptMeal(meal);
    }
}
