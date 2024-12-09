package ru.ITGIRL.my_first_SP.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.ITGIRL.my_first_SP.model.Day;

@RestController
public class DayController {
    @Autowired
   private Day day;

    @GetMapping ("/dayOfWeek")
    public String getDayOfWeek (@RequestParam (value = "name") String name){
        day =  Day.valueOf(name);
       return String.format("Сегодня ", day.getRusDay());
    }
}