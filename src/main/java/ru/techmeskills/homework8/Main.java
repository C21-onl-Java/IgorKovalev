package ru.techmeskills.homework8;

import ru.techmeskills.homework8.task1.Phone;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone("+375 33 3456783", "Videophone", 156.2);
        Phone phone3 = new Phone("+375 29 6456813", "Smartphone");
        System.out.println(phone1.getNumber());
        System.out.println(phone1.receiveCall("Artem"));
        System.out.println(phone2.receiveCall("Igor"));
        System.out.println(phone3.receiveCall("Vadim"));
        System.out.println(phone3.receiveCall("Misha", "Smartphone"));
        phone2.sendMessage("+375 33 3456783", "+375 33 5454083", "+375 33 3456783");
        System.out.println(phone2);

    }
}
