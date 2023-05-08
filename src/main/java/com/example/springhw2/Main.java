package com.example.springhw2;

import com.example.springhw2.clientservce.ClientService;
import com.example.springhw2.exeption.WrongLoginExeption;
import com.example.springhw2.exeption.WrongPasswordExeption;

public class Main {
    public static void main(String[] args) {
        try {
            ClientService.logIn("java_skypro_go", "D_1hW@ijjP_9", "D_1hW@ijjP_9");
        } catch (WrongPasswordExeption | WrongLoginExeption e) {
            System.out.println(e.getMessage());
        }
    }
}
