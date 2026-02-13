package com.example.practise.controller;

import com.example.practise.dto.FakeStoreProductDTO;
import com.example.practise.models.Product;
import com.example.practise.service.FakeStoreProductService;
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

    public ProductController(@Qualifier("FakeStoreProductService") ProductService fsps, RestTemplate restTemplate) {
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
    public Product createProduct(@RequestBody FakeStoreProductDTO fspd) {
        return fsps.createProduct(fspd);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getSingleProduct(@PathVariable long id) {
        Product product = fsps.getProduct(id);
        System.out.println(product);
        return ResponseEntity.status(HttpStatus.OK).body(product);
    }

    @GetMapping()
    private ResponseEntity<List<Product>> getAllProducts() {
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
