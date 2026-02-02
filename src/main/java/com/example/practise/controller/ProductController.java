package com.example.practise.controller;

import com.example.practise.models.Product;
import com.example.practise.service.FakeStoreProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController ()
@RequestMapping("/product")
public class ProductController {

    private FakeStoreProductService fsps;

    public ProductController(FakeStoreProductService fsps){
        this.fsps = fsps;
    }

    @GetMapping(value = "/hello/{name}")
    public String getHello(@PathVariable String name,
                           @RequestParam("city") String county,
                           @RequestParam(name = "game", required = false, defaultValue = "") String sport) {
        if (!sport.isEmpty()) {
            return "Hello " + name + " welcome to " + county + " you will be playing " + sport;
        }
        else{
            return "Hello " + name + " welcome to " + county;
        }
    }

    @PostMapping()
    public Product createProduct (@RequestBody Product product)
    {
        Product p = new Product();
        product.setId(1);
        return p;
    }

    @GetMapping("/{id}")
    public Product getSingleProduct(@PathVariable long id){
        return fsps.getProduct(id);
    }


    @PatchMapping("/{id}")
    public Product updateProduct(@PathVariable long id , @RequestBody Product product)
    {
        return new Product();
    }

    @PutMapping("/{id}")
    public Product upgradeProduct(@PathVariable long id, @RequestBody Product product){
        return new Product();
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable long id){

    }


}
