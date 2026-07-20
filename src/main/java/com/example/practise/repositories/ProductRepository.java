package com.example.practise.repositories;

import com.example.practise.models.Product;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findProductByIdIs(Long id);

    Product findProductByCategoryId(Long id);

    @Query("select p from Product p")
    List<Product> getAllProducts();

}
