package com.example.practise.service;

import com.example.practise.dto.ClientToProduct;
import com.example.practise.dto.FakeStoreProductDTO;
import com.example.practise.dto.ProductByCategoryDTO;
import com.example.practise.dto.ProductById;
import com.example.practise.exceptions.ProductNotFoundException;
import com.example.practise.models.Category;
import com.example.practise.models.Product;
import com.example.practise.repositories.CategoryRepository;
import com.example.practise.repositories.ProductRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("SelfProductService")
public class SelfProductService implements ProductService{

    private final ProductRepository productRepository;
    private CategoryRepository categoryRepository;

    public SelfProductService(ProductRepository productRepository, CategoryRepository categoryRepository){
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    public ProductById getProduct(long id){
        return convertToProductByIdDTO(productRepository.findProductByIdIs(id));
    }


    private ProductById convertToProductByIdDTO(Product product)  {

        ProductById productById = new ProductById();
        productById.setPrice(product.getPrice());
        productById.setDescription(product.getDescription());
        productById.setId(product.getId());
        productById.setTitle(product.getTitle());
        productById.setCategory(product.getCategory().getCategoryName());
        return productById;
    }


    private Product createProductFromDTO(ClientToProduct clientToProduct){
        Product product = new Product();
        Category category = new Category();
        category.setId(clientToProduct.getCategoryId());
        product.setCategory(category);
        product.setTitle(clientToProduct.getTitle());
        product.setPrice(clientToProduct.getPrice());
        product.setDescription(clientToProduct.getDescription());
        product.setImageURL(clientToProduct.getImageURL());
        return product;
    }


    private ProductByCategoryDTO convertToProductByCategoryDTO(Product product) {
        ProductByCategoryDTO productByCategoryDTO = new ProductByCategoryDTO();
        productByCategoryDTO.setId(product.getId());
        productByCategoryDTO.setCategory_name(product.getCategory().getCategoryName());
        productByCategoryDTO.setTitle(product.getTitle());
        return productByCategoryDTO;
    }


    public ProductByCategoryDTO getProductByCategory(long id){
        Product product = productRepository.findProductByCategoryId(id);
        return convertToProductByCategoryDTO(product);
    }

    public ResponseEntity<List<ProductByCategoryDTO>> getProducts() throws ProductNotFoundException{
        List<ProductByCategoryDTO> productByCategoryDTOS = new ArrayList<>();
        List<Product> products = productRepository.findAll();
        if(!products.isEmpty()){
            for(Product product: products){
                productByCategoryDTOS.add(convertToProductByCategoryDTO(product));
            }
        }
        else{
            throw new ProductNotFoundException("Products not found");
        }

        return ResponseEntity.ok().body(productByCategoryDTOS);
    }

    public Product createProduct(ClientToProduct clientToProduct){

        return productRepository.save(createProductFromDTO(clientToProduct));
    }
    public Product updateProduct(FakeStoreProductDTO fspd, long id){
        return new Product();
    }
}
