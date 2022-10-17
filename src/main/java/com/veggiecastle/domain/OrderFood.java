package com.veggiecastle.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "order_food")
public class OrderFood extends BaseDomain {
    @Column(name = "order_id", nullable = false)
    private String orderId;

    @Column(name = "set_id")
    private String setId;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "address_receive", length = 1000)
    private String addressReceive;

    @Column(name = "note", length = 1000)
    private String note;

    @Column(name = "payment_type")
    private String paymentType;

}
