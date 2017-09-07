package com.example.terry.tzaneentour;

/**
 * Created by TERRY on 2017/08/17.
 */

public class customer {
    static private long id;
    static private String place;
    static private String name;
    static private String date;
    static private String time;


    public customer() {
    }

    public customer(long id,String place, String name,String date,String time) {
        this.id = id;
        this.date=date;
        this.time=time;
        this.place = place;
        this.name = name;


    }

    public static long getId() {
        return id;
    }

    public static void setId(long id) {
        customer.id = id;
    }

    public static String getPlace() {
        return place;
    }

    public static void setPlace(String place) {
        customer.place = place;
    }

    public static String getName() {
        return name;
    }


    public static void setName(String name) {
        customer.name = name;
    }

    public static String getDate() {
        return date;
    }

    public static void setDate(String date) {
        customer.date = date;
    }

    public static String getTime() {
        return time;
    }

    public static void setTime(String time) {
        customer.time = time;
    }
}
