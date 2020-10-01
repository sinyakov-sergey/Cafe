package ru.vsu.sample.Menu;

import java.math.BigDecimal;

public class Salad extends Dish {

    public Salad(String name, BigDecimal price, int TimeInMinutes, Singularity singularity) {
        super(name, price, TimeInMinutes, singularity);
        setCategory(Category.salad);
    }

}
