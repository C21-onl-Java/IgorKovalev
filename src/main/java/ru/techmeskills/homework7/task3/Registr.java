package ru.techmeskills.homework7.task3;

public abstract class Registr implements Editable{
    public static final Registr[] REGISTR = new Registr[10];
    public abstract void saveDocument(Registr document);
    public abstract void showInfo();


    abstract public void save();
}
