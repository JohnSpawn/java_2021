package com.hell.tuto;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SwitchExpressions {



    public static void main(String[] args) {

        Map<Integer, String> mapDays = new HashMap<>(Map.of(
                1, "Monday",
                2, "Tuesday",
                3, "Wednesday",
                4, "Thursday",
                5, "Friday",
                6, "Saturday",
                7, "Sunday"
        ));

        System.out.println("Enter a numer of day : Monday=1, Tuesday=2, Wednesday=3, Thursday=4, Friday=5, Saturday=6, Sunday=7");
        Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();
        String day = mapDays.get(dayNumber);
        int nbLetters = switch(day){
            case "Monday", "Friday", "Sunday" -> 6;
            case "Tuesday" -> 7;
            case "Thursday" -> 8;
            case "Wednesday" -> 9;
            default -> {
                System.out.println("number " + dayNumber + " not found");
                throw new IllegalStateException("day not found");
            }
        };
        System.out.println("Day " + day + " hase " + nbLetters + " letters");
    }

}
