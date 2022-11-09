package com.example.lab7.order;

import com.example.lab7.delivery.Delivery;
import com.example.lab7.flower.Item;
import com.example.lab7.payments.Payment;
import lombok.Setter;
import java.util.LinkedList;

public class Order {

    private LinkedList<Item> items = new LinkedList<>();
    @Setter
    private Payment payment;
    @Setter
    private Delivery delivery;

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Item item:
             items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public void processOrder() {
        if (payment.pay()) {
            delivery.deliver();
        }
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }
}
