package com.szymanski.module.books.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    private HomeService homeService;
@RequestMapping ({"/", "/index.html","/index.php"})
    public String getHome(Model model){
        model.addAttribute("greetings", homeService.getGreetings());
        return "home";

    }
}
