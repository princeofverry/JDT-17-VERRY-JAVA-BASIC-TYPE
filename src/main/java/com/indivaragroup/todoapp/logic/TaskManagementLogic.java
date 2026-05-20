package com.indivaragroup.todoapp.logic;

import com.indivaragroup.todoapp.dto.TaskDTO;
import com.indivaragroup.todoapp.service.ProductivityService;
import com.indivaragroup.todoapp.service.ProgressService;
import com.indivaragroup.todoapp.service.SlaService;
import com.indivaragroup.todoapp.service.VarianceService;

public class TaskManagementLogic {

    private final ProgressService progressService =
            new ProgressService();

    private final ProductivityService productivityService =
            new ProductivityService();

    private final VarianceService varianceService =
            new VarianceService();

    private final SlaService slaService =
            new SlaService();

    public void processTask(TaskDTO task) {

        double progress =
                progressService.calculateProgressByStatus(
                        task.getTaskStatus());

        task.setProgress(progress);

        double variance =
                varianceService.calculateVariance(
                        task.getEstimatedHour(),
                        task.getActualHour());

        double productivity =
                productivityService.calculateProductivity(
                        task.getEstimatedHour(),
                        task.getActualHour());

        System.out.println("========== TASK REPORT ==========");
        System.out.println("Task : " + task.getTitle());
        System.out.println("Assignee : " + task.getAssignee());
        System.out.println("Progress : " + progress + "%");
        System.out.println("Variance : " + variance + " hours");
        System.out.println("Productivity : " + productivity + "%");
        System.out.println("SLA Status : " + slaService.checkSla(task));
    }
}