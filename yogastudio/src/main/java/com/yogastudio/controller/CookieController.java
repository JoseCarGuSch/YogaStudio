package com.yogastudio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/index.html")
public class CookieController {

    @PostMapping("/acceptCookies")
    public String acceptCookies(HttpSession session) {
        session.setAttribute("cookiesAccepted", true);
        return "redirect:/templates/index.html"; // Redirige a la página index.html (plantilla Thymeleaf)
    }

    @PostMapping("/clearCookies")
    public String clearCookies(HttpSession session) {
        session.removeAttribute("cookiesAccepted");
        return "redirect:/templates/index.html"; // Redirige a la página index.html (plantilla Thymeleaf)
    }
}

