package org.example.companys;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Employee implements Serializable {

        private String surname;
        private String name;
        private String middleName;
        private LocalDate dateOfBirthday;
        private String sex;
        private String telephone;
        private Functions functions;
        private Team team;
        private Employee boss;
        private LocalDate dateOfEmployment;
        private int salary;
        private final int employeeNumber;
        private static int numberCreation;
//        private enum sex{Man("ver"),woman}


        public Employee(String surname, String name, String middleName) {
            this.surname = surname;
            this.name = name;
            this.middleName = middleName;
            numberCreation++;
            this.employeeNumber = numberCreation;
        }

        public int getNumberCreation() {
            return numberCreation;
        }

        public String getSurname() {
            return surname;
        }
        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public String getMiddleName() {
            return middleName;
        }
        public void setMiddleName(String middleName) {
            this.middleName = middleName;
        }

        public LocalDate getDateOfBirthday() {
            return dateOfBirthday;
        }
        public void setDateOfBirthday(LocalDate dateOfBirthday) {
            this.dateOfBirthday = dateOfBirthday;
        }

        public String getSex() {
            return sex;
        }
        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getTelephone() {
            return telephone;
        }
        public void setTelephone(String telephone) {
            this.telephone = telephone;
        }

        public Functions getFunctions() {
            return functions;
        }
        public void setFunctions(Functions functions) {
            this.functions = functions;
        }

        public Team getTeam() {
            return team;
        }
        public void setTeam(Team team) {
            this.team = team;
        }

        public Employee getBoss() {
            return boss;
        }
        public void setBoss(Employee boss) {
            this.boss = boss;
        }

        public String getDateOfEmployment() {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            return dateOfEmployment.format(dateTimeFormatter);
        }
        public void setDateOfEmployment(LocalDate dateOfEmployment) {
            this.dateOfEmployment = dateOfEmployment;
        }

        public int getSalary() {
            return salary;
        }
        public void setSalary(int salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "\nСотрудник: " +
                    "\nФИО: " + surname + " " + name + " " + middleName +
                    "\nДата рождения: " + dateOfBirthday +
                    "\nПол(Мужской/женский): " + sex +
                    "\nТелефон: " + telephone +
                    "\nДолжность: " + functions +
                    "\nОтдел: " + team +
                    "\nРуководитель: " + boss +
                    "\nДата трудоустройства: " + dateOfEmployment +
                    "\nЗаработная плата: " + salary +
                    "\nНомер Сотрудника: " + employeeNumber +
                    "\n";
        }
    }


