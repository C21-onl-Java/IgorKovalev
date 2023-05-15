package ru.techmeskills.homework6.task3;


public class ATM {
    private int numberOf20;
    private int numberOf50;
    private int numberOf100;

    public ATM(int numberOf20, int numberOf50, int numberOf100) {
        this.numberOf20 = numberOf20;
        this.numberOf50 = numberOf50;
        this.numberOf100 = numberOf100;
    }

    private void checkMoney(int sum) {
        int count = 0;
        for (int i = 1; i <= sum / 100; i++, count++) {
            if (numberOf100 == 0) {
                break;
            }
            numberOf100 -= 1;
        }
        sum -= count * 100;

        int count2 = 0;
        if (sum % 50 == 0 || sum % 50 % 20 == 0) {
            for (int i = 0; i < sum / 50; i++, count2++) {
                if (numberOf50 == 0) {
                    break;
                }
                numberOf50 -= 1;
            }
        } else {
            for (int i = 0; i < sum / 50 - 1; i++, count2++) {
                if (numberOf50 == 0) {
                    break;
                }
                numberOf50 -= 1;
            }
        }
        sum -= count2 * 50;

        int count3 = 0;
        for (int i = 1; i <= sum / 20; i++, count3++) {
            if (numberOf20 == 0) {
                break;
            }
            numberOf20 -= 1;
        }

        sum -= count3 * 20;
        if (sum != 0) {
            numberOf100 += count;
            numberOf50 += count2;
            numberOf20 += count3;
            // return false;

        }
        System.out.println("Вы успешно сняли деньги");
        System.out.println("Вы сняли банкноты номиналом 100 в количестве " + count +
                " штук");
        System.out.println("Вы сняли банкноты номиналом 50 в количестве " + count2 +
                " штук");
        System.out.println("Вы сняли банкноты номиналом 20 в количестве " + count3 +
                " штук");
    }

    public void withdrawMoney(int sum) {
        System.out.printf("Вы заказали сумму: %d;", sum);
        System.out.println();
        if (sum > (numberOf20 * 20 + numberOf50 * 50 + numberOf100 * 100)) {
            System.out.println("В банкомате недостаточно средств!");
            // return;
        } else if (sum % 2 != 0) {
            System.out.println("К сожалению таких купюр нет!, введите другую сумму");
            //return false;
        } else {
            checkMoney(sum);

         //return true;
        }
    }

    @Override
    public String toString() {
        return "Банкноты в банкомате:" + "\n" +
                "Номиналом 20: " + numberOf20 + " штук;" + '\n' +
                "Номиналом 50: " + numberOf50 + " штук;" + "\n" +
                "Номиналом 100: " + numberOf100 + " штук;";
    }
}



