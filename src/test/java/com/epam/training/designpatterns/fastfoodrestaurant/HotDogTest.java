package com.epam.training.designpatterns.fastfoodrestaurant;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class HotDogTest {

    private Product hotDog;

    @Before
    public void initHotDog() {
        hotDog = new HotDog();
    }

    @Test
    public void increasesHappinessByTwoWhenHappinessIsZero() {
        double oldHappiness = 0.0;

        double newHappiness = hotDog.getNewHappiness(oldHappiness);

        assertThat(newHappiness, is(equalTo(2.0)));
    }

    @Test
    public void increasesHappinessByTwoWhenHappinessIsPositiveWhole() {
        double oldHappiness = 1.0;

        double newHappiness = hotDog.getNewHappiness(oldHappiness);

        assertThat(newHappiness, is(equalTo(3.0)));
    }

    @Test
    public void increasesHappinessByTwoWhenHappinessIsPositiveDecimal() {
        double oldHappiness = 1.5;

        double newHappiness = hotDog.getNewHappiness(oldHappiness);

        assertThat(newHappiness, is(equalTo(3.5)));
    }

    @Test
    public void increasesHappinessByTwoWhenHappinessIsNegative() {
        double oldHappiness = -1.5;

        double newHappiness = hotDog.getNewHappiness(oldHappiness);

        assertThat(newHappiness, is(equalTo(0.5)));
    }

}
