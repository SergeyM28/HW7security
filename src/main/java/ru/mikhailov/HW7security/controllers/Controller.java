package ru.mikhailov.HW7security.controllers;


import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    //Странци авторизации
    @GetMapping("/login")
    public String login (){
        return "login_page";
    }

    //Страница доступная всем пользователям
    @GetMapping("/public-data")
    public String publicPage (){
        return "public_page";
    }

    //Страница только для пользователей с правами "ADMIN"
    @GetMapping("/private-data")
    public String privatePage (){
        return "private_page";
    }




}
