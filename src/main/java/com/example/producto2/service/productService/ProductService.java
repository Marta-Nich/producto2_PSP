package com.example.producto2.service.productService;

import com.example.producto2.model.Menu;
import com.example.producto2.model.Producto;
import com.example.producto2.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ProductService implements IProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Object findAll() {
        return this.productRepository.findAll();
    }

    @Override
    public Optional<Producto> findById(Long id) {
        return  productRepository.findById(id);
    }

    @Override
    public Producto create(Producto prod) {
        return productRepository.save(prod);
    }

    @Override
    public Producto update(Producto menu) {
        Producto currentProduct = productRepository.findById(menu.getId()).get();
        currentProduct.setPrice(menu.getPrice());
        currentProduct.setName(menu.getName());
        currentProduct.setdescrip(menu.getDescrip());
        return productRepository.save(currentProduct);

    }

    @Override
    public void delete(Long id) {
        Optional<Producto> prod = productRepository.findById(id);
        System.out.println(prod);
        productRepository.deleteById(id);
    }
}
