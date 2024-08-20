package com.samsung.javaadv2test.controller;

import com.samsung.javaadv2test.services.CatalogService;
import com.samsung.javaadv2test.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    CatalogService catalogService;

    @Autowired
    ProductService productService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

}
