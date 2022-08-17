package ru.geekbrains.spring.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.geekbrains.spring.web.model.Product;
import ru.geekbrains.spring.web.services.ProductServices;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

    private ProductServices productServices;

    @Autowired
    public void setProductServices(ProductServices productServices) {
        this.productServices = productServices;
    }

    @GetMapping("/products")
    public String showProductsPage(Model model){
        model.addAttribute("products", productServices.findAll());
        return "products";
    }
}
