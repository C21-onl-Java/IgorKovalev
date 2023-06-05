package ru.techmeskills.homework11.task2;

public class WrongPasswordException extends Exception{
    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
