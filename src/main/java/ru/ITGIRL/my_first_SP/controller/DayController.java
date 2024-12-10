package ru.ITGIRL.my_first_SP.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.ITGIRL.my_first_SP.model.Day;

@RestController
public class DayController {

    @GetMapping("/dayOfWeek")
    public String getDayOfWeek(@RequestParam(value = "name") String name) {
        try {
            return String.format("Сегодня %s ", Day.valueOf(name.toUpperCase()).getRussianDay());
        } catch (IllegalArgumentException e) {
            return "День введен неверно";
        }
    }
}