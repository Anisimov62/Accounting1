package org.example.companys;

import javax.swing.*;

public class Files  {

    private Company company;
    public int companyFileName = 0;
    public Files() {

    }

    public Company getCompany() {
        return company;
    }
    public void setCompany(Company company) {
        Serialized.serialized(company, "Company" + company.hashCode());
        this.company = company;
    }

}
