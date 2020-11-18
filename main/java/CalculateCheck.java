import ru.vsu.sample.Menu.Dish;

import java.math.BigDecimal;
import java.util.List;

public class CalculateCheck {

    public static BigDecimal calculateOrder(Client client) {
        List<Dish> order = client.getOrder();
        BigDecimal check = new BigDecimal("0.0");
        for (Dish dish : order) {
            check = check.add(dish.getPrice());
        }
        if (client.getMoney().compareTo(check) < 0) return new BigDecimal("-1");
        return check;
    }
}
