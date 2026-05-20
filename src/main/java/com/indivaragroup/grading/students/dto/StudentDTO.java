package com.indivaragroup.grading.students.dto;

import com.indivaragroup.grading.students.service.GradeCalculation;

public class StudentDTO {

    public static void showStudents() {

        String[] studentsName = {
                "Verry",
                "Andi",
                "Budi",
                "Siti",
                "Rina",
                "Doni",
                "Asep",
                "Joko",
                "Tono",
                "Putri",
                "Lina",
                "Rudi",
                "Bayu",
                "Nina",
                "Fajar",
                "Dewi",
                "Raka"
        };

        int[] gradeStudents = {
                100,
                95,
                75,
                60,
                90,
                88,
                70,
                55,
                98,
                100,
                82,
                67,
                91,
                73,
                85,
                40,
                99
        };

        for (int i = 0; i < studentsName.length; i++) {

            String name = studentsName[i];
            int grade = gradeStudents[i];

            String result = GradeCalculation.GradeChecking(grade);

            System.out.println("Murid ke-" + (i + 1));
            System.out.println("Nama  : " + name);
            System.out.println("Nilai : " + grade);
            System.out.println("Hasil : " + result);

            System.out.println("-------------------------");
        }
    }
}