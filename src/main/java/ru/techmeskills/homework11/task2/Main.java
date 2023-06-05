package ru.techmeskills.homework11.task2;

public class Main {

    public static void main(String[] args) {

        try {
            System.out.println(Security.checkPassword("klklk", "s1ddd", "s1dd"));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
