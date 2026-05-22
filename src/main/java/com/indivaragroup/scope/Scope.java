package com.indivaragroup.scope;

public class Scope {
    public String contoh() {
        String insideMethod = "Variable dalam method";

        if (1 == 1) {
            String insideBlock = "variable dalam block";
        }

        return "";

    }
}
