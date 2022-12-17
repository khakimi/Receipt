package com.khakimi.receipt.repository;

import com.khakimi.receipt.entity.DiscountCard;
import com.khakimi.receipt.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
