package org.example.control;

import org.example.companys.Company;
import org.example.companys.Employee;

import java.io.Serializable;
import java.util.Scanner;

public class Options implements Serializable {

    private final Scanner scanner = new Scanner(System.in);
    private CompanyController companyController = new CompanyController();
    private Company company;

    public Options() {

    }

    public void setCompanyController(CompanyController companyController) {
        this.companyController = companyController;
    }

    public CompanyController getCompanyController() {
        return companyController;
    }


    public void load2() {
        companyOption();
    }

    private void error() {
        System.out.println("Неверно введен номер");
    }

    public void companyOption() {
        System.out.println("""
                 1-Новая компания;
                 2-Редактировать компанию;
                 3-Войти в компанию\
                """);

        switch (scanner.nextInt()) {
            case 1 -> {
                this.company = companyController.createCompany();
                mainOption();
            }
            case 2 -> {
                companyController.editCompany();
                mainOption();
            }
            case 3 -> {
                companyController.loadCompany("qwerty777874839");
                mainOption();
            }
            default -> {
                error();
                companyOption();
            }
        }
    }



    public void employeeEditOption() {
        System.out.println("""
                 1-Изменить ФИО
                 2-Изменить дату рождения
                 3-Изменить пол
                 4-Изменить телефон
                 5-Изменить отдел
                 6-Изменить должность
                 7-Изменить руководителя
                 8-Изменить зарплату
                 9-Удалить сотрудника\
                """);
        switch (scanner.nextInt()) {
            case 1 -> editFioOption();
            case 2 -> {
                companyController.getEmployeeController().editDateOfBirthday(toString());
                employeeEditOption();
            }
            case 3 -> {
                companyController.getEmployeeController().editSex();
                employeeEditOption();
            }
            case 4 -> {
                companyController.getEmployeeController().editTelephone();
                employeeEditOption();
            }
            case 5 -> {
                companyController.getEmployeeController().editTeam();
                employeeEditOption();
            }
            case 6 -> {
                companyController.getEmployeeController().editFunction();
                employeeEditOption();
            }
            case 7 -> {
                companyController.getEmployeeController().editBoss();
                employeeEditOption();
            }
            case 8 -> {
                companyController.getEmployeeController().editSalary();
                employeeEditOption();
            }
            case 9 -> {
                companyController.getEmployeeController().deleteEmployee();
                employeeEditOption();
            }

            default -> {
                error();
                employeeEditOption();
            }
         }
    }

    private void editFioOption() {
        System.out.println("""
                 1-Изменить фамилию
                 2-Изменить имя
                 3-Изменить отчество
                 4-Назад\
                """);
        switch (scanner.nextInt()) {
            case 1 -> {
                companyController.getEmployeeController().editSurname();
                editFioOption();
            }
            case 2 -> {
                companyController.getEmployeeController().editName();
                editFioOption();
            }
            case 3 -> {
                companyController.getEmployeeController().editMiddleName();
                editFioOption();
            }
            case 4 -> employeeEditOption();
            default -> {
                error();
                editFioOption();
            }
        }
    }

    private void mainOption() {
        System.out.println("""
                 1-Отделы
                 2-Должностя
                 3-Сотрудники
                 4-Отчеты
                 5-Выход из программы\
                """);
        switch (scanner.nextInt()) {
            case 1 -> teamOption();
            case 2 -> functionOption();
            case 3 -> employeeOption();
            case 4 -> reportOption();
            case 5 -> System.out.println("До свидания!");
            default -> {
                error();
                mainOption();
            }
        }
    }

    private void teamOption() {
        System.out.println("""
                 1-Список отделов
                 2-Создать отдел
                 3-Назад\
                """);
        switch (scanner.nextInt()) {
            case 1 -> {
                companyController.getReport().teams();
                teamOption();
            }
            case 2 -> {
                System.out.println("Введите название отдела");
                scanner.nextLine();
                companyController.getTeamController().createTeam(scanner.nextLine());
                System.out.println("Отдел создан!");
                teamOption();
            }
            case 3 -> mainOption();
            default -> {
                error();
                teamOption();
            }
        }
    }

    private void teamEditOption() {
        System.out.println("""
                 1-Редактировать отдел
                 2-Удалить отдел
                 3-Назад\
                """);
        switch (scanner.nextInt()) {
            case 1 -> {
                System.out.println("Введите номер отдела который необходимо отредактировать:");
                companyController.getTeamController().setTeam(company.documents.getTeams().
                        get(companyController.getSearch().
                        searchStateTeam(company.documents.getTeams(),
                                scanner.nextInt())));
                editTeams();
            }
            case 2 -> {
                companyController.getTeamController().deleteTeam();
                teamOption();
            }
            case 3 -> teamOption();
            default -> {
                error();
                teamEditOption();
            }
        }
    }
    public static String printBoss(Employee boss) {
        if (boss != null) {
            return boss.getSurname() + " " + boss.getName();
        } else {
            return null;
        }
    }
    private void editTeams() {
        System.out.println("""
                 1-Изменить название отдела
                 2-Изменить руководителя отдела
                 3-Назад\
                """);
        switch (scanner.nextInt()) {
            case 1 -> {
                System.out.println("Введите название отдела:");
                companyController.getTeamController().editTeamName(scanner.nextLine());
                System.out.println("Название отдела изменилось!");
                editTeams();
            }
            case 2 -> {
                System.out.println("Ведите номер сотрудника отдела, которого нужно назначить руководителем:");
                companyController.getTeamController().editTeamBoss(scanner.nextInt());
                System.out.println("Новый руководитель!");
                editTeams();
            }
            case 3 -> teamEditOption();
            default -> {
                error();
                editTeams();
            }
        }
    }

    private void functionOption() {
        System.out.println("""
                 1-Список должностей
                 2-Создать должность
                 3-Редактировать должность
                 4-Удалить должность
                 5-Назад\
                """);
        switch (scanner.nextInt()) {
            case 1 -> {companyController.getReport().functions();
                functionOption();}
            case 2 -> {companyController.getFunctionController().createFunctionOption();
                functionOption();}
            case 3 -> {companyController.getFunctionController().editFunction();
                functionOption();}
            case 4 -> {companyController.getFunctionController().deleteFunction();
                functionOption();}
            case 5 -> mainOption();
            default -> {
                error();
                functionOption();
            }
        }
    }

    private void employeeOption() {
        System.out.println("""
                 1-Список сотрудников
                 2-Создать сотрудника
                 3-Редактировать сотрудника
                 4-Удалить сотрудника
                 5-Назад\
                """);
        switch (scanner.nextInt()) {
            case 1 -> {companyController.getReport().employees();
                employeeOption();}
            case 2 -> {companyController.getEmployeeController().createEmployeeOption();
                employeeOption();}
            case 3 -> employeeEditOption();

            case 4 -> {companyController.getEmployeeController().deleteEmployee();
                employeeOption();}
            case 5 -> mainOption();
            default -> {
                error();
                employeeOption();}
        }
    }

    private void reportOption() {
        System.out.println("""
                 1-Структура организации
                 2-Средняя зарплата
                 3-10 самых дорогих сотрудников по ЗП
                 4-10 самых преданных сотрудников по кол-ву лет в фирме
                 5-Назад\
                """);
        switch (scanner.nextInt()) {
            case 1 -> companyController.getReport().companyStructure();
            case 2 -> {companyController.getReport().averageSalary();
                companyController.getReport().averageSalaryTeams();
            }
            case 3 -> System.out.println("Топ 10 самых дорогих сотрудников");
            case 4 -> System.out.println("Топ 10 самых преданных сотрудников");
            case 5 -> mainOption();
            default -> {
                error();
                reportOption();
            }
        }
    }
}