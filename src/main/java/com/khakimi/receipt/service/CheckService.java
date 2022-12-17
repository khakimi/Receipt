package com.khakimi.receipt.service;

import com.khakimi.receipt.entity.Product;
import com.khakimi.receipt.repository.DiscountCardRepository;
import com.khakimi.receipt.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CheckService {

    private final DiscountCardRepository discountCardRepository;

    private final ProductRepository productRepository;

    public Product getProductById(Long id){
        return productRepository.findById(id).orElseThrow();
    }

}
