package org.example.control;

import org.example.companys.Company;

import java.io.Serializable;

public class Report implements Serializable {

    private Company company;
//    private Options options=new Options();
    public Report() {

    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {this.company = company;}

    public void teams() {
        System.out.println(this.company.documents.getTeams());
    }
    public void functions() {
        System.out.println(this.company.documents.getFunctions());
    }
    public void employees() {
        System.out.println(this.company.documents.getEmployee());
    }
    public void companyStructure() {
//        System.out.format( "Отдел", "Руководитель\n");
//        for (int i = 0; i < company.documents.getTeams().size(); i++) {
//
//            System.out.format( company.documents.getTeams().get(i).getTeamName(),
//                    options.printBoss(company.documents.getTeams().get(i).getBoss()), '\n');
//        }
//        System.out.println();
    }

    public void averageSalary() {
//        double salary = 0;
//        for (int i = 0; i < company.documents.getEmployee().size(); i++) {
//            salary += company.documents.getEmployee().get(i).getSalary();
//        }
//        System.out.println("Средняя зарплата в компании: " + salary / company.documents.getEmployee().size());
//        System.out.println();
    }


    public void averageSalaryTeams() {
//        вместо воид дабл
//        double salary = 0;
//        for (int i = 0; i < Team..getEmployee().size(); i++) {
//            salary += team.getEmployee().get(i).getSalary();
//        }
//        return salary/team.getEmployee().size();
//        return 0;
    }

    public void topExpensiveEmployee() {
////        ArrayListList<Employee> employees = new ArrayList<>(company.documents.getEmployee());
////        employees.sort(Comparator.comparing(Employee::getSalary).reversed());
////        System.out.printf("%25s%25s", "ФИО сотрдуника", "Зарплата\n");
////        for (int i = 0; i < employees.size() && i < 10; i++) {
////            System.out.printf("%25s%25s%25s", employees.get(i).getSurname() + ' ' +
////                            employees.get(i).getName() + ' ' +
////                            employees.get(i).getMiddleName(),
////                    employees.get(i).getSalary(), '\n');
////        }
//
    }

    public void topDevotedEmployee() {
////        ArrayListList<Employee> employees = new ArrayList<>(campaign.getEmployee());
////        employees.sort(Comparator.comparing(Employee::getDateOfEmployment));
////        System.out.printf("%25s%25s", "ФИО", "Дата трудоустройства\n");
////        for (int i = 0; i < employees.size() && i < 10; i++) {
////            System.out.printf("%25s%25s%25s", employees.get(i).getSurname() + ' ' +
////                            employees.get(i).getName() + ' ' +
////                            employees.get(i).getMiddleName(),
////                    employees.get(i).getDateOfEmployment(), '\n');
////        }
////        System.out.println();
//
    }


}
