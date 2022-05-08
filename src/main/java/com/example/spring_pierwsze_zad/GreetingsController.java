package com.example.spring_pierwsze_zad;

import model.Greeting;
import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.UserService;

import java.util.List;

@Controller
public class GreetingsController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("greeting", new Greeting());
        model.addAttribute("name", name);
        UserService userService = new UserService();
        List<User> listOfUsers = userService.findAll();
        model.addAttribute("huu", listOfUsers);

        return "greeting";
    }
    @PostMapping ("/greeting")
    public String greeting2(@ModelAttribute Greeting greeting, Model model) {
        model.addAttribute("greeting", greeting);
        return "result";
    }
}