package org.example.control;

import org.example.companys.Company;
import org.example.companys.Employee;
import org.example.companys.Team;

import java.util.ArrayList;

public class Search  {

    private Company company;

    public Search() {

    }



    public void setCompany(Company company) {
        this.company = company;
    }

    public ArrayList<Employee> searchEmployeeFio(String string) {
        ArrayList<Employee> employees = new ArrayList<>();
        string = string.toLowerCase();
        for (int i = 0; i < company.documents.getEmployee().size(); i++) {
            if (company.documents.getEmployee().get(i).getName().toLowerCase().contains(string)
                    || company.documents.getEmployee().get(i).getSurname().toLowerCase().contains(string)
                    || company.documents.getEmployee().get(i).getMiddleName().toLowerCase().contains(string)) {
                employees.add(company.documents.getEmployee().get(i));
            }
        }
        return employees;
    }
    public ArrayList<Employee> searchEmployeeFunction(String functionName) {
        ArrayList<Employee> employees = new ArrayList<>();
        functionName = functionName.toLowerCase();
        for (int i = 0; i < company.documents.getFunctions().size(); i++) {
            if (company.documents.getEmployee().get(i).getFunctions().getFunctionName().toLowerCase().contains(functionName)) {
                employees.add(company.documents.getEmployee().get(i));
            }
        }

        return employees;
    }

    public ArrayList<Employee> searchEmployeeTeam(String teamName) {
        ArrayList<Employee> employees = new ArrayList<>();
        teamName = teamName.toLowerCase();
        for (int i = 0; i < company.documents.getEmployee().size(); i++) {
            if (company.documents.getEmployee().get(i).getTeam().getTeamName().toLowerCase().contains(teamName)) {
                employees.add(company.documents.getEmployee().get(i));
            }
        }

        return employees;
    }

    public ArrayList<Employee>  searchEmployeeBoss(String fio) {
        ArrayList<Employee> employees = new ArrayList<>();
        fio = fio.toLowerCase();
        for (int i = 0; i < company.documents.getEmployee().size(); i++) {
            if (company.documents.getEmployee().get(i).getBoss().getName().toLowerCase().contains(fio)
                    || company.documents.getEmployee().get(i).getBoss().getSurname().toLowerCase().contains(fio)
                    || company.documents.getEmployee().get(i).getBoss().getMiddleName().toLowerCase().contains(fio)) {
                employees.add(company.documents.getEmployee().get(i));
            }
        }
        return employees;
    }

    public int searchStateTeam(ArrayList<Team> teams, int Number) {
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
