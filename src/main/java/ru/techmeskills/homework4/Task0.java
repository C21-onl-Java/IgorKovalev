package ru.techmeskills.homework4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размерность массива:");
        int size = scan.nextInt();
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Введите число для поиска:");
        int numberOfSearch = scan.nextInt();
        Arrays.sort(array);

        if(Arrays.binarySearch(array,numberOfSearch) >= 0) {
            System.out.printf("Число %d входит в массив", numberOfSearch);
        }else {
            System.out.printf("Число %d не входит в массив", numberOfSearch);
        }

    }
}
