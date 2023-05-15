package ru.techmeskills.homework6.task3;

import java.util.Scanner;

public class ATMMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM(10,3,12);
        System.out.println(atm);
        System.out.println("Введите сумму для снятия наличных!");
       while (scanner.hasNextInt()) {

           int sum = scanner.nextInt();
           if (String.valueOf(sum).equalsIgnoreCase("exit")) {
               break;
           }
           atm.withdrawMoney(sum);
            //boolean result = atm.withdrawMoney(sum);
            //if (!result) {

           //     System.out.println("ОШИБКА");
          //  }
       }
        System.out.println(atm);

    }
}
