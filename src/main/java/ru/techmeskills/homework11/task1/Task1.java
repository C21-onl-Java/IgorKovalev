package ru.techmeskills.homework11.task1;

public class Task1 {
    //1
    public static void checkSequence(String text, String text2) {

        if (text.toLowerCase().contains(text2.toLowerCase())) {
            System.out.println("Номер документа содержит последовательность: " + text2);
        } else {
            throw new MyExceptionLetterSequence("ОШИБКА!!!!!!!!!!!!" + "Номер документа не содержит последовательность: " + text2);
        }
    }

    //2

    public static void startWith(String text) {

        if (text.startsWith("555")) {
            System.out.println("Документ начинается с 555");
        } else {
            throw new MyExceptionStartsWith("ОЩИБКА, ДОКУМЕНТ НЕ НАЧИНАЕТСЯ С 555");
        }
    }

    //3
    public static void endsWith(String text) {

        if (text.endsWith("1N4M")) {
            System.out.println("Документ заканчивается последовательностью \"1N4M\"");
        } else {
            throw new MyExceptionEndsWith("ОШИБКА!!!");
        }

    }

}
