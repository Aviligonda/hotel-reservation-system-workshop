package com.bridzelab;

public class Hotel {
    String hotelName;
    int hotelRentRate;

    public Hotel(String hotelName, int hotelRentRate) {
        this.hotelName = hotelName;
        this.hotelRentRate = hotelRentRate;
    }


    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", hotelRentRate=" + hotelRentRate +
                '}';
    }
}
