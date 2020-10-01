import org.junit.jupiter.api.Test;
import ru.vsu.sample.Menu.*;
import ru.vsu.sample.Menu.Drinks.HotDrink;

import java.math.BigDecimal;
import java.util.List;


class WaiterTest {

    @Test
    public void Test(){
        Client client = new Client(15, new BigDecimal("400.0"), Singularity.sweet);
        FoodDatabase foodDatabase = new FoodDatabase();
        Soup borsh = new Soup("Борщ", new BigDecimal("300.0"), 30, Singularity.sour);
        HotDrink tea = new HotDrink("Чай", new BigDecimal("40"), 5, Singularity.sweet);
        Garnish grechka = new Garnish("Гречка", new BigDecimal("100.0"), 10, Singularity.noSingularity);
        HotDish shashlik = new HotDish("Шашлык", new BigDecimal("500.0"), 25, Singularity.noSingularity);
        Salad olive = new Salad("Оливье", new BigDecimal("300.0"), 15, Singularity.noSingularity);
        foodDatabase.setToMenu(borsh);
        foodDatabase.setToMenu(tea);
        foodDatabase.setToMenu(grechka);
        foodDatabase.setToMenu(shashlik);
        foodDatabase.setToMenu(olive);

        List<Dish> list = Waiter.SuggestOrder(client, foodDatabase);
        client.putInOrder(shashlik);
        BigDecimal check = Waiter.calculateOrder(client);
        System.out.println(check.floatValue());
    }

}