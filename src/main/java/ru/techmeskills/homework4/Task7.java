package ru.techmeskills.homework4;

import java.util.Arrays;
import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        int temp;
        boolean isEnd = false;
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(array));

        while (!isEnd) {
            isEnd = true;
            for (int i = 0; i < array.length - 1; i++) {
                temp = array[i];
                if (array[i] > array[i + 1]) {
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isEnd = false;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
