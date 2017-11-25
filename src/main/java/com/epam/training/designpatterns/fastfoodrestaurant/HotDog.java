package com.epam.training.designpatterns.fastfoodrestaurant;

public class HotDog implements Product {

    private static final double HOTDOG_INCREMENT = 2.0;

    public double getNewHappiness(double oldHappiness) {
        return oldHappiness + HOTDOG_INCREMENT;
    }

}
