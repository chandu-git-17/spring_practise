package com.example.practise.controller;

import com.example.practise.dto.ClientToProduct;
import com.example.practise.dto.FakeStoreProductDTO;
import com.example.practise.dto.ProductByCategoryDTO;
import com.example.practise.dto.ProductById;
import com.example.practise.models.Category;
import com.example.practise.models.Product;
import com.example.practise.service.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping("/product")
public class ProductController {

    private final RestTemplate restTemplate;
    private ProductService fsps;

    public ProductController(@Qualifier("SelfProductService") ProductService fsps, RestTemplate restTemplate) {
        this.fsps = fsps;
        this.restTemplate = restTemplate;
    }

    @GetMapping(value = "/hello/{name}")
    public String getHello(@PathVariable String name,
                           @RequestParam("city") String county,
                           @RequestParam(name = "game", required = false, defaultValue = "") String sport) {
        if (!sport.isEmpty()) {
            return "Hello " + name + " welcome to " + county + " you will be playing " + sport;
        } else {
            return "Hello " + name + " welcome to " + county;
        }
    }

    @PostMapping()
    public Product createProduct(@RequestBody Product product) {
        return fsps.createProduct(product);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductById> getSingleProduct(@PathVariable long id) {
        return ResponseEntity.status(HttpStatus.OK).body(fsps.getProduct(id));
    }

    @GetMapping("/category/{id}")
    public ProductByCategoryDTO getProductByCategory(@PathVariable long id){
        return fsps.getProductByCategory(id);
    }

    @GetMapping()
    private ResponseEntity<List<ProductByCategoryDTO>> getAllProducts() {
        return fsps.getProducts();
    }


    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable long id, @RequestBody FakeStoreProductDTO fsdt) {
        return fsps.updateProduct(fsdt, id);
    }

//    @PutMapping("/{id}")
//    public Product upgradeProduct(@PathVariable long id, @RequestBody Product product){
//        return new Product();
//    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable long id) {

    }


}
