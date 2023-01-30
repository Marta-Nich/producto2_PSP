package com.example.producto2.controller;

import com.example.producto2.model.Menu;
import com.example.producto2.model.Producto;
import com.example.producto2.service.menuService.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/")

public class MenuController {
    @Autowired
    private MenuService menuService;

    @GetMapping("/menus")
    public String home(Model model) {
        model.addAttribute("menus", menuService.findAll());

        return "menu";
    }

    @GetMapping(value = "/mostrar")
    public String mostrarMenu(Model model) {
        model.addAttribute("menus", menuService.findAll());
        return "menu";
    }

    @GetMapping("/menus/del/{id}")
    public String eliminarMenu(@PathVariable("id") long id, RedirectAttributes redirectAttrs) {
        menuService.delete(id);
        redirectAttrs
                .addFlashAttribute("mensaje", "Agregado correctamente")
                .addFlashAttribute("clase", "success");
        return "redirect:/mostrar";
    }

    @PostMapping(value = "/edit")
    public String actualizarMenu(@ModelAttribute Menu menu, RedirectAttributes redirectAttrs) {
        menuService.update(menu);
        redirectAttrs
                .addFlashAttribute("mensaje", "Editado correctamente")
                .addFlashAttribute("clase", "success");
        return "redirect:/mostrar";
    }

    @GetMapping(value="/edit/{id}")
    public String editarMenu(@PathVariable Long id, Model model) {
        model.addAttribute("menus", menuService.findById(id));
        return "edit_menu";
    }



}

