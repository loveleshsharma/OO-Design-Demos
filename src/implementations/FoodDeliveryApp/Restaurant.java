package implementations.FoodDeliveryApp;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private String name;
    private Menu menu;
    private List<Order> orderList = new ArrayList<Order>();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public void placeOrder(Order order) {
        orderList.add(order);
        order.setStatus(OrderStatus.ORDER_ACCEPTED);
        System.out.println("Order placed!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        prepareOrder(order);
    }

    public void cancelOrder(Order order) {
        orderList.remove(order);
        System.out.println("Order cancelled!");
        order.setStatus(OrderStatus.ORDER_CANCELLED);
    }

    private void prepareOrder(Order order) {
        order.setStatus(OrderStatus.ORDER_INPROCESS);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        order.setStatus(OrderStatus.ORDER_COMPLETED);
    }

    public void deliverOrder(Order order) {
        if(order.getStatus() == OrderStatus.ORDER_COMPLETED) {
            order.setStatus(OrderStatus.ORDER_DELIVERED);
            System.out.println("Order Delivered!");
            System.out.println("Thank you for using Food Delivery App!");
        } else {
            System.out.println("OOPs! Order is still being prepared! Please Wait!");
        }
    }

}
