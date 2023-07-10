/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dtm.controllers;

import com.dtm.service.ProductService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author ACER
 */
@Controller
public class IndexController {
    @Autowired
    private ProductService productService;
    @RequestMapping("/")
    public String index(Model model, @RequestParam Map<String,String> params){
        model.addAttribute("products",this.productService.getProducts(params));
        return "index";
    }
}
