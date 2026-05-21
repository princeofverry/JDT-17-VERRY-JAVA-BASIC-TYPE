package com.indivaragroup.operator.unary;

public class UnaryOperator {
    public static void unaryOperatorShow() {
        int a = 5;

        System.out.println(++a); // pre-increament = 6
        System.out.println(a++); //post-ncreament 6
        System.out.println(a); // after post increament: 7

        System.out.println(--a); // pre decrement: 6
        System.out.println(a--); // post decremeant 6
        System.out.println(a);

        int b = -a;
        System.out.println(b);

        boolean isTrue = true;
        System.out.println(!isTrue);
    }
}
