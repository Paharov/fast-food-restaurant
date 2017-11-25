package com.epam.training.designpatterns.fastfoodrestaurant;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class OrderTest {

    private Order.Builder orderBuilder;

    @Before
    public void initOrderBuilder() {
        orderBuilder = new Order.Builder();
    }

    @Test
    public void builderReturnsSimpleHotDogOrderWhenSetToHotDog() {
        orderBuilder.setMainDish(new HotDog());

        Order order = orderBuilder.build();

        assertThat(order.toString(), is(equalTo("Order [mainDish=HotDog]")));
    }

    @Test
    public void builderReturnsSimpleChipsOrderWhenSetToChips() {
        orderBuilder.setMainDish(new Chips());

        Order order = orderBuilder.build();

        assertThat(order.toString(), is(equalTo("Order [mainDish=Chips]")));
    }

}
