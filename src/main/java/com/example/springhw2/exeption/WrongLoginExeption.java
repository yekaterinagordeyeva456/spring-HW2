package com.example.springhw2.exeption;

public class WrongLoginExeption extends Exception {
    public WrongLoginExeption(String message) {
        super(message);
    }
}
