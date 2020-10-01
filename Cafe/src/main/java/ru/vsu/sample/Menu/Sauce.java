package ru.vsu.sample.Menu;

import java.math.BigDecimal;

public class Sauce extends Dish {

    public Sauce(String name, BigDecimal price, int TimeInMinutes, Singularity singularity) {
        super(name, price, TimeInMinutes, singularity);
        setCategory(Category.sauce);
    }
}
