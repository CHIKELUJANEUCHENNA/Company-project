package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Ceo ceo = new Ceo("Choke Madhu", "Chief Executive Director");
        Applicant applicant = new Applicant("Jane", 3, "Bsc");
        Accountant staff1 = new Accountant("Ada/001", "Janet", 3, true, "Finance");
        staff1.setWorkRate("low");
        Cleaner staff2 = new Cleaner("Mathew/200", "Mark", 3, true, "Administration");
        staff2.setWorkRate("high");
        Accountant staff3 = new Accountant("Chika/10", "Chika Chike",2, false, "Finance");
        Accountant staff4 = new Accountant("Peace/08", "Peace Jark", 3, true, "Finance");
        Cleaner staff5 = new Cleaner("Chacha/22", "Charity", 2, false, "Administration");
        Applicant applicant1 = new Applicant("Chinelo Samson", 4, "Bsc");
        Applicant applicant2 = new Applicant("Jackson Paul", 3, "Nce");
        ceo.fire(staff2);
        ceo.hire(applicant);
        ceo.giveRaise(staff1);
        // create instance of ceo, applicant, staff
    }
}
