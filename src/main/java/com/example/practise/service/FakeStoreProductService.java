package com.example.practise.service;

import com.example.practise.exceptions.ProductNotFoundException;
import com.example.practise.dto.FakeStoreProductDTO;
import com.example.practise.models.Product;
import com.example.practise.models.Category;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class FakeStoreProductService implements ProductService {

    private final RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    private Product convertDTOtoProduct(FakeStoreProductDTO fspd) {
        Product product = new Product();
        Category category = new Category();
        product.setId(fspd.getId());
        product.setTitle(fspd.getTitle());
        product.setPrice(fspd.getPrice());
        product.setDescription(fspd.getDescription());
        product.setImageURL(fspd.getImage());
        category.setCategoryName(fspd.getCategory());
        product.setCategory(category);
        return product;
    }

    private List<Product> convertDTOSToProducts(FakeStoreProductDTO[] dtos) {
        List<Product> products = new ArrayList<>();
        for (FakeStoreProductDTO dto : dtos) {
            products.add(convertDTOtoProduct(dto));
        }
        return products;
    }


    public Product getProduct(long id) {
        String url = "https://fakestoreapi.com/products/" + id;
        FakeStoreProductDTO fspd =
                restTemplate.getForObject(url, FakeStoreProductDTO.class);
        if(fspd == null){
            throw new ProductNotFoundException("Product not found with id: " + id);
        }
        return convertDTOtoProduct(fspd);
    }

    public Product createProduct(FakeStoreProductDTO fspd) {

        String url = "https://fakestoreapi.com/products";
        return convertDTOtoProduct(Objects.requireNonNull(restTemplate.postForObject(url, fspd, FakeStoreProductDTO.class)));
    }

    public ResponseEntity<List<Product>> getProducts() {
        String url = "https://fakestoreapi.com/products";
        FakeStoreProductDTO[] dtos = restTemplate.getForObject(url, FakeStoreProductDTO[].class);
        assert dtos != null;
        ResponseEntity<List<Product>> response = new ResponseEntity<>(convertDTOSToProducts(dtos), HttpStatus.OK);
        return response;
    }

    public Product updateProduct(FakeStoreProductDTO fspd, long id) {
        String url = "https://fakestoreapi.com/products/" + id;
        return new Product();
    }

}
