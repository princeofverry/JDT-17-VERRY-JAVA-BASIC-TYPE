package com.indivaragroup.operator.switchcase;

public class SwitchLambda {
    public static void switchLambdaOperator() {
        String cuaca = "siang";

        String suhu = switch (cuaca) {
            case "siang" -> "panas";
            case "malam" -> "dngin";
            default -> "hoho";
        };

        System.out.println(suhu);
    }
}
