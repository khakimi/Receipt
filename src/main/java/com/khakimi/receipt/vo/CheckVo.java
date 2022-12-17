package com.khakimi.receipt.vo;

import com.khakimi.receipt.entity.DiscountCard;
import com.khakimi.receipt.entity.Product;

import java.util.LinkedHashMap;
import java.util.List;

public class CheckVo {
    
    private LinkedHashMap<Long, Integer> productQtyMap;

    private List<Product> productList;

    private DiscountCard discountCard;
}
