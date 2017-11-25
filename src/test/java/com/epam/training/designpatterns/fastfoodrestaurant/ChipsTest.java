package com.epam.training.designpatterns.fastfoodrestaurant;

import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class ChipsTest {

    private Product chips;

    @Before
    public void initChips() {
        chips = new Chips();
    }

    @Test
    public void doesNotIncreaseHappinessWhenHappinessIsZero() {
        double oldHappiness = 0.0;

        double newHappiness = chips.getNewHappiness(oldHappiness);

        assertThat(newHappiness, is(closeTo(0.0, 0.001)));
    }

    @Test
    public void increasesHappinessByFivePercentWhenHappinessIsPositiveWhole() {
        double oldHappiness = 1.0;

        double newHappiness = chips.getNewHappiness(oldHappiness);

        assertThat(newHappiness, is(closeTo(1.05, 0.001)));
    }

    @Test
    public void increasesHappinessByFivePercentWhenHappinessIsPositiveDecimal() {
        double oldHappiness = 1.5;

        double newHappiness = chips.getNewHappiness(oldHappiness);

        assertThat(newHappiness, is(closeTo(1.575, 0.001)));
    }

    @Test
    public void increasesHappinessByFivePercentWhenHappinessIsNegative() {
        double oldHappiness = -1.5;

        double newHappiness = chips.getNewHappiness(oldHappiness);

        assertThat(newHappiness, is(closeTo(-1.425, 0.001)));
    }

}
