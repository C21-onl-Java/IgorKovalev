package ru.techmeskills.homework7.task3.document2;

import ru.techmeskills.homework7.task3.Registr;

import java.util.Date;

public class ContractHuman extends Registr {

    private String numberOfDocument;
    private String nameOfPerson;
    private String dateContractEnd;

    private Date dateOfDocument;
    public ContractHuman() {}

    public ContractHuman(String numberOfDocument, String nameOfPerson, String dateContractEnd, Date dateOfDocument) {
        this.numberOfDocument = numberOfDocument;
        this.nameOfPerson = nameOfPerson;
        this.dateContractEnd = dateContractEnd;
        this.dateOfDocument = dateOfDocument;
    }

    public void showInfo() {
        System.out.println("ContractHuman{" +
                "numberOfDocument='" + numberOfDocument + '\'' +
                ", nameOfPerson='" + nameOfPerson + '\'' +
                ", dateContractEnd=" + dateContractEnd +
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
        return "ContractHuman";
    }
}
