package com.epam.training.designpatterns.fastfoodrestaurant;

public class Application {

    public static void main(String[] args) {

        Robot robot = new Robot();
        Client client1 = new Client(robot);
        Client client2 = new Client(robot);

        client1.putOrder(new Order.Builder().setMainDish(new Chips()).build());
        client2.putOrder(new Order.Builder().setMainDish(new HotDog()).build());

    }
}
