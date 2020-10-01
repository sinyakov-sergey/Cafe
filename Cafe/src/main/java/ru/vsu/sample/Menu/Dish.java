package ru.vsu.sample.Menu;

import java.math.BigDecimal;

public abstract class Dish {

    private String name;

    private BigDecimal price;

    private int TimeInMinutes;

    private Category category;//раздел блюда в меню(салат, суп,...)

    private Singularity singularity;//особенность блюда

    public Dish() {
    }

    public Dish(String name, BigDecimal price, int TimeInMinutes, Singularity singularity){
        this.name = name;
        this.price = price;
        this.TimeInMinutes = TimeInMinutes;
        this.singularity = singularity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getTimeInMinutes() {
        return TimeInMinutes;
    }

    public void setTimeInMinutes(int TimeInMinutes) {
        this.TimeInMinutes = TimeInMinutes;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Singularity getSingularity() {
        return singularity;
    }

    public void setSingularity(Singularity singularity) {
        this.singularity = singularity;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", TimeInMinutes=" + TimeInMinutes +
                ", category='" + category + '\'' +
                '}';
    }

}
