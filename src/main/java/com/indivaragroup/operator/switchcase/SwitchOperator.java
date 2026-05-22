package com.indivaragroup.operator.switchcase;

public class SwitchOperator {
    public static void switchOperator() {
        String cuaca = "siang";

        switch (cuaca) {
            case "siang":
                System.out.println("Panas");
                break;
            case "malam":
                System.out.println("Dingin");
                break;
            default:
                System.out.println("hehe");
                break;
        }
    }
}
