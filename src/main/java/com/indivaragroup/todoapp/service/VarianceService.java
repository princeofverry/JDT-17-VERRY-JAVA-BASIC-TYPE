package com.indivaragroup.todoapp.service;

public class VarianceService {

    public double calculateVariance(double estimatedHour,
                                    double actualHour) {

        return actualHour - estimatedHour;
    }
}