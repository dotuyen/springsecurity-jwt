package com.veggiecastle.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "customer")
public class Customer extends BaseDomain {
    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "orders")
    private Integer orders;

    @Column(name = "booked_money", precision = 18)
    private BigDecimal bookedMoney;

    @Column(name = "type")
    private String type;

}
