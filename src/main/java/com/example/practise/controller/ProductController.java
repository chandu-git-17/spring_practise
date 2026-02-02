package com.example.practise.controller;

import com.example.practise.service.Product;
import jakarta.websocket.server.PathParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController ()
@RequestMapping("/product")
public class ProductController {

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
