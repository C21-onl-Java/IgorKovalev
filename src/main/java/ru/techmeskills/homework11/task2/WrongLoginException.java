package ru.techmeskills.homework11.task2;

public class WrongLoginException extends Exception{
    public WrongLoginException() {}

    public WrongLoginException(String message) {
        super(message);
    }
}
