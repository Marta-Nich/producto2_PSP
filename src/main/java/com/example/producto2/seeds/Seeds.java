package com.example.producto2.seeds;

import com.example.producto2.model.Menu;
import com.example.producto2.repository.MenuRepository;

public class Seeds {
    private MenuRepository menuRepository;

    public Seeds(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public void generateSeeds() {

        Menu menuLibanes = new Menu("Libanes", 30.5, "hola");
        Menu menuVeggie = new Menu("Veggie", 20, "hola");
        Menu menuBurguer = new Menu("Libanes", 25, "hola");

        menuRepository.save(menuLibanes);
        menuRepository.save(menuVeggie);
        menuRepository.save(menuBurguer);
    }

}
