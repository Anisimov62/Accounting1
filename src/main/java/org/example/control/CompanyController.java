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

    public EmployeeController getEmployeeController() {
        return employeeController;
    }
    public void setEmployeeController(EmployeeController employeeController) {
        this.employeeController = employeeController;
    }

    public TeamController getTeamController() {
        return teamController;
    }
    public void setTeamController(TeamController teamController) {
        this.teamController = teamController;
    }

    public FunctionController getFunctionController() {
        return functionController;
    }
    public void setFunctionController(FunctionController functionController) {
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
        String companyName = scanner.nextLine();
        this.company = new Company();
        teamController.setCompany(company);
        employeeController.setCompany(company);
        functionController.setCompany(company);
        report.setCompany(company);
        search.setCompany(company);
        Serialized.serialized(company, companyName + company.hashCode());
        System.out.println("Ваша кампания: " + companyName + " создана\n");
        return company;
    }

    public void loadCompany(String file) {
        Serialized.deserialized(file);
    }
//    public String loadCompany() {
//        JFileChooser fileOpen = new JFileChooser("Company");
//        int ret = fileOpen.showDialog(null, "Открыть файл");
//        if (ret == JFileChooser.APPROVE_OPTION) {
//            return fileOpen.getSelectedFile().getAbsolutePath();
//        } else {
//            System.out.println("Ошибка");
//            System.exit(1);
//        }
//        return null;

    public void editCompany() {

    }

}
