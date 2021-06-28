package com.company;

//Declared the constructor on the fields from the staff
public class Cleaner extends Staff{
    public Cleaner(String employeeId, String employeeName, int yearsOfExperience, boolean markAttendance, String department) {
        super(employeeId, employeeName, yearsOfExperience, markAttendance, department);
    }
    //Declared a method that describes the action of the cleaner.
    public void cleaning() {
        System.out.println("Cleaning of the office");
    }
}
