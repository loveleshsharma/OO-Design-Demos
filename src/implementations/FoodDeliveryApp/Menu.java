package implementations.FoodDeliveryApp;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    public Menu() {
        items = new ArrayList<FoodItem>();
    }

    public List<FoodItem> getItems() {
        return items;
    }

    public void addItem(FoodItem item) {
        items.add(item);
    }

    private List<FoodItem> items;

}
