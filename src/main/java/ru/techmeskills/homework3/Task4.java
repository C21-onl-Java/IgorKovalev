package ru.techmeskills.homework3;

import java.util.Scanner;

public class Task4 {
    public static final String WARM = "Тепло";
    public static final String COMFORT = "Нормально";
    public static final String COLD = "Холодно";
    public static final int COMFORT_TEMP = -5;
    public static final int COLD_TEMP = -20;

    public static void main(String[] args) {
        System.out.println("Введите температуру на улице: ");
        Scanner scan = new Scanner(System.in);
        int temperature = scan.nextInt();
        if (temperature > COMFORT_TEMP) {
            System.out.println(WARM);
        } else if (temperature > COLD_TEMP) {
            System.out.println(COMFORT);
        } else{
            System.out.println(COLD);
        }
    }
}
