package com.indivaragroup.todoapp.dto;

public class AssigneeDTO {

    private String employeeId;
    private String employeeName;
    private String division;
    private String email;

    public AssigneeDTO(String employeeId,
                       String employeeName,
                       String division,
                       String email) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.division = division;
        this.email = email;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDivision() {
        return division;
    }

    public String getEmail() {
        return email;
    }
}