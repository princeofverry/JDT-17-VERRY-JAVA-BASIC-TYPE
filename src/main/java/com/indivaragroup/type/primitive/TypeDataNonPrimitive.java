package com.indivaragroup.type.primitive;

public class TypeDataNonPrimitive {

    public void showConversion() {

        // Primitive Data Types
        byte primitiveByte = 10;
        short primitiveShort = 100;
        int primitiveInt = 1000;
        long primitiveLong = 10000L;
        float primitiveFloat = 10.5f;
        double primitiveDouble = 20.99;
        char primitiveChar = 'A';
        boolean primitiveBoolean = true;

        // Convert Primitive to Non-Primitive (Wrapper Class)
        Byte byteValue = primitiveByte;
        Short shortValue = primitiveShort;
        Integer integerValue = primitiveInt;
        Long longValue = primitiveLong;
        Float floatValue = primitiveFloat;
        Double doubleValue = primitiveDouble;
        Character characterValue = primitiveChar;
        Boolean booleanValue = primitiveBoolean;

        System.out.println("=== Primitive to Non-Primitive ===");
        System.out.println("Byte Value      : " + byteValue);
        System.out.println("Short Value     : " + shortValue);
        System.out.println("Integer Value   : " + integerValue);
        System.out.println("Long Value      : " + longValue);
        System.out.println("Float Value     : " + floatValue);
        System.out.println("Double Value    : " + doubleValue);
        System.out.println("Character Value : " + characterValue);
        System.out.println("Boolean Value   : " + booleanValue);
    }
}