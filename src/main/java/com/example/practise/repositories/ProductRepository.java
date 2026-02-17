package com.example.practise.repositories;

import com.example.practise.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findProductByIdIs(Long id);

    Product findProductByCategoryId(Long id);

    Product save(Product product);
}
