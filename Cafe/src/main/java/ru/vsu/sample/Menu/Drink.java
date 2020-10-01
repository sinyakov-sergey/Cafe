package ru.vsu.sample.Menu;

import java.math.BigDecimal;

public class Drink extends Dish {

    public Drink(String name, BigDecimal price, int TimeInMinutes, Singularity singularity) {
        super(name, price, TimeInMinutes, singularity);
        setCategory(Category.drink);
    }

}
