package com.indivaragroup.todoapp.service;


import com.indivaragroup.todoapp.constant.TaskStatus;

public class ProgressService {

    public double calculateProgressByStatus(TaskStatus taskStatus) {

        switch (taskStatus) {

            case OPEN:
                return 0;

            case IN_PROGRESS:
                return 50;

            case READY_REVIEW:
                return 80;

            case DONE:
                return 100;

            default:
                return 0;
        }
    }
}