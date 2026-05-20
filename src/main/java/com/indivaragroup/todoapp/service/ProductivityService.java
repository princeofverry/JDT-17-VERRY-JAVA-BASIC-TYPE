package com.indivaragroup.todoapp.service;

public class ProductivityService {

    public double calculateProductivity(double estimatedHour,
                                        double actualHour) {

        if (actualHour == 0) {
            return 0;
        }

        return (estimatedHour / actualHour) * 100;
    }
}