package co.edu.utp.misiontic2022.ronaldopacheco.Videotienda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//spring mvs

@Controller
public class VideoShopController {

    @GetMapping("/catalog")
    public String goToCatalog (Model model) {
        return "catalog";
    }
    
    @GetMapping("/contact")
    public String goToContact (Model model) {
        return "contact";
    }

    @GetMapping("/login")
    public String goToLogin (Model model) {
        return "login";
    }
}