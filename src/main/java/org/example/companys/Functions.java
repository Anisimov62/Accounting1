package org.example.companys;

import java.io.Serializable;

public class Functions implements Serializable {

    private final int functionNumber;
    private static int numberCreation;
    private String functionName;

    public Functions(String functionName) {
        numberCreation++;
        this.functionName = functionName;
        this.functionNumber = numberCreation;
    }

    public int getNumberCreation() {
        return numberCreation;
    }
    public String getFunctionName() {
        return functionName;
    }
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    @Override
    public String toString() {
        return "\nНомер должности: " + functionNumber +
                " Должность: " + functionName;
    }
}
