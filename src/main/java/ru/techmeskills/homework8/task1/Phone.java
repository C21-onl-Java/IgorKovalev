package ru.techmeskills.homework8.task1;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }


    public String getNumber() {
        return number;
    }

    public String receiveCall(String name) {
        return "Звонит " + name + " " + getNumber();
    }

    public String receiveCall(String name, String model) {
        return "Звонит " + name + " " + getNumber() + " " + model;
    }



    public void sendMessage(String... numbers) {
        System.out.println("Сообщения отправлены следующим номерам:");
        for (String number : numbers) {
            System.out.println(number);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }



}
