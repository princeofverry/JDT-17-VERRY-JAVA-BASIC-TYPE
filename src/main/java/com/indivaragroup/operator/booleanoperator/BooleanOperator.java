package com.indivaragroup.operator.booleanoperator;

public class BooleanOperator {
    public static void booleanOperatorShow() {
        System.out.println("ini boolean");

        boolean a = true;
        boolean b = false;

        System.out.println(a && b);
        System.out.println(a && a);
        System.out.println(a || b);
        System.out.println(b || b);
        System.out.println(!b);
        System.out.println(!true);
    }
}
