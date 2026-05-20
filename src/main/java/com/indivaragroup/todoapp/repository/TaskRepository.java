package com.indivaragroup.todoapp.repository;

import com.indivaragroup.todoapp.constant.PriorityLevel;
import com.indivaragroup.todoapp.constant.TaskStatus;
import com.indivaragroup.todoapp.dto.TaskDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    public List<TaskDTO> getAllTasks() {

        List<TaskDTO> taskList = new ArrayList<>();

        taskList.add(
                new TaskDTO(
                        "TASK-001",
                        "ERP System",
                        "Create Login API",
                        "Authentication module",
                        "Verry",
                        PriorityLevel.HIGH,
                        TaskStatus.IN_PROGRESS,
                        LocalDate.now(),
                        LocalDate.now().plusDays(3),
                        8,
                        6,
                        40,
                        "Team Lead",
                        "Project Manager"
                )
        );

        taskList.add(
                new TaskDTO(
                        "TASK-002",
                        "ERP System",
                        "Create Dashboard UI",
                        "Frontend dashboard",
                        "Verry",
                        PriorityLevel.MEDIUM,
                        TaskStatus.OPEN,
                        LocalDate.now(),
                        LocalDate.now().plusDays(5),
                        10,
                        0,
                        30,
                        "Team Lead",
                        "Project Manager"
                )
        );

        taskList.add(
                new TaskDTO(
                        "TASK-003",
                        "ERP System",
                        "Testing API",
                        "API Integration Testing",
                        "Rizky",
                        PriorityLevel.CRITICAL,
                        TaskStatus.DONE,
                        LocalDate.now().minusDays(5),
                        LocalDate.now().minusDays(1),
                        6,
                        8,
                        30,
                        "QA Lead",
                        "Project Manager"
                )
        );

        return taskList;
    }
}