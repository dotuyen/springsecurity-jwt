package com.veggiecastle.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.Instant;

@Data
@Entity
@Table(name = "order_seat")
public class OrderSeat extends BaseDomain {
    @Column(name = "order_id", nullable = false)
    private String orderId;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "branch_id")
    private String branchId;

    @Column(name = "time_order", nullable = false)
    private Instant timeOrder;

    @Column(name = "note", length = 1000)
    private String note;

    @Column(name = "price", precision = 18)
    private BigDecimal price;

    @Column(name = "payment_type")
    private String paymentType;

}
