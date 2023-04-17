package ru.techmeskills.homework4;


import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        double sum = 0;
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = (int) (Math.random()*10);
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Минимальное значение массива: " + array[0]);
        System.out.println("Максимальное значение массива: " + array[array.length-1]);
        for (int i : array) {
            sum += i;
        }
        System.out.println("Среднее значение массива: " + sum/array.length);
    }
}
