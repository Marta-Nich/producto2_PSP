package com.example.producto2.controller;

import com.example.producto2.service.menuService.MenuService;
import com.example.producto2.service.productService.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/")

public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public String home(Model model){
        model.addAttribute("product",productService.findAll());

        return "/product";
    }

    @GetMapping(value = "/mostrar")
    public String mostrarMenu(Model model) {
        model.addAttribute("menus", productService.findAll());
        return "product";
    }

    @GetMapping("/product/del/{id}")
    public String eliminarMenu(@PathVariable("id") long id, RedirectAttributes redirectAttrs) {
        productService.delete(id);
        redirectAttrs
                .addFlashAttribute("mensaje", "Agregado correctamente")
                .addFlashAttribute("clase", "success");
        return "redirect:/mostrar";
    }
}

