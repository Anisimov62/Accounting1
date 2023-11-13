package org.example.companys;
import java.io.Serializable;

public class Company implements Serializable {
//    public Object documents;
    private String companyName;
        public Company() {
            this.companyName = companyName;
        }
        public Documents documents = new Documents();
        public String getCompanyName() {
            return companyName;
        }
        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        @Override
        public String toString() {
            return "Company{" +
                    "companyName='" + companyName + '\'' +
                    '}';
        }
    }

