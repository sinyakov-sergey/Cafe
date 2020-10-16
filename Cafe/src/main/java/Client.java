import ru.vsu.sample.Menu.Dish;
import ru.vsu.sample.Menu.Singularity;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class Client {

    private final int TimeInMinutes;

    private final BigDecimal money;

    private final Singularity precedency;//предпочтения в еде

    private final List<Dish> order = new LinkedList<>();
    

    public Client(int TimeInMinutes, BigDecimal money, Singularity precedency) {
        this.TimeInMinutes = TimeInMinutes;
        this.money = money;
        this.precedency = precedency;
    }

    public int getTimeInMinutes() {
        return TimeInMinutes;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public Singularity getPrecedency() {
        return precedency;
    }

    public List<Dish> getOrder() {
        return order;
    }

    public void putInOrder(Dish dish) {
        order.add(dish);
    }
}
