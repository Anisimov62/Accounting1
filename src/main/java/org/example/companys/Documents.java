package org.example.companys;

import java.io.Serializable;
import java.util.ArrayList;

public class Documents implements Serializable {

    private final ArrayList<Functions> functions = new ArrayList<>();
    private final ArrayList<Team> teams = new ArrayList<>();
    private final ArrayList<Employee> employees = new ArrayList<>();


    public Documents() {
    }
    public void addTeam(Team team) {
        this.teams.add(team);
    }
    public void deleteTeam(int state) {
        this.teams.remove(state);
    }
    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }
    public ArrayList<Employee> getEmployee() {
        return employees;
    }

    public void addFunctions(Functions functions) {
        this.functions.add(functions);
    }
    public ArrayList<Functions> getFunctions() {
        return functions;
    }

//    public void addFunction(Functions functions) {
//    }
}
