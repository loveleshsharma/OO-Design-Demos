package implementations.FoodDeliveryApp;

public class MainApplication {

    public static void main(String...args) {
        City myCity = new City(Cities.CHENNAI);
        Restaurant restaurant = myCity.getRestaurants().get(0);
        Order myOrder = new Order();
        System.out.println(myOrder.getOrderId());
        myOrder.addItem(restaurant.getMenu().getItems().get(1),1);
        myOrder.addItem(restaurant.getMenu().getItems().get(2),2);
        restaurant.deliverOrder(myOrder);
        restaurant.placeOrder(myOrder);
        System.out.println(myOrder.getStatus());
        restaurant.deliverOrder(myOrder);

    }

}
