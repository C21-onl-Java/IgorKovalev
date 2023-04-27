package ru.techmeskills.homework6.task1;

public class MainTask1 {
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard("BY234567238", 200d);
        CreditCard creditCard2 = new CreditCard("BY245564455", 300d);
        CreditCard creditCard3 = new CreditCard("RU234567238", 400d);
        System.out.println(creditCard1);
        System.out.println(creditCard2);
        System.out.println(creditCard3);
        creditCard1.addMoney(300);
        creditCard2.addMoney(500);

        creditCard3.withdrawMoney(300);
        System.out.println(creditCard1);
        System.out.println(creditCard2);
        System.out.println(creditCard3);

    }
}
