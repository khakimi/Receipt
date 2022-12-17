package com.khakimi.receipt.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.LinkedHashMap;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CheckDto {

    private LinkedHashMap<Long, Integer> productQtyMap;

    private Long discountCardId;
}
