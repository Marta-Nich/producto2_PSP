package com.example.producto2.seeds;

import com.example.producto2.model.Menu;
import com.example.producto2.model.Producto;
import com.example.producto2.repository.MenuRepository;
import com.example.producto2.repository.ProductRepository;

public class Seeds {
    private MenuRepository menuRepository;
    private ProductRepository productRepository;


    public Seeds(MenuRepository menuRepository, ProductRepository productRepository) {
        this.menuRepository = menuRepository;
        this.productRepository = productRepository;
    }

    public void generateSeeds() {

        Menu menuLibanes = new Menu("Libanes", 30.5, "hola");
        Menu menuVeggie = new Menu("Veggie", 20, "hola");
        Menu menuBurguer = new Menu("Libanes", 25, "hola");
        Producto productoVeg = new Producto("Lechuga", 5);
        Producto productoCarn = new Producto("Chuleton", 10);
        Producto productoHomn = new Producto("Mix", "producto mixto con vegetales y carne", 10);
        productRepository.save(productoVeg);
        productRepository.save(productoCarn);
        productRepository.save(productoHomn);
        menuRepository.save(menuLibanes);
        menuRepository.save(menuVeggie);
        menuRepository.save(menuBurguer);
    }

}
