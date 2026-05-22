package com.indivaragroup.method;

public class MethodVariableArgument {
    public static void methodVariableArgument(int ... angka) {
        for (int a : angka) {
            System.out.println(a);
        }
    }

    public static void combineNamaDanNilai(String nama, int ... nilai) {
        System.out.println(nama);
        for (int x : nilai) {
            System.out.print(" " + x);
        }
    }
}
