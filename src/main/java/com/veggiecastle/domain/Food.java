package com.veggiecastle.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "food")
public class Food extends BaseDomain {
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "branch_id", nullable = false)
    private String branchId;

    @Column(name = "day", nullable = false)
    private String day;

    @Column(name = "image_food")
    private String imageFood;

    @Column(name = "price_food")
    private String priceFood;

}
