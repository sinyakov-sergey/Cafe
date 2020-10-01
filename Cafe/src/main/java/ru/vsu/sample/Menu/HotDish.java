package ru.vsu.sample.Menu;

import java.math.BigDecimal;

public class HotDish extends Dish {

    public HotDish(String name, BigDecimal price, int TimeInMinutes, Singularity singularity) {
        super(name, price, TimeInMinutes, singularity);
        setCategory(Category.hotDish);
    }
}
