package com.company;

//Created the fields of the object Applicants in the applicants class.
public class Applicant {
    private String name;
    private int yearsOfExperience;
    private String qualification;

    //Used getter and setter method to get the fields of the object because it was set to be private.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    //Declared the constructor on fields
    public Applicant(String name, int yearsOfExperience, String qualification) {
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
        this.qualification = qualification;
    }
}
