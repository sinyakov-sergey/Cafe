import ru.vsu.sample.Menu.Dish;
import ru.vsu.sample.Menu.FoodDatabase;
import ru.vsu.sample.Menu.Singularity;


import java.math.BigDecimal;
import java.util.List;

public class Waiter {
    public static List<Dish> SuggestOrder(Client client, FoodDatabase foodDatabase){
        List<Dish> AllFood = foodDatabase.getMenu();
        //отбрасываем варианты по времени и предпочтениям
        for (int i = 0; i < AllFood.size(); i++){
            Dish dish = AllFood.get(i);
            if (dish.getTimeInMinutes() > client.getTimeInMinutes() || dish.getPrice().compareTo(client.getMoney()) > 0){
                AllFood.remove(dish);
                i--;
            }
            else {
                if (!Singularity.NOSINGULARITY.equals(client.getPrecedency())){
                    if (!dish.getSingularity().equals(client.getPrecedency())){
                        AllFood.remove(dish);
                        i--;
                    }
                }
            }
        }
        return AllFood;
    }
}

