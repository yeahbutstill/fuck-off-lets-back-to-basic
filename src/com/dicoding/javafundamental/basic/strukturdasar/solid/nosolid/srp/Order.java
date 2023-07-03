package com.dicoding.javafundamental.basic.strukturdasar.solid.nosolid.srp;

import java.util.List;
import org.joda.time.DateTime;

public class Order {
    private String id;
    private List<Item> items;
    private DateTime dailyHistory;
    private DateTime monthlyHistory;
    private Long itemCount;

    public Order(String id, List<Item> items, DateTime dailyHistory, DateTime monthlyHistory, Long itemCount) {
        this.id = id;
        this.items = items;
        this.dailyHistory = dailyHistory;
        this.monthlyHistory = monthlyHistory;
        this.itemCount = itemCount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public DateTime getDailyHistory() {
        return dailyHistory;
    }

    public void setDailyHistory(DateTime dailyHistory) {
        this.dailyHistory = dailyHistory;
    }

    public DateTime getMonthlyHistory() {
        return monthlyHistory;
    }

    public void setMonthlyHistory(DateTime monthlyHistory) {
        this.monthlyHistory = monthlyHistory;
    }

    public Long getItemCount() {
        return itemCount;
    }

    public void setItemCount(Long itemCount) {
        this.itemCount = itemCount;
    }

    void calculateTotalSum() {/*...*/
    }

    void addItem(Item item) {/*...*/
    }

    void deleteItem(Item item) {/*...*/
    }

    void printOrder() {/*...*/
    }

    void showOrder() {/*...*/
    }

}