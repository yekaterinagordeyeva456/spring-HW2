package com.example.springhw2.clientservce;

import com.example.springhw2.exeption.WrongLoginExeption;
import com.example.springhw2.exeption.WrongPasswordExeption;

public class ClientService {
    public static void logIn(String Login, String password, String confirmPassword) throws WrongPasswordExeption, WrongLoginExeption {
        if (Login.length() > 20)
            throw new WrongLoginExeption("Длинный логин");
        if (!Login.matches("[a-zA-Z0-9_]+"))
            throw new WrongLoginExeption("Недопустимые символы в логине");
        if (password.length() >= 20)
            throw new WrongPasswordExeption("Длинный пароль");
        if (!password.matches("[a-zA-Z0-9_]+"))
            throw new WrongPasswordExeption("Недопустимые символы в пароле");
        if (!password.equals(confirmPassword))
            throw new WrongPasswordExeption("Пароли не совпадают");
    }
}
