package ru.vsu.sample.Menu.Drinks;

import ru.vsu.sample.Menu.Category;
import ru.vsu.sample.Menu.Drink;
import ru.vsu.sample.Menu.Singularity;

import java.math.BigDecimal;

public class AlcoholicDrink extends Drink {

    public AlcoholicDrink(String name, BigDecimal price, int TimeInMinutes, Singularity singularity) {
        super(name, price, TimeInMinutes, singularity);
        setCategory(Category.alcoholicDrink);
    }
}
