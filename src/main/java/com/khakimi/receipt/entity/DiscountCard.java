package com.khakimi.receipt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "discount_card")
@Entity
public class DiscountCard {
    @Id
    private Long id;

    @Column(name = "discount_percentage")
    private Integer discountPercentage;

    private Boolean active;
}
