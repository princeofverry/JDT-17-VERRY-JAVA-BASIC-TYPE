package com.indivaragroup.operator.switchcase;

public class SwitchYield {
    public static void switchYield() {

        int day = 3;

        String result = switch (day) {

            case 1, 2, 3 -> {
                System.out.println("Awal minggu");
                yield "Weekday";
            }

            case 4, 5 -> {
                System.out.println("Tengah minggu");
                yield "Midweek";
            }

            case 6, 7 -> {
                System.out.println("Akhir minggu");
                yield "Weekend";
            }

            default -> {
                System.out.println("Hari tidak valid");
                yield "Unknown";
            }
        };

        System.out.println("Result : " + result);
    }
}