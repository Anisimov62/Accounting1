package org.example.companys;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

    public class Team implements Serializable {

        private final int teamNumber;
        private static int numberCreation;
        private String teamName;
        private Employee boss;


        private final List<Employee> employee = new ArrayList<>();

        public Team(String teamName) {
            numberCreation++;
            this.teamName = teamName;
            this.teamNumber = numberCreation;
        }

        public int getTeamNumber() {
            return numberCreation;
        }

        public void setEmployee(Employee employee) {
            this.employee.add(employee);
        }

        public List<Employee> getEmployee() {
            return employee;
        }

        public Employee getBoss() {
            return boss;
        }

        public void setBoss(Employee boss) {
            this.boss= boss;
        }

        public String getTeamName() {
            return teamName;
        }

        public void setTeamName(String teamName) {
            this.teamName = teamName;
        }

        @Override
        public String toString() {
            return "\nНомер отдела: " + teamNumber +
                    " Отдел: " + teamName +
                    " Руководитель: " + boss;

        }
    }


