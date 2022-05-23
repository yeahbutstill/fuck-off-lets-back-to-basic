package com.dicoding.javafundamental.basic.strukturdasar.solid.srp;

import org.joda.time.DateTime;

public class OrderHistory {

    private DateTime dateTime;

    public DateTime getDailyHistory() {
        return dateTime;
    }

    public void setDateTime(DateTime dateTime) {
        this.dateTime = dateTime;
    }

    public DateTime getMonthlyHistory() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "OrderHistory{" +
                "dateTime=" + dateTime +
                '}';
    }
}