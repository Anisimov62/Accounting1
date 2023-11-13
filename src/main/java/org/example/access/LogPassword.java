package org.example.access;

import java.io.*;
import java.util.Scanner;

public class LogPassword {
    public void load1() {
        try {
            logPass();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void logPass() throws IOException {
        String login, pass,user; int a=0;
        File LogPass = new File("LogPass.txt");
//        if (!LogPass.exists()) LogPass.createNewFile();
        FileReader fr = new FileReader(LogPass);
        FileWriter fw = new FileWriter(LogPass, true);
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);
        Scanner sc = new Scanner(System.in);
        System.out.printf("Здравствуйте!\n");
        System.out.println("'1' Новый пользователь;" +
                "\n'2' Вход в аккаунт;\n'3' Выход из программы");
        a = sc.nextInt();

        switch (a) {
            case 1:
//                System.out.println("Введите Ваше Имя: ");
//                sc.nextLine();
//                user = sc.nextLine();
////                bw.newLine();
//                bw.write(user);
////                bw.flush();

                System.out.println("Введите Ваш логин: ");
                 sc.nextLine();
                login = sc.nextLine();
//                bw.write("\n_____\n");
                bw.write(login);
                System.out.println("Введите Ваш пароль: ");
                pass = sc.nextLine();
//                sc.nextLine();
                bw.newLine();
                bw.write(pass);
                bw.flush();
                bw.close(); break;
            case 2:
                System.out.println("Логин: ");
                sc.nextLine();
                login = sc.nextLine();
                System.out.println("Пароль: ");
                pass = sc.nextLine();
                if (login.equals(br.readLine()) && pass.equals(br.readLine()))
                    System.out.println("Программа EAP Приветствует Вас, "+login+"!");
                else {System.out.println("Неправильный логин или пароль...");
                System.exit(0);
                }
                break;

            default: System.exit(0); break;
        }
    }
}
