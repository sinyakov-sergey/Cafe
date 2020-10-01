package ru.vsu.sample.Menu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FoodDatabase {

    private List<Dish> Menu = new LinkedList<>();

    public FoodDatabase() {
    }

    public List<Dish> getMenu() {
        return Menu;
    }

    public void setToMenu(Dish dish) {
        Menu.add(dish);
    }
}
