package org.example.mains;

import org.example.companys.Company;

import java.io.Serializable;

public class Report implements Serializable {

    private Company company;

    public Report() {

    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void teams() {
        System.out.println(this.company.library.getTeams());
    }

    public void functions() {
        System.out.println(this.company.library.getFunctions());
    }

    public void employees() {
        System.out.println(this.company.library.getEmployee());
    }

    public void averageSalary() {

    }

    public void averageSalaryTeams() {

    }

    public void topExpensiveEmployee() {

    }

    public void topDevoitEmployee() {

    }
}
