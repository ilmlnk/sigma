package com.company.lesson8.birthday;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            BirthDayFiveYears calendar = new BirthDayFiveYears(1, 3, 2003+i);
            System.out.println(calendar.printFullDate());
        }
    }
}

public class BirthDayFiveYears {
    private int day;
    private int month;
    private int year;
    Calendar constructCalendar;
    DateFormat df = new SimpleDateFormat("dd MMM yyy (EEEE)");

    public BirthDayFiveYears() {
        this.day = 1;
        this.month = 0;
        this.year = 2000;

        this.constructCalendar = new GregorianCalendar(year, month, day);
    }

    public BirthDayFiveYears(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;

        this.constructCalendar = new GregorianCalendar(year, month - 1, day);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String printFullDate() {
        return df.format(this.constructCalendar.getTime());
    }

}
