package ru.techmeskills.homework7.task3.document1;

import ru.techmeskills.homework7.task3.Editable;
import ru.techmeskills.homework7.task3.Registr;

import java.util.Date;
import java.util.Scanner;

public class ContractGoods extends Registr implements Editable {
    private String numberOfDocument;
    private String typeOfGoods;
    private int quantityOfGoods;

    private Date dateOfDocument;
    public ContractGoods() {}

    public ContractGoods(String numberOfDocument, String typeOfGoods, int quantityOfGoods, Date dateOfDocument) {
        this.numberOfDocument = numberOfDocument;
        this.typeOfGoods = typeOfGoods;
        this.quantityOfGoods = quantityOfGoods;
        this.dateOfDocument = dateOfDocument;
    }

    public void showInfo() {

        System.out.println("ContractGoods{" +
                "numberOfDocument='" + numberOfDocument + '\'' +
                ", typeOfGoods='" + typeOfGoods + '\'' +
                ", quantityOfGoods=" + quantityOfGoods +
                ", dateOfDocument=" + dateOfDocument +
                '}');
    }

    public void saveDocument(Registr contractGoods) {
        for (int i = 0; i < REGISTR.length; i++) {
            if(REGISTR[i] == null) {
                REGISTR[i] = contractGoods;
                break;
            }
            if (i == REGISTR.length - 1) {
                System.out.println("Память заполнена");
            }

        }
    }

    @Override
    public void save() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер документа");
        String strNumber = scanner.nextLine();
        System.out.println("Введите тип товара");
        String strType = scanner.nextLine();
        System.out.println("Введите количество товара");
        int numberGoods = scanner.nextInt();

        for (int i = 0; i < REGISTR.length; i++) {
            if(REGISTR[i] == null) {
                REGISTR[i] = new ContractGoods(strNumber, strType,numberGoods, new Date());
                break;
            }
            if (i == REGISTR.length - 1) {
                System.out.println("Память заполнена");
            }

        }

    }
    @Override
    public String toString() {
        return "ContractGoods";
    }
}
