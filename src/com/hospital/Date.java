package com.hospital;

public class Date {
    private int date;
    private int day;
    private int year;


    public void setDate(int newDate,int newDay,int newYear) {
        this.date = newDate;
        this.day = newDay;
        this.year = newYear;
    }

    public int getDate() {
        return date;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }
}
