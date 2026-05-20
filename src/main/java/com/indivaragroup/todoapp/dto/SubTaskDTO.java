package com.indivaragroup.todoapp.dto;

import com.indivaragroup.todoapp.constant.TaskStatus;

public class SubTaskDTO {

    private String subTaskId;
    private String title;
    private TaskStatus taskStatus;

    public SubTaskDTO(String subTaskId,
                      String title,
                      TaskStatus taskStatus) {

        this.subTaskId = subTaskId;
        this.title = title;
        this.taskStatus = taskStatus;
    }

    public String getSubTaskId() {
        return subTaskId;
    }

    public String getTitle() {
        return title;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }
}