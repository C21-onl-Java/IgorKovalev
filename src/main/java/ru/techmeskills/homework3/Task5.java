package ru.techmeskills.homework3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Введите номер цвета радуги от 1 до 7");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("Номер " + number + " соответствует красному цвету.");
                break;
            case 2:
                System.out.printf("Номер %d соответствует %s", number, "оранжевому цвету.");
                break;
            case 3:
                System.out.println("Номер " + number + " соответствует желтому цвету.");
                break;
            case 4:
                System.out.println("Номер " + number + " соответствует зеленому цвету.");
                break;
            case 5:
                System.out.println("Номер " + number + " соответствует голубому цвету.");
                break;
            case 6:
                System.out.println("Номер " + number + " соответствует синему цвету.");
                break;
            case 7:
                System.out.println("Номер " + number + " соответствует фиолетовому цвету.");
                break;
            default:
                System.out.println("Проверьте правильно ли введен номер цвета");
                break;
        }
    }
}
