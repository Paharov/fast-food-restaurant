package com.epam.training.designpatterns.fastfoodrestaurant;

public class Order {

    public String mockOrder;

    public Order(String mockOrder) {
        this.mockOrder = mockOrder;
    }

    public String getName() {
        return mockOrder;
    }
}
