package org.example.control;

import org.example.companys.Company;
import org.example.companys.Team;

import java.io.Serializable;
import java.util.List;

public class Search implements Serializable {

    private Company company;

    public Search() {

    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void searchEmployeeFio() {

    }

    public void searchEmployeeFunction() {

    }

    public void searchEmployeeTeam() {

    }

    public void searchEmployeeBoss() {

    }

    public int searchStateTeam(List<Team> teams, int Number) {
        int s = 0;
        for (int i = 0; i < teams.size(); i++) {
            if (Number == teams.get(i).getTeamNumber()) {
                s = i;
                break;
            }
        }
        return s;
    }
}
