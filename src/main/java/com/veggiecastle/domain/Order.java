package com.veggiecastle.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "orders")
public class Order extends BaseDomain {
    @Column(name = "branch_id")
    private String branchId;

    @Column(name = "cust_id")
    private String custId;

    @Column(name = "status")
    private String status;

    @Column(name = "type")
    private String type;

}
