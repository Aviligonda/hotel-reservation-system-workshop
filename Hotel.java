package com.bridzelab;

public class Hotel {
    String hotelName;
    int weekDayRent;
    int weekendDayRent;
    int totalRates;

    public Hotel(String hotelName, int weekDayRent, int weekendDayRent) {
        this.hotelName = hotelName;
        this.weekDayRent = weekDayRent;
        this.weekendDayRent = weekendDayRent;
        this.totalRates = this.weekDayRent + this.weekendDayRent;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getWeekendDayRent() {
        return weekendDayRent;
    }

    public void setWeekendDayRent(int weekendDayRent) {
        this.weekendDayRent = weekendDayRent;
    }

    public int getTotalRates() {
        return totalRates;
    }

    public void setTotalRates(int totalRates) {
        this.totalRates = totalRates;
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
                ", weekDayRent=" + weekDayRent +
                ", weekendDayRent=" + weekendDayRent +
                '}';
    }
}
