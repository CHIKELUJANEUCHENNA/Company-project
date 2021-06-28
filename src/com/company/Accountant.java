package com.company;

// Declared a constructor on the fields extended from staff
public class Accountant extends Staff {
    public Accountant(String employeeId, String employeeName, int yearsOfExperience, boolean markAttendance, String department) {
        super(employeeId, employeeName, yearsOfExperience, markAttendance, department);
    }
    public void raiseVoucher() {
        System.out.println("Raising Voucher");
    }
    public void paySalary() {
        System.out.println("Paying Salary");
    }
}
