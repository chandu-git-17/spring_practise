package com.example.practise.service;

import com.example.practise.dto.FakeStoreProductDTO;
import com.example.practise.models.Product;
import com.example.practise.models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@Service
public class FakeStoreProductService implements ProductService{

    private final RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    private Product convertDTOtoProduct(FakeStoreProductDTO fspd){
        Product product = new Product();
        Category category = new Category();
        product.setId(fspd.getId());
        product.setTitle(fspd.getTitle());
        product.setPrice(fspd.getPrice());
        product.setDescription(fspd.getDescription());
        product.setImageURL(fspd.getImage());
        category.setCategoryName(fspd.getCategory());
        product.setCategory(category);
        category.setId(1);
        return product;
    }


    public Product getProduct(long id){

        String url = "https://fakestoreapi.com/products/" + id;

        FakeStoreProductDTO fspd =
                restTemplate.getForObject(url, FakeStoreProductDTO.class);

        if (fspd == null) {
            throw new RuntimeException("Product not found");
        }

        return convertDTOtoProduct(fspd);
    }


    public Product createProduct(FakeStoreProductDTO fspd){

        String url = "https://fakestoreapi.com/products";
        return convertDTOtoProduct(restTemplate.postForObject(url, fspd, FakeStoreProductDTO.class));
    }

}
