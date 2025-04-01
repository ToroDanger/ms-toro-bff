package cl.toro.integration.ms_toro_bff.controller;

import org.springframework.web.bind.annotation.RestController;

import cl.toro.integration.ms_toro_bff.model.dto.Products;
import cl.toro.integration.ms_toro_bff.service.ProductService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class PruebaController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Products> getProducto() {
        return productService.getProduct();
    }
    
}
