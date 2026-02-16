package com.example.practise.service;

import com.example.practise.dto.FakeStoreProductDTO;
import com.example.practise.models.Category;
import com.example.practise.models.Product;
import com.example.practise.repositories.CategoryRepository;
import com.example.practise.repositories.ProductRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service("SelfProductService")
public class SelfProductService implements ProductService{

    private final ProductRepository productRepository;
    private CategoryRepository categoryRepository;
    public SelfProductService(ProductRepository productRepository, CategoryRepository categoryRepository){
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    public Product getProduct(long id){
        return productRepository.findProductByIdIs(id);
    }

    public Product getProductByCategory(long id){
        return productRepository.findProductByCategoryId(id);
    }

    public ResponseEntity<List<Product>> getProducts(){
        return ResponseEntity.ok(Collections.emptyList());
    }

    public Product createProduct(FakeStoreProductDTO fspd){
        return new Product();
    }
    public Product updateProduct(FakeStoreProductDTO fspd, long id){
        return new Product();
    }
}
