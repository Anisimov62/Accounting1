package org.example.companys;

import java.io.Serializable;

public class Functions implements Serializable {

    private final int functionNumber;
    private static int numberCreation;
    private String functionName;

    public Functions(String postName) {
        numberCreation++;
        this.functionName = postName;
        this.functionNumber = numberCreation;
    }

    public int getNumberCreation() {
        return numberCreation;
    }

    public String getPostName() {
        return functionName;
    }

    public void setPostName(String postName) {
        this.functionName = functionName;
    }

    @Override
    public String toString() {
        return "\nID Должности: " + functionNumber +
                " Должность: " + functionName;
    }
}
