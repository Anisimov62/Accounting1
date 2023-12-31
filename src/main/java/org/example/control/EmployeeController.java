package org.example.control;

import org.example.companys.Company;
import org.example.companys.Employee;


import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EmployeeController implements Serializable {
    private final Scanner scanner = new Scanner(System.in);
    private Company company;
    private Employee employee;
    public EmployeeController() {

    }

    public Company getCompany() {return company;}
    public void setCompany(Company company) {this.company = company;}

    private void createEmployee(String surname, String name, String middleName) {
        Employee employee = new Employee(surname, name, middleName);
        company.documents.addEmployee(employee);
    }

    public void deleteEmployee() {}
    public void editEmployee() {}
    public void editSurname() {}
    public void editName() {}
    public void editMiddleName() {}

    public void editDateOfBirthday(String dateOfBirthday) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("дд.мм.гггг");
        LocalDate localDate = LocalDate.parse(dateOfBirthday, dateTimeFormatter);
        this.employee.setDateOfBirthday(localDate);}

    public void editSex() {}
    public void editTelephone() {}
    public void editTeam() {}
    public void editFunction() {}
    public void editBoss() {}
    public void editSalary() {}

    public void createEmployeeOption() {
        System.out.println("Введите фамилию :");
        String surname = scanner.next();
        System.out.println("Введите имя :");
        String name = scanner.next();
        System.out.println("Введите отчество :");
        String middleName = scanner.next();
        createEmployee(surname, name, middleName);
    }
}
