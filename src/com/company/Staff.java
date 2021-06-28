package com.company;

// Created the fields of the object staff in the staff class.
public class Staff {
    private String employeeId;
    private String employeeName;
    private int yearsOfExperience;
    private boolean markAttendance;
    private String department;
    private String workRate;

    //Used getter and setter method to get the fields of the object because it was set to be private.
    public String getWorkRate() {
        return  workRate;
    }

    public void setWorkRate(String workRate) {
        this.workRate = workRate;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public boolean isMarkAttendance() {
        return markAttendance;
    }

    public void setMarkAttendance(boolean markAttendance) {
        this.markAttendance = markAttendance;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    //Declared the constructor on fields
    public Staff(String employeeId, String employeeName, int yearsOfExperience, boolean markAttendance, String department) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.yearsOfExperience = yearsOfExperience;
        this.markAttendance = markAttendance;
        this.department = department;

    }
}
