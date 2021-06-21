package com.lakshan.springmongodb.controller;

import com.lakshan.springmongodb.model.Product;
import com.lakshan.springmongodb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Lakshan
 * @since 6/21/2021 12:39 PM
 */

@RestController
public class MainController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public ResponseEntity <List<Product>> getAllProduct(){
        return ResponseEntity.ok().body(productService.getAllProduct());
    }

    @PostMapping("/addProduct")
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        return ResponseEntity.ok().body(this.productService.createProduct(product));
    }



}
