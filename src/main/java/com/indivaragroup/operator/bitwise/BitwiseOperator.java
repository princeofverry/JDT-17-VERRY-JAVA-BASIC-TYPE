package com.indivaragroup.operator.bitwise;

public class BitwiseOperator {
    public static void bitwiseOperatorShow() {
        int a = 1; // 0001
        int b = 3; // 0011

        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(-a);
        System.out.println(a << 1);
        System.out.println(a >> 1);
    }
}
