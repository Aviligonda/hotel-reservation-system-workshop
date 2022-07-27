package com.bridzelab;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class HotelReservationSystem {
    static List<Hotel> hotelList = new ArrayList<>();
    static LinkedList<Hotel> specialList = new LinkedList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation System Program");
        System.out.println("Normal Rates for customers");
        Hotel hotelOne = new Hotel("LakeWood", 110, 90, 3);
        Hotel hotelTwo = new Hotel("BridgeWood", 190, 50, 4);
        Hotel hotelThree = new Hotel("RidgeWood", 220, 150, 5);
        hotelList.add(hotelOne);
        hotelList.add(hotelTwo);
        hotelList.add(hotelThree);
        hotelList.forEach(System.out::println);
        System.out.println("---------------------------------------------------");
        System.out.println("Special Rates for Reward Customers is :  ");
        System.out.println();
        Hotel hotel = new Hotel("LakeWood", 80, 80, 3);
        Hotel hotel1 = new Hotel("BridgeWood", 110, 50, 4);
        Hotel hotel2 = new Hotel("RidgeWood", 100, 40, 5);
        specialList.add(hotel);
        specialList.add(hotel1);
        specialList.add(hotel2);
        specialList.forEach(System.out::println);
        System.out.println("-----------------------------------");
        cheapestHotel("2022-01-02", "2022-01-03");
    }

    public static void cheapestHotel(String startDate, String endDate) {
        LocalDate startDateFormat = LocalDate.parse(startDate, DateTimeFormatter.ISO_DATE);
        LocalDate endDateFormat = LocalDate.parse(endDate, DateTimeFormatter.ISO_DATE);
        int numberOfDays = endDateFormat.getDayOfMonth() - startDateFormat.getDayOfMonth();
        Hotel cheapestHotel = specialList.stream()
                .filter(n -> n.hotelRating > 3)
                .min(Comparator.comparing(Hotel::getTotalRates))
                .orElse(null);
        System.out.println("Best Rated Hotel and Cheapest rentRate Hotel  :\n" + cheapestHotel);
        int totalRate = numberOfDays * cheapestHotel.totalRates;
        System.out.println("Stay in Hotel " + numberOfDays + " days and \nTotal rent Rate is :" + totalRate);
    }
}
