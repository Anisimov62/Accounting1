package org.example.access;

import java.io.*;
import java.util.Scanner;

public class LogPassword {
    public static void main(String[] args) throws IOException {
        String login, pass,user = "User"; int a=0;
        File LP = new File("LogPass.txt");
        if (!LP.exists()) LP.createNewFile();
        FileReader fr = new FileReader(LP);
        FileWriter fw = new FileWriter(LP, true);
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);
        Scanner sc = new Scanner(System.in);
        System.out.printf("Здравствуйте!\n");
        System.out.println("'1' Новый пользователь;\n'2' Вход в аккаунт;\n'3' Выход из программы");
        a = sc.nextInt();

        switch (a) {
            case 1:
//                System.out.println("Введите Ваше Имя: ");
//                user = sc.nextLine();
//                bw.newLine();
//                bw.write(user);
//                bw.flush();
                System.out.println("Введите Ваш логин: ");
                 sc.nextLine();
                login = sc.nextLine();
                bw.write(login);
                System.out.println("Введите Ваш пароль: ");
                pass = sc.nextLine();
                bw.newLine();
                bw.write(pass);
//                bw.flush();
                bw.close(); break;
            case 2:
                System.out.println("Логин: ");
                sc.nextLine();
                login = sc.nextLine();
                System.out.println("Пароль: ");
                pass = sc.nextLine();
                if (login.equals(br.readLine()) && pass.equals(br.readLine()))
                    System.out.println("Программа EAP Приветствует Вас, "+user+"!"); else System.out.println("Неправильный логин или пароль...");
                break;
            default: System.exit(0); break;
        }
    }
}
