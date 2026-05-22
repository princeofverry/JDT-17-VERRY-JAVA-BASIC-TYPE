package com.indivaragroup.method;

public class MethodReccursive {
    public static void hitungMundur(int angka) {
        // base case
        if (angka == 0) {
            System.out.println("Selesai");
            return;
        }

        System.out.println(angka);

        hitungMundur(angka - 1);

    }
}
