package com.company;

import java.util.ArrayList;

public class Company {
    private String name;
    private String address;
    private Ceo ceo;
    private ArrayList<Staff> staff;
    private ArrayList<Applicant> applicant;

    public Company(String name, String address, Ceo ceo, ArrayList<Staff> staff, ArrayList<Applicant> applicant) {
        this.name = name;
        this.address = address;
        this.ceo = ceo;
        this.staff = staff;
        this.applicant = applicant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Ceo getCeo() {
        return ceo;
    }

    public void setCeo(Ceo ceo) {
        this.ceo = ceo;
    }

    public ArrayList<Staff> getStaff() {
        return staff;
    }

    public void setStaff(ArrayList<Staff> staff) {
        this.staff = staff;
    }

    public ArrayList<Applicant> getApplicant() {
        return applicant;
    }

    public void setApplicant(ArrayList<Applicant> applicant) {
        this.applicant = applicant;
    }
}
