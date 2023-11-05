package org.example.control;

import org.example.companys.Company;

import java.io.Serializable;
import java.util.Scanner;

public class Options implements Serializable {

    private final Scanner scanner = new Scanner(System.in);
    private CompanyController companyController = new CompanyController();
    private Company company;

    public Options() {

    }

    public void setMainCompany(CompanyController companyController) {
        this.companyController = companyController;
    }

    public CompanyController getMainCompany() {
        return companyController;
    }


    public void start() {
        companyOption();
    }

    private void error() {
        System.out.println("Неверно введен номер");
    }

    public void companyOption() {
        System.out.println("""
                1: Новая компания
                2: Редактировать компанию
                3: Войти в компанию""");
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
                companyController.loadCompany("Company");
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
                1: Изменить ФИО
                2: Изменить дату рождения
                3: Изменить пол
                4: Изменить телефон
                5: Изменить отдел
                6: Изменить должность
                7: Изменить руководителя
                8: Изменить зарплату
                9: Удалить сотрудника""");
        switch (scanner.nextInt()) {
            case 1 -> editFioOption();
            case 2 -> {
                companyController.getMainEmployee().editDateOfBirth();
                employeeEditOption();
            }
            case 3 -> {
                companyController.getMainEmployee().editSex();
                employeeEditOption();
            }
            case 4 -> {
                companyController.getMainEmployee().editTelephone();
                employeeEditOption();
            }
            case 5 -> {
                companyController.getMainEmployee().editTeam();
                employeeEditOption();
            }
            case 6 -> {
                companyController.getMainEmployee().editFunction();
                employeeEditOption();
            }
            case 7 -> {
                companyController.getMainEmployee().editBoss();
                employeeEditOption();
            }
            case 8 -> {
                companyController.getMainEmployee().editSalary();
                employeeEditOption();
            }
            case 9 -> {
                companyController.getMainEmployee().deleteEmployee();
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
                1: Изменить фамилию
                2: Изменить имя
                3: Изменить отчество
                4: Назад""");
        switch (scanner.nextInt()) {
            case 1 -> {
                companyController.getMainEmployee().editSurname();
                editFioOption();
            }
            case 2 -> {
                companyController.getMainEmployee().editName();
                editFioOption();
            }
            case 3 -> {
                companyController.getMainEmployee().editMiddleName();
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
                1: Отделы
                2: Должностя
                3: Сотрдуники
                4: Отчеты
                5: Выход из программы""");
        switch (scanner.nextInt()) {
            case 1 -> teamOption();
            case 2 -> functionOption();
            case 3 -> employeeEditOption();
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
                1: Список отделов
                2: Создать отдел
                3: Назад
                """);
        switch (scanner.nextInt()) {
            case 1 -> {
                companyController.getReport().teams();
                teamOption();
            }
            case 2 -> {
                System.out.println("Введите название отдела");
                scanner.nextLine();
                companyController.getMainTeam().createTeam(scanner.nextLine());
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
                1: Редактировать отдел
                2: Удалить отдел
                3: Назад""");
        switch (scanner.nextInt()) {
            case 1 -> {
                System.out.println("Введите номер отдела который необходимо отредактировать:");
                companyController.getMainTeam().setTeam(company.library.getTeams().get(companyController.getSearch().searchStateTeam(company.library.getTeams(), scanner.nextInt())));
                editTeams();
            }
            case 2 -> {
                companyController.getMainTeam().deleteTeam();
                teamOption();
            }
            case 3 -> teamOption();
            default -> {
                error();
                teamEditOption();
            }
        }
    }

    private void editTeams() {
        System.out.println("""
                1: Изменить название отдела
                2: Изменить руководителя отдела
                3: Назад""");
        switch (scanner.nextInt()) {
            case 1 -> {
                System.out.println("Введите название отдела:");
                companyController.getMainTeam().editTeamName(scanner.nextLine());
                System.out.println("Название отдела изменилось!");
                editTeams();
            }
            case 2 -> {
                System.out.println("Ведите номер сотрудника отдела, которого нужно назначить руководителем:");
                companyController.getMainTeam().editTeamBoss(scanner.nextInt());
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
                1: Список должностей
                2: Создать должность
                3: Назад
                """);
        switch (scanner.nextInt()) {
            case 1 -> {
                companyController.getReport().functions();
                functionOption();
            }
            case 2 -> {
                companyController.getMainFunction().createFunctionOption();
                functionOption();
            }
            case 3 -> mainOption();
            default -> {
                error();
                functionOption();
            }
        }
    }

    private void functionEditOption() {
        System.out.println("""
                1: Редактировать должность
                2: Удалить должность
                3: Назад""");
        switch (scanner.nextInt()) {
            case 1 -> {
                companyController.getMainFunction().editFunction();
                functionOption();
            }
            case 2 -> {
               companyController.getMainFunction().deleteFunction();
                functionOption();
            }
            case 3 -> functionOption();
            default -> {
                error();
                functionEditOption();
            }
        }
    }

    private void employeeOption() {
        System.out.println("""
                1: Список сотрудников
                2: Создать сотрудника
                3: Назад""");
        switch (scanner.nextInt()) {
            case 1 -> {
                companyController.getReport().employees();
                employeeOption();
            }
            case 2 -> {
                companyController.getMainEmployee().createEmployeeOption();
                employeeOption();
            }
            case 3 -> mainOption();
            default -> {
                error();
                employeeOption();
            }
        }
    }

    private void employeeEdit2() {
        System.out.println("""
                1: Редактировать сотрудника
                2: Удалить сотрудника
                3: Назад""");
        switch (scanner.nextInt()) {
            case 1 -> {
                companyController.getMainEmployee().editEmployee();
                employeeOption();
            }
            case 2 -> {
                companyController.getMainEmployee().deleteEmployee();
                employeeOption();
            }
            case 3 -> functionOption();
            default -> {
                error();
                employeeEdit2();
            }
        }
    }

    private void reportOption() {
        System.out.println("""
                1: Структура организации(Отдел, Руководитель)
                2: Средняя зарплата(По органицации|По отделам)
                3: 10 самых дорогих сотрудников по ЗП
                4: 10 самых преданных сотрудников по кол-ву лет в фирме
                5: Назад""");
        switch (scanner.nextInt()) {
            case 1 -> System.out.println("Структура организации");
            case 2 -> System.out.println("Средняя зарплата");
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