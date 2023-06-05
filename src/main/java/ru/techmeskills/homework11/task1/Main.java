package ru.techmeskills.homework11.task1;

public class Main {
    public static final String TEXT = "1554-aBc-3477-dft-1N3M";

    public static void main(String[] args) {
        try {
            Task1.checkSequence(TEXT, "abc");
            Task1.checkSequence(TEXT, "avn");

        } catch (MyExceptionLetterSequence e) {
            System.out.println(e.getMessage());
        }
        //2
        try {
            Task1.startWith(TEXT);
        } catch (MyExceptionStartsWith e) {
            System.out.println(e.getMessage());
        }
        // 3
        try {
            Task1.endsWith(TEXT);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();

        }

    }
}
