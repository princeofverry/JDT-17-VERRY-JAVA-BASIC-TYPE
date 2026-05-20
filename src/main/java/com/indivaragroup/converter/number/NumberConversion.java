package com.indivaragroup.converter.number;

//public class NumberConversion {
//    public static void main(String[] args) {
//        byte byteValue = 10;
//        int intValue = byteValue;
//        double doubleValue = intValue;
//
//        System.out.println("widening casting: ");
//        System.out.println("byte -> int = " + intValue);
//        System.out.println("int -> double = " + doubleValue);
//
//        double nilaiDouble = 9.78;
//        int nilaiInt = (int) nilaiDouble;
//        byte nilaiByte = (byte) nilaiInt;
//
//        System.out.println();
//        System.out.println("Narrowing casting:");
//        System.out.println("double -> int = " + nilaiInt);
//        System.out.println("int -> byte = " + nilaiByte);
//    }
//}

public class NumberConversion {

    public void wideningCasting() {
        byte byteValue = 10;
        int intValue = byteValue;
        double doubleValue = intValue;

        System.out.println("Widening Casting:");
        System.out.println("byte -> int = " + intValue);
        System.out.println("int -> double = " + doubleValue);
    }

    public void narrowingCasting() {
        double doubleValue = 9.78;
        int intValue = (int) doubleValue;
        byte byteValue = (byte) intValue;

        System.out.println();
        System.out.println("Narrowing Casting:");
        System.out.println("double -> int = " + intValue);
        System.out.println("int -> byte = " + byteValue);
    }
}