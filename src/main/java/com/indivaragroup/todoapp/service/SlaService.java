package com.indivaragroup.todoapp.service;

import com.indivaragroup.todoapp.constant.SlaStatus;
import com.indivaragroup.todoapp.constant.TaskStatus;
import com.indivaragroup.todoapp.dto.TaskDTO;

import java.time.LocalDate;

public class SlaService {

    public SlaStatus checkSla(TaskDTO task) {

        boolean isOverdue =
                LocalDate.now().isAfter(task.getDueDate()) &&
                        task.getTaskStatus() != TaskStatus.DONE;

        if (isOverdue) {
            return SlaStatus.OVERDUE;
        }

        return SlaStatus.ON_TIME;
    }
}