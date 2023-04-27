package ru.techmeskills.homework6.task1;


public class CreditCard {
    private String numberOfAccount;
    private double sumOnAccount;

    public CreditCard(String numberOfAccount, double sumOnAccount) {
        this.numberOfAccount = numberOfAccount;
        this.sumOnAccount = sumOnAccount;

    }


    public double getSumOnAccount() {
        return sumOnAccount;
    }

    public void addMoney(double sum) {
        sumOnAccount += sum;
        System.out.println("Вы успешно внесли " + sum + " на свой счёт.");
    }

    public void withdrawMoney(double sum) {
        if (sum <= 0) {
            System.out.println("Проверьте введенную сумму");
            return;
        }
        if (sum > sumOnAccount) {
            System.out.println("У вас недостаточно средств на счёте");
        } else {
        sumOnAccount -= sum;
            System.out.println("Вы успешно сняли " + sum + " со своего счёта.");}
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "numberOfAccount='" + numberOfAccount + '\'' +
                ", sumOnAccount=" + sumOnAccount +
                '}';
    }


}
