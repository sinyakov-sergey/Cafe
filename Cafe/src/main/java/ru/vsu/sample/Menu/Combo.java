package ru.vsu.sample.Menu;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Combo extends Dish{

    private List<Dish> list = new LinkedList<>();

    public Combo(String name, BigDecimal price, int TimeInMinutes, Singularity singularity) {
        super(name, price, TimeInMinutes, singularity);
        setCategory(Category.combo);
    }

    public List<Dish> getList() {
        return list;
    }

    public void putToList(Dish dish) {
        list.add(dish);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("в комбо входят : ");
        for (Dish dish : list){
            str.append(dish.getName());
        }
        return str.toString();
    }
}
