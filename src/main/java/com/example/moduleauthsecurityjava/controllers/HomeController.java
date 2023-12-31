package com.example.moduleauthsecurityjava.controllers;

import com.example.moduleauthsecurityjava.models.PhoneNumberRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String getHomePage(Model model) {
        model.addAttribute("phoneNumber", new PhoneNumberRequest());
        return "index";
    }
}
