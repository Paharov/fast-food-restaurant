package com.epam.training.designpatterns.fastfoodrestaurant;

public class Client {

    private static long idSequence = 0;
    private long id;
    private Robot robot;

    public Client(Robot robot) {
        this.id = idSequence++;
        this.robot = robot;
    }

    public void putOrder(Order order) {
        if (order != null) {
            robot.recordOrder(this, order);
        }
    }

    public void acceptMeal(Meal meal) {
        System.out.println(meal + " for client " + id);
    }

    public long getId() {
        return id;
    }

}
