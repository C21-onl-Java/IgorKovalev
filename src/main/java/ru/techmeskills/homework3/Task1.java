package ru.techmeskills.homework3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер месяца от 1 до 12");
        int numberOfMonth = scan.nextInt();
        switch (numberOfMonth) {
            case 12:
            case 1:
            case 2:
                System.out.println("Пора года: \"Зима\"");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Пора года: \"Весна\"");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Пора года: \"Лето\"");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Пора года: \"Осень\"");
                break;
            default:
                System.out.println("Проверьте введенное значение номера месяца от 1 до 12");
                break;
        }
    }
}
