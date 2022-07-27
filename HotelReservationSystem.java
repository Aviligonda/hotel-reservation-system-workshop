package com.bridzelab;

import java.util.ArrayList;
import java.util.List;

public class HotelReservationSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation System Program");
        List<Hotel> hotelList = new ArrayList<>();
        Hotel hotelOne = new Hotel("LakeWood", 110);
        Hotel hotelTwo = new Hotel("BridgeWood", 150);
        Hotel hotelThree = new Hotel("RidgeWood", 220);
        hotelList.add(hotelOne);
        hotelList.add(hotelTwo);
        hotelList.add(hotelThree);
        hotelList.forEach(System.out::println);
    }
}
