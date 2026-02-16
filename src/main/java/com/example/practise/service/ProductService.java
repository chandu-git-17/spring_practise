package com.example.practise.service;

import com.example.practise.dto.FakeStoreProductDTO;
import com.example.practise.models.Category;
import com.example.practise.models.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {

    public Product getProduct(long id);
    public Product getProductByCategory(long id);
    public ResponseEntity<List<Product>> getProducts();
    public  Product createProduct(FakeStoreProductDTO fspd);
    public Product updateProduct(FakeStoreProductDTO fspd, long id);
}
