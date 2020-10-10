package com.szymanski.module.books.home;

import com.szymanski.core.config.AwsConfigurationService;
import com.szymanski.core.config.PoseidonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    private AwsConfigurationService awsConfigurationService;
    @Autowired
    private PoseidonConfig poseidonConfig;
    @Autowired
    private HomeService homeService;

    @RequestMapping({"/", "/index.html", "/index.php"})
    public String getHome(Model model) {
        model.addAttribute("greetings", homeService.getGreetings());
        return "home";

    }

    @RequestMapping("/config")
    public String getConfig(Model model) {
        model.addAttribute("awsRegion", awsConfigurationService.getAwsRegion());
        model.addAttribute("poseidonConfig", poseidonConfig);
        return "home";
    }
}
