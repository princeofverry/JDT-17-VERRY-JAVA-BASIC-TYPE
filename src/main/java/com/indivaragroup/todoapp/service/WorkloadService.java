package com.indivaragroup.todoapp.service;

import com.indivaragroup.todoapp.constant.TaskStatus;
import com.indivaragroup.todoapp.dto.TaskDTO;

import java.util.List;

public class WorkloadService {

    public double calculateWorkload(List<TaskDTO> taskList, String assignee) {

        double totalWorkload = 0;

        for (TaskDTO task : taskList) {

            boolean isActiveTask =
                    task.getTaskStatus() == TaskStatus.OPEN ||
                            task.getTaskStatus() == TaskStatus.IN_PROGRESS ||
                            task.getTaskStatus() == TaskStatus.READY_REVIEW;

            if (task.getAssignee().equalsIgnoreCase(assignee)
                    && isActiveTask) {

                totalWorkload += task.getEstimatedHour();
            }
        }

        return totalWorkload;
    }
}