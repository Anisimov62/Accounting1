package org.example;

import org.example.control.Options;

import java.io.Serializable;

public class Start implements Serializable {
    public static void main(String[] args) {
        Options options = new Options();
        options.start();
    }}