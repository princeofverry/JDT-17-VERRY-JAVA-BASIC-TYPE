package com.indivaragroup.operator.instanceofOperator;

public class InstanceOfOperator {
    public static void instanceOfOperatorShow() {
        Object value = "test";
        boolean isTrue =  value instanceof String;

        System.out.println(value instanceof String);
        System.out.println(value instanceof Integer);
        System.out.println(!isTrue);
    }
}
