package ru.vsu.sample.Menu;

import java.math.BigDecimal;

public class Garnish extends Dish {

    public Garnish(String name, BigDecimal price, int TimeInMinutes, Singularity singularity) {
        super(name, price, TimeInMinutes, singularity);
        setCategory(Category.GARNISH);
    }
}
