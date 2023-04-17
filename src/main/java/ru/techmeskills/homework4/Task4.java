package ru.techmeskills.homework4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    static int [] array;
    public static void main(String[] args) {
        System.out.println("Задайте размер массива больше 5 и меньше или равно 10.");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean isOk = true;
        int count = 0;
        while(isOk) {
            int arrayNumber = scanner.nextInt();
            if (arrayNumber > 5 && arrayNumber <= 10) {
                isOk = false;
                array = new int[arrayNumber];
                for (int i = 0; i < arrayNumber; i++) {
                    array[i] = random.nextInt(100);
                    if(array[i] % 2 == 0) {
                        count++;
                    }
                }
                System.out.println(Arrays.toString(array));
            }else {
                System.out.println("Введите значение соответствующее условию");
            }
        }

        if (count > 0) {

            int[] array2 = new int[count];

            for (int i = 0, k = 0; i < array.length; i++, k++) {
                if(array[i] % 2 == 0) {
                    array2[k] = array[i];
                }
                else {
                    k--;
                }
            }
            System.out.println(Arrays.toString(array2));
        }

    }
}
