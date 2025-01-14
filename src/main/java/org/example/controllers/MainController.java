package org.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
       @GetMapping // відстлідкування URL адресів
    public String  index(){
           /* можна прописувати будь-який функціонал
            * який повинен бути виконаний при
            * переході користувача на головну сторінку
            * (підключитися до бази даних, отримати записи,
            * передати записи усередину шаблону будь-які) */

           //При передозі на сторінку буде відображено шаблон
           return "index";
       }
}
