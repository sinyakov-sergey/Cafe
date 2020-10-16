import org.junit.jupiter.api.Test;
import ru.vsu.sample.Menu.*;
import ru.vsu.sample.Menu.Drinks.HotDrink;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WaiterTest {
    @Test
    public void TestTime(){
        Client client = new Client(12, new BigDecimal("10000.0"), Singularity.NOSINGULARITY);
        FoodDatabase menu = menu();
        List<Dish> list = Waiter.SuggestOrder(client, menu);
        assertEquals(list.get(0).getName(), "Чай");
        assertEquals(list.get(1).getName(), "Гречка");
    }

    @Test
    public void TestPrice(){
        Client client = new Client(60, new BigDecimal("310.0"), Singularity.NOSINGULARITY);
        FoodDatabase menu = menu();
        List<Dish> list = Waiter.SuggestOrder(client, menu);
        assertEquals(list.get(0).getName(), "Чай");
        assertEquals(list.get(1).getName(), "Гречка");
        assertEquals(list.get(2).getName(), "Оливье");
    }

    @Test
    public void TestSingularity(){
        Client client = new Client(60, new BigDecimal("10000.0"), Singularity.SWEET);
        FoodDatabase menu = menu();
        List<Dish> list = Waiter.SuggestOrder(client, menu);
        assertEquals(list.get(0).getName(), "Чай");
    }

    @Test
    public void TestCalculateCheck(){
        Client client = new Client(60, new BigDecimal("10000.0"), Singularity.NOSINGULARITY);
        FoodDatabase menu = menu();
        client.putInOrder(menu.getToIndex(0));
        client.putInOrder(menu.getToIndex(1));
        client.putInOrder(menu.getToIndex(2));
        BigDecimal check = CalculateCheck.calculateOrder(client);
        assertEquals(check, new BigDecimal("490.0"));
    }


    private FoodDatabase menu(){
        FoodDatabase foodDatabase = new FoodDatabase();
        Soup borsh = new Soup("Борщ", new BigDecimal("350.0"), 30, Singularity.SOUR);
        HotDrink tea = new HotDrink("Чай", new BigDecimal("40"), 5, Singularity.SWEET, 100);
        Garnish grechka = new Garnish("Гречка", new BigDecimal("100.0"), 10, Singularity.NOSINGULARITY);
        HotDish shashlik = new HotDish("Шашлык", new BigDecimal("500.0"), 25, Singularity.NOSINGULARITY);
        Salad olive = new Salad("Оливье", new BigDecimal("300.0"), 15, Singularity.NOSINGULARITY);
        foodDatabase.setToMenu(borsh);
        foodDatabase.setToMenu(tea);
        foodDatabase.setToMenu(grechka);
        foodDatabase.setToMenu(shashlik);
        foodDatabase.setToMenu(olive);
        return foodDatabase;
    }
}