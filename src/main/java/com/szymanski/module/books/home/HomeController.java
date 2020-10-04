package com.szymanski.module.books.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    private HomeService homeService;
@GetMapping("/")
    public String getHome(Model model){
        model.addAttribute("greetings", homeService.getGreetings());
        return "home";

    }
}
