package com.dicoding.javafundamental.basic.strukturdasar.solid.srp;

import org.joda.time.DateTime;

public class Main {
    public static void main(String[] args) {
        Item item = new Item();
        item.setId("XLPREPAID");
        item.setName("XL");
        item.setNominal(50000);
        item.setPhoneNumber("087832081093");

        Order order = new Order();
        order.addItem(item);
        System.out.println(item);

        OrderHistory history = new OrderHistory();
        history.setDateTime(new DateTime());
        history.getDailyHistory();
        System.out.println(history);

        OrderViewer viewer = new OrderViewer();
        viewer.printOrder(order);
        System.out.println(order);
    }
}
