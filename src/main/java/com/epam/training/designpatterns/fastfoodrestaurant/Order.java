package com.epam.training.designpatterns.fastfoodrestaurant;

public class Order {

    private Product mainDish;

    private Order(Product mainDish) {
        this.mainDish = mainDish;
    }

    public Product getMainDish() {
        return mainDish;
    }

    @Override
    public String toString() {
        return "Order [mainDish=" + mainDish + "]";
    }

    public static class Builder {

        private Product mainDish;

        public Builder setMainDish(Product mainDish) {
            this.mainDish = mainDish;
            return this;
        }

        public Order build() {
            if (mainDish == null) {
                return null;
            }

            return new Order(mainDish);
        }
    }
}
