package com.indivaragroup.operator.augmentedassignment;

public class AugmentedAssignment {
    public void AugmentedAssignmentShow() {
        int a = 10;

        a += 5; // 10 + 5 - 3 = 12 * 2 / 4
        a -= 3;
        a *= 2;
        a /= 4;

        int b = 20;

        b %= 6;

        System.out.print(a);
        System.out.print(" and ");
        System.out.println(b);

    }
}
