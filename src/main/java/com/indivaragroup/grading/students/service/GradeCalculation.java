package com.indivaragroup.grading.students.service;

public class GradeCalculation {

    public static String GradeChecking(int grade) {
        if (grade == 100) {
            return "JAGO BANGET";
        } else if (grade >= 90) {
            return "Belom JAGO BANGET tp JAGO AJA";
        } else if (grade >= 70) {
            return "B aja";
        } else {
            return "Belajar Lagi";
        }
    }
}