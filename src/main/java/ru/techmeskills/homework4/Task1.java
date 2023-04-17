package ru.techmeskills.homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {22, 5, 3, 7, 1, 9, 1, 0};
        System.out.println(Arrays.toString(array));
        System.out.println("Введите элемент массива для удаления:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] array2;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Такого элемента нет");
        } else {
            array2 = new int[array.length - count];

            for (int i = 0, k = 0; i < array.length; i++, k++) {
                if (array[i] == number) {
                    k--;
                } else {
                    array2[k] = array[i];
                }
            }
            System.out.println(Arrays.toString(array2));
        }
    }
}

