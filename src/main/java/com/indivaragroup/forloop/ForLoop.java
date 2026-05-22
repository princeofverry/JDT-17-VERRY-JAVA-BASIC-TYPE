package com.indivaragroup.forloop;

public class ForLoop {
    public static void forLoop() {
        for (int i = 0; i < 5; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            } else {
                System.out.println(i + " :Bukan genap king");
            }
        }
    }
}
