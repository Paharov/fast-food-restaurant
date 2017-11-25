package com.epam.training.designpatterns.fastfoodrestaurant;

public class Application {

    public static void main(String[] args) {

        Robot robot = new Robot();
        Client client = new Client(robot);
        client.putOrder(new Order("mock order"));
    }
}
