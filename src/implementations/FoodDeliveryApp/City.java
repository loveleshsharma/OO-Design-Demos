package implementations.FoodDeliveryApp;

import java.util.ArrayList;
import java.util.List;

public class City {

    private Cities city;
    private List<Restaurant> restaurants;

    public City(Cities city) {
        this.city = city;
        restaurants = new ArrayList<Restaurant>();
        generateRestaurantData();
    }

    private void generateRestaurantData() {
        Restaurant sarvanaBhavan = new Restaurant();
        sarvanaBhavan.setName("Sarvana Bhavan");
        Menu sarvanaMenu = new Menu();
        sarvanaMenu.addItem(new FoodItem.FoodBuilder().setName("Sambar vada").setCategory(FoodCategory.STARTER).setCuisine(Cuisine.SOUTHINDIAN).setPrice(30).setIsVeg(true).build());
        sarvanaMenu.addItem(new FoodItem.FoodBuilder().setName("Masala Dosa").setCategory(FoodCategory.MAINCOURSE).setCuisine(Cuisine.SOUTHINDIAN).setPrice(65).setIsVeg(true).build());
        sarvanaMenu.addItem(new FoodItem.FoodBuilder().setName("Sweet Pongal").setCategory(FoodCategory.DESSERT).setCuisine(Cuisine.SOUTHINDIAN).setPrice(50).setIsVeg(true).build());
        sarvanaBhavan.setMenu(sarvanaMenu);

        Restaurant punjabTown = new Restaurant();
        punjabTown.setName("Punjab Town");
        Menu punjabMenu = new Menu();
        punjabMenu.addItem(new FoodItem.FoodBuilder().setName("Tandoori Chicken").setCategory(FoodCategory.MAINCOURSE).setCuisine(Cuisine.NORTHINDIAN).setPrice(95).setIsVeg(false).build());
        punjabMenu.addItem(new FoodItem.FoodBuilder().setName("Punjabi Thali").setCategory(FoodCategory.MAINCOURSE).setCuisine(Cuisine.NORTHINDIAN).setPrice(120).setIsVeg(true).build());
        punjabMenu.addItem(new FoodItem.FoodBuilder().setName("Aalu Paratha").setCategory(FoodCategory.MAINCOURSE).setCuisine(Cuisine.NORTHINDIAN).setPrice(60).setIsVeg(true).build());
        punjabTown.setMenu(punjabMenu);

        Restaurant chookFork = new Restaurant();
        chookFork.setName("Chook Fork");
        Menu chookForkMenu = new Menu();
        chookForkMenu.addItem(new FoodItem.FoodBuilder().setName("Schezwan Noodles").setCategory(FoodCategory.MAINCOURSE).setCuisine(Cuisine.CHINESE).setPrice(150).setIsVeg(true).build());
        chookForkMenu.addItem(new FoodItem.FoodBuilder().setName("Chow mein").setCategory(FoodCategory.STARTER).setCuisine(Cuisine.CHINESE).setPrice(120).setIsVeg(true).build());
        chookForkMenu.addItem(new FoodItem.FoodBuilder().setName("Chicken Soup").setCategory(FoodCategory.STARTER).setCuisine(Cuisine.CHINESE).setPrice(100).setIsVeg(false).build());
        chookFork.setMenu(chookForkMenu);

        restaurants.add(sarvanaBhavan);
        restaurants.add(punjabTown);
        restaurants.add(chookFork);
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }





}
