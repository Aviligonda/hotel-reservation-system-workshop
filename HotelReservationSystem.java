package com.bridzelab;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HotelReservationSystem {
    static List<Hotel> hotelList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation System Program");
         Hotel hotelOne = new Hotel("LakeWood", 110, 90);
        Hotel hotelTwo = new Hotel("BridgeWood", 190, 50);
        Hotel hotelThree = new Hotel("RidgeWood", 220, 150);
        hotelList.add(hotelOne);
        hotelList.add(hotelTwo);
        hotelList.add(hotelThree);
        hotelList.forEach(System.out::println);
        System.out.println("-----------------------------------");
    }
}
