package com.grampanchayat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String homePage() {
        return "html_files/home"; // no "templates" in path!
    }

    @GetMapping("/about")
    public String about() {
        return "html_files/about";
    }

    @GetMapping("/contact")
    public String contact() {
        return "html_files/contact";
    }

    @GetMapping("/future")
    public String future() {
        return "html_files/future";
    }

    @GetMapping("/schames")
    public String schames() {
        return "html_files/schames";
    }

    @GetMapping("/test")
    public String testPage() {
        return "/test";
    }

}
