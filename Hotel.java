package com.bridzelab;

public class Hotel {
    String hotelName;
    int hotelRentRate;

    public Hotel(String hotelName, int hotelRentRate) {
        this.hotelName = hotelName;
        this.hotelRentRate = hotelRentRate;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getHotelRentRate() {
        return hotelRentRate;
    }

    public void setHotelRentRate(int hotelRentRate) {
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
