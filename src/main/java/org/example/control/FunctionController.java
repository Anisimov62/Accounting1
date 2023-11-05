package org.example.control;

import org.example.companys.Company;
import org.example.companys.Functions;

import java.io.Serializable;
import java.util.Scanner;

public class FunctionController implements Serializable {
    private final Scanner scanner = new Scanner(System.in);
    private Company company;

    public FunctionController() {

    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    private void createFunction(String nameFunction) {
        company.library.addFunction(new Functions(nameFunction));
    }

    public void deleteFunction() {

    }

    public void editFunction() {

    }

    public void createFunctionOption() {
        System.out.println("Введите название должности:");
        String FunctionName = scanner.nextLine();
        createFunction(FunctionName);
        System.out.println("Должность: " + FunctionName + " создана\n");

    }
}
