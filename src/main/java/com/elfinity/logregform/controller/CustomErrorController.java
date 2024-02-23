package com.elfinity.logregform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomErrorController {

    @GetMapping("/error")
    public String handleError() {
        // Redirect to the Swagger UI page
        return "redirect:/swagger-ui/index.html";
    }
}
