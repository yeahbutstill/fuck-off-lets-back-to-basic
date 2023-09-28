package com.yeahbutstill.java21.enhancedswitch;

import java.time.DayOfWeek;

public class EnhancedSwitchTest {
    public static void main(String[] args) {
        EnhancedSwitchTest enhancedSwitchTest = new EnhancedSwitchTest();
        int i = enhancedSwitchTest.calculateOldTimeOff(DayOfWeek.FRIDAY);
        int h = enhancedSwitchTest.calculateOldTimeOff(DayOfWeek.SUNDAY);
        System.out.println(i == 16);
        System.out.println(h == 24);

        System.out.println(enhancedSwitchTest.calculateNewTimeOff(DayOfWeek.FRIDAY));
        System.out.println(enhancedSwitchTest.calculateNewTimeOff(DayOfWeek.SUNDAY));
    }

    public int calculateNewTimeOff(DayOfWeek dayOfWeek) {
        return switch (dayOfWeek) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> 16;
            case SATURDAY, SUNDAY -> 24;
        };
    }

    public int calculateOldTimeOff(DayOfWeek dayOfWeek) {
        int timeoff = 0;
        switch (dayOfWeek) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY:
                timeoff = 16;
                break;
            case SATURDAY, SUNDAY:
                timeoff = 24;
                break;
        }

        return timeoff;
    }
}
