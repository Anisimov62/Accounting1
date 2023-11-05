package org.example;

import org.example.mains.Options;

import java.io.Serializable;

public class Main implements Serializable {
    public static void main(String[] args) {
        Options options = new Options();
        options.start();
    }}