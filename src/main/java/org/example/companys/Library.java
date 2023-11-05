package org.example.companys;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Library implements Serializable {

    private final List<Team> teams = new ArrayList<>();
    private final List<Employee> employees = new ArrayList<>();
    private final List<Functions> functions = new ArrayList<>();

    public Library() {

    }

    public void addTeams(Team team) {
        this.teams.add(team);
    }

    public void deleteTeams(int state) {
        this.teams.remove(state);
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public List<Employee> getEmployee() {
        return employees;
    }

    public void addFunctions(Functions functions) {
        this.functions.add(functions);
    }

    public List<Functions> getFunctions() {
        return functions;
    }
}
