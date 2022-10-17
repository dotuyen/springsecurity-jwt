package com.veggiecastle.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "sets")
public class Sets extends BaseDomain {
    @Column(name = "branch_id", nullable = false)
    private String branchId;

    @Column(name = "day")
    private String day;

    @Column(name = "food_id")
    private String foodId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "price_set", nullable = false)
    private String priceSet;

    @Column(name = "image_set")
    private String imageSet;

}
