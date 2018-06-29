package implementations.FoodDeliveryApp;

import java.util.HashMap;
import java.util.Map;

public class Order {

    private double orderId;
    private Map<FoodItem,Integer> foodMap;
    private OrderStatus status;
    private float amountPayable;
    private PaymentMode paymentMode;

    public Order() {
        orderId = Math.random()*1.5;
        foodMap = new HashMap<FoodItem,Integer>();
        amountPayable = 0.0f;
        status = OrderStatus.ORDER_RECEIVED;
    }

    public double getOrderId() {return orderId;}

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(FoodItem item,int quantity) {
        foodMap.put(item,quantity);
        this.amountPayable += item.getPrice()*quantity;
    }

    public float getAmountPayable() {
        return amountPayable;
    }

    public void payBill(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
        System.out.println("Payment Received!");
    }
}
