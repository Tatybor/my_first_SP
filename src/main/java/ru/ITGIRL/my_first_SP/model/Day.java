package ru.ITGIRL.my_first_SP.model;

import org.springframework.stereotype.Component;

public enum Day {
    SUNDAY(" Воскресенье"),
    MONDAY(" Понедельник"),
    TUESDAY(" Вторник"),
    WEDNESDAY(" Среда"),
    THURSDAY(" Четверг"),
    FRIDAY(" Пятница"),
    SATURDAY(" Суббота");

    private String rusDay;

    Day(String rusDay) {
        this.rusDay = rusDay;
    }

    public String getRussianDay() {
        return rusDay;
    }
}
