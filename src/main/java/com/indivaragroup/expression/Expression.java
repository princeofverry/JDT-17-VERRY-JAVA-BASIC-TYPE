package com.indivaragroup.expression;

public class Expression {
    public static void expressionShow() {
        int a = 10;
        int b = 5;

        int hasil = a + b;
        boolean hasil2 = a > b;
        String hasil3 = "Halo " + "Dunia";
        int hasil4 = (a * 2) - b;
        double hasil5 = Math.sqrt(16);

        // contoh expression yang menghasilkan single value
        int total = (3 * 7) * 2;
        boolean cek = (20 % 2) == 0;
        String name = "Jawa".toUpperCase();
    }
}
