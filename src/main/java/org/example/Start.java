package org.example;

import org.example.access.LogPassword;
import org.example.control.Options;

import java.io.Serializable;

public class Start implements Serializable {
    public static void main(String[] args) {
        LogPassword logPassword=new LogPassword();
        logPassword.load1();
        Options options = new Options();
        options.load2();
    }}