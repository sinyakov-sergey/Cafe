package ru.vsu.sample.Menu.Drinks;

import ru.vsu.sample.Menu.Category;
import ru.vsu.sample.Menu.Drink;
import ru.vsu.sample.Menu.Singularity;

import java.math.BigDecimal;

public class SweetDrink extends Drink {

    public SweetDrink(String name, BigDecimal price, int TimeInMinutes, Singularity singularity) {
        super(name, price, TimeInMinutes, singularity);
        setCategory(Category.sweetDrink);
    }
}
