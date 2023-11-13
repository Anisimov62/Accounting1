package org.example.control;

import org.example.companys.Company;
import org.example.companys.Team;

import java.io.Serializable;
import java.util.Scanner;

public class TeamController implements Serializable {
    private final Scanner scanner = new Scanner(System.in);
    private Company company;
    private Team team;


    public TeamController() {

    }

    public Company getCompany() {
        return company;
    }
    public void setCompany(Company company) {
        this.company = company;
    }

    public Team getTeam() {
        return team;
    }
    public void setTeam(Team team) {
        this.team = team;
    }

    public void createTeam(String nameTeam) {
        Team team = new Team(nameTeam);

        company.documents.addTeam(team);
            }

    public void deleteTeam() {
        company.documents.deleteTeam(this.team.getTeamNumber() - 1);
    }

    public void editTeamName(String name) {
        this.team.setTeamName(name);
    }

    public void editTeamBoss(int newBossEmployeeNumber) {
        this.team.setBoss(team.getEmployee().get(newBossEmployeeNumber));
    }

}
