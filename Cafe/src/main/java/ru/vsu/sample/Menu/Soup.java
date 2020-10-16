package ru.vsu.sample.Menu;

import java.math.BigDecimal;

public class Soup extends Dish {

    public Soup(String name, BigDecimal price, int TimeInMinutes, Singularity singularity) {
        super(name, price, TimeInMinutes, singularity);
        setCategory(Category.SOUP);
    }
}
