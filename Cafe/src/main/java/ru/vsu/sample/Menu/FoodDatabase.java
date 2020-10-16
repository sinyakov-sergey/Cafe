package ru.vsu.sample.Menu;

import java.util.LinkedList;
import java.util.List;

public class FoodDatabase {

    private final List<Dish> Menu = new LinkedList<>();


    public List<Dish> getMenu() {
        return Menu;
    }

    public void setToMenu(Dish dish) {
        Menu.add(dish);
    }

    public Dish getToIndex(int index){
        return Menu.get(index);
    }
}
