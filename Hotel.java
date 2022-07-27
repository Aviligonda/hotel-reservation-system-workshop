package com.bridzelab;

public class Hotel {
    String hotelName;
    int weekDayRent;
    int weekendDayRent;

    public Hotel(String hotelName, int hotelRentRate, int weekendDayRent) {
        this.hotelName = hotelName;
        this.weekDayRent = hotelRentRate;
        this.weekendDayRent = weekendDayRent;
    }

    public String getHotelName() {
        return hotelName;
    }

    public int getWeekendDayRent() {
        return weekendDayRent;
    }

    public void setWeekendDayRent(int weekendDayRent) {
        this.weekendDayRent = weekendDayRent;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getWeekDayRent() {
        return weekDayRent;
    }

    public void setWeekDayRent(int weekDayRent) {
        this.weekDayRent = weekDayRent;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", hotelRentRate=" + weekDayRent +
                '}';
    }
}
