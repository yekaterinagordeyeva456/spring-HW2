package com.example.springhw2.exeption;

public class WrongPasswordExeption extends Exception {
    public WrongPasswordExeption(String message) {
        super(message);
    }
}
