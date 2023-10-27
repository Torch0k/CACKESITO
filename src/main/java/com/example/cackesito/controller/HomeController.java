package com.example.cackesito.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
    @GetMapping("/")
    public String example(){
        return "example";
    }
    @GetMapping("/example")// Обработка запроса на главную страницу
    public String mainPage(){return "example";}//главная страница
}
