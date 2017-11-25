package com.epam.training.designpatterns.fastfoodrestaurant;

public class Chips implements Product {

    private static final double CHIPS_PERCENT_INCREMENT = 0.05;

    public double getNewHappiness(double oldHappiness) {
        double fivePercent = Math.abs(oldHappiness) * CHIPS_PERCENT_INCREMENT;
        return oldHappiness + fivePercent;
    }

    @Override
    public String toString() {
        return "Chips";
    }

}
