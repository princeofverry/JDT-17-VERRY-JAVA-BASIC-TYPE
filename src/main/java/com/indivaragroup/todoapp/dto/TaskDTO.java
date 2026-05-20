package com.indivaragroup.todoapp.dto;


import com.indivaragroup.todoapp.constant.PriorityLevel;
import com.indivaragroup.todoapp.constant.TaskStatus;

import java.time.LocalDate;

public class TaskDTO {

    private String taskId;
    private String projectName;
    private String title;
    private String description;
    private String assignee;

    private PriorityLevel priorityLevel;
    private TaskStatus taskStatus;

    private LocalDate startDate;
    private LocalDate dueDate;

    private double estimatedHour;
    private double actualHour;

    private double weight;
    private double progress;

    private String reviewer;
    private String createdBy;

    public TaskDTO(String taskId,
                   String projectName,
                   String title,
                   String description,
                   String assignee,
                   PriorityLevel priorityLevel,
                   TaskStatus taskStatus,
                   LocalDate startDate,
                   LocalDate dueDate,
                   double estimatedHour,
                   double actualHour,
                   double weight,
                   String reviewer,
                   String createdBy) {

        this.taskId = taskId;
        this.projectName = projectName;
        this.title = title;
        this.description = description;
        this.assignee = assignee;
        this.priorityLevel = priorityLevel;
        this.taskStatus = taskStatus;
        this.startDate = startDate;
        this.dueDate = dueDate;
        this.estimatedHour = estimatedHour;
        this.actualHour = actualHour;
        this.weight = weight;
        this.reviewer = reviewer;
        this.createdBy = createdBy;
    }

    public String getTaskId() {
        return taskId;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getAssignee() {
        return assignee;
    }

    public PriorityLevel getPriorityLevel() {
        return priorityLevel;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public double getEstimatedHour() {
        return estimatedHour;
    }

    public double getActualHour() {
        return actualHour;
    }

    public double getWeight() {
        return weight;
    }

    public double getProgress() {
        return progress;
    }

    public void setProgress(double progress) {
        this.progress = progress;
    }

    public String getReviewer() {
        return reviewer;
    }

    public String getCreatedBy() {
        return createdBy;
    }
}