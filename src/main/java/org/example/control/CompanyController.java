package org.example.control;

import org.example.companys.Company;
import org.example.companys.Serialized;

import java.util.Scanner;

public class CompanyController {
    private final Scanner scanner = new Scanner(System.in);

    private EmployeeController employeeController = new EmployeeController();
    private TeamController teamController = new TeamController();
    private FunctionController functionController = new FunctionController();
    private Report report = new Report();
    private Search search = new Search();
    private Company company;

    public CompanyController() {

    }

    public Search getSearch() {
        return search;
    }

    public void setSearch(Search search) {
        this.search = search;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public EmployeeController getMainEmployee() {
        return employeeController;
    }

    public void setMainEmployee(EmployeeController employeeController) {
        this.employeeController = employeeController;
    }

    public TeamController getMainTeam() {
        return teamController;
    }

    public void setMainTeam(TeamController teamController) {
        this.teamController = teamController;
    }

    public FunctionController getMainFunction() {
        return functionController;
    }

    public void setMainFunction(FunctionController functionController) {
        this.functionController = functionController;
    }

    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public  Company createCompany() {
        System.out.println("Введите название кампании:");
        String campaignName = scanner.nextLine();
        this.company = new Company();
        teamController.setCompany(company);
        employeeController.setCompany(company);
        functionController.setCompany(company);
        report.setCompany(company);
        search.setCompany(company);
        Serialized.serialized(company, campaignName + company.hashCode());
        System.out.println("Ваша кампания: " + campaignName + " создана\n");
        return company;
    }

    public void loadCompany(String file) {
        Serialized.deserialized(file);
    }

    public void editCompany() {

    }

}
