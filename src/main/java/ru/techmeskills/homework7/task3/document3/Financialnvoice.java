package ru.techmeskills.homework7.task3.document3;

import ru.techmeskills.homework7.task3.Registr;

import java.util.Date;

public class Financialnvoice extends Registr{
    private double sumOfMonth;
    private String numberOfDocument;
    private int numberOfDepartment;

    private Date dateOfDocument;

    public Financialnvoice(double sumOfMonth, String numberOfDocument, int numberOfDepartment, Date dateOfDocument) {
        this.sumOfMonth = sumOfMonth;
        this.numberOfDocument = numberOfDocument;
        this.numberOfDepartment = numberOfDepartment;
        this.dateOfDocument = dateOfDocument;
    }
    public Financialnvoice() {}
    public void showInfo() {
        System.out.println("FinancialInvoice{" +
                "numberOfDocument='" + numberOfDocument + '\'' +
                ", sumOfMonth='" + sumOfMonth + '\'' +
                ", numberOfDepartment=" + numberOfDepartment +
                ", dateOfDocument=" + dateOfDocument +
                '}');
    }

    public void saveDocument(Registr contractHuman) {
        for (int i = 0; i < REGISTR.length; i++) {
            if(REGISTR[i] == null) {
                REGISTR[i] = contractHuman;
                break;
            }
            if (i == REGISTR.length - 1) {
                System.out.println("Память заполнена");
            }

        }
    }

    @Override
    public void save() {

    }
    @Override
    public String toString() {
        return "FinancialInvoice";
    }
}
