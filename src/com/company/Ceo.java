package com.company;

import javax.swing.*;
//Declared the fields of the object ceo.
public class Ceo {
    private String name;
    private String title;
// Declared the constructor on fields
    public Ceo(String name, String title) {
        this.name = name;
        this.title = title;
    }
// Used getter and setter method to get the fields of the object because it was set to be private.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    // Created a method that the ceo will used to hire applicants that meet the given conditions.
    public void hire(Applicant applicant) {
       if (applicant.getQualification().equalsIgnoreCase("Bsc") && applicant.getYearsOfExperience() >= 3) {
           System.out.println(applicant.getName()+ " "+ "is hired");
       }
       else {
           System.out.println(applicant.getName()+ " "+"is not hired");
       }
    }
    // Created a condition that the ceo will use to fire staffs whose workrate is poor
    public void fire(Staff staff) {
        if (staff.getWorkRate().equalsIgnoreCase("low")) {
            System.out.println(staff.getEmployeeName()+ " "+ "is fired");
        } else if (staff.getWorkRate().equalsIgnoreCase("medium")) {
            System.out.println("Still monitor"+" "+ staff.getEmployeeName()+" "+"performance");
        } else {
            System.out.println(staff.getEmployeeName()+" "+ "is recommended for promotion");
        }
    }
    // Created a condition that the ceo will use to increase the salaries of staffs whose workrate is high.
    public void giveRaise(Staff staff) {
        if (staff.getWorkRate().equalsIgnoreCase("High")) {
            System.out.println("Please raise"+" "+staff.getEmployeeName()+" "+"salary to 30%");
        } else if(staff.getWorkRate().equalsIgnoreCase("medium")) {
            System.out.println("Encourage"+" "+staff.getEmployeeName()+" "+"to do better");
        } else {
            System.out.println("Remove 2% deduction from"+" "+staff.getEmployeeName());
        }
    }
}
