package com.example.practise.service;

import com.example.practise.dto.*;
import com.example.practise.models.Category;
import com.example.practise.models.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {

    public ProductById getProduct(long id);
    public ProductByCategoryDTO getProductByCategory(long id);
    public ResponseEntity<List<ProductByCategoryDTO>> getProducts();
    public Product createProduct(ClientToProduct clientToProduct);
    public Product updateProduct(FakeStoreProductDTO fspd, long id);
    public List<BasicProductListDTO> getAllProducts();
}
