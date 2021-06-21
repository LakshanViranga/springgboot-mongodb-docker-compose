package com.lakshan.springmongodb.service;

import com.lakshan.springmongodb.model.Product;
import com.lakshan.springmongodb.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Lakshan
 * @since 6/21/2021 12:47 PM
 */

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(Product product){
        return  productRepository.save(product);
    }

    public List<Product> getAllProduct(){
        return this.productRepository.findAll();
    }


}
