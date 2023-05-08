package ru.techmeskills.homework7.task3;

import ru.techmeskills.homework7.task3.document1.ContractGoods;
import ru.techmeskills.homework7.task3.document2.ContractHuman;
import ru.techmeskills.homework7.task3.document3.Financialnvoice;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ContractGoods contractGoods = new ContractGoods("3434ВА", "Clothes", 100, new Date());
        ContractGoods contractGoods1 = new ContractGoods(); // пустой объект, когда будем его сохранять, сразу будем вносить данный;
        ContractHuman contractHuman = new ContractHuman("LK123", "Vadim", "03-08-24", new Date());
        Financialnvoice financialnvoice = new Financialnvoice(154.45, "AB34567", 34, new Date());
        contractGoods.showInfo();
        contractGoods1.showInfo();
        contractGoods.saveDocument(contractGoods);
        Registr.REGISTR[0].showInfo(); // проверяем сохранили или нет в массив
        contractGoods1.save();
        contractHuman.saveDocument(contractHuman);
        financialnvoice.saveDocument(financialnvoice);
        Registr.REGISTR[0].showInfo();
        Registr.REGISTR[1].showInfo();
        Registr.REGISTR[2].showInfo();
        Registr.REGISTR[3].showInfo();
        System.out.println(Arrays.toString(Registr.REGISTR));


    }
}
