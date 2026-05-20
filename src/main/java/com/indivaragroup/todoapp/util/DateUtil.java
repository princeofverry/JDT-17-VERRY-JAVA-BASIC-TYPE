package com.indivaragroup.todoapp.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtil {

    private static final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static LocalDate convertStringToDate(String date) {

        return LocalDate.parse(date, formatter);
    }

    public static boolean isOverdue(LocalDate dueDate) {

        return LocalDate.now().isAfter(dueDate);
    }

    public static long calculateRemainingDays(LocalDate dueDate) {

        return LocalDate.now().until(dueDate).getDays();
    }
}