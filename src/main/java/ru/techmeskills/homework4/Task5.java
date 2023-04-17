package ru.techmeskills.homework4;

public class Task5 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int a : array) {
            System.out.print(a + ", ");
        }
        System.out.println();

        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }
        for (int a : array) {
            System.out.print(a + ", ");
        }

    }
}
