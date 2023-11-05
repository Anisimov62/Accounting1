package org.example.mains;

import org.example.companys.Company;
import org.example.companys.Serialized;

import java.util.Scanner;

public class MainCompany {
    private final Scanner scanner = new Scanner(System.in);

    private MainEmployee mainEmployee = new MainEmployee();
    private MainTeam mainTeam = new MainTeam();
    private MainFunction mainFunction = new MainFunction();
    private Report report = new Report();
    private Search search = new Search();
    private Company company;

    public MainCompany() {

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

    public MainEmployee getMainEmployee() {
        return mainEmployee;
    }

    public void setMainEmployee(MainEmployee mainEmployee) {
        this.mainEmployee = mainEmployee;
    }

    public MainTeam getMainTeam() {
        return mainTeam;
    }

    public void setMainTeam(MainTeam mainTeam) {
        this.mainTeam = mainTeam;
    }

    public MainFunction getMainFunction() {
        return mainFunction;
    }

    public void setMainFunction(MainFunction mainFunction) {
        this.mainFunction = mainFunction;
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

    public static Company createCompany() {
        System.out.println("Введите название кампании:");
        String campaignName = scanner.nextLine();
        this.company = new Company();
        mainTeam.setCompany(company);
        mainEmployee.setCompany(company);
        mainFunction.setCompany(company);
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
