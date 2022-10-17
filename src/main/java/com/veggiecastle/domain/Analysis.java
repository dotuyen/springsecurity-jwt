package com.veggiecastle.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "analysis")
public class Analysis extends BaseDomain {

    @Column(name = "branch_id")
    private String branchId;

    @Column(name = "year")
    private Integer year;

    @Column(name = "month")
    private Integer month;

    @Column(name = "day")
    private Integer day;

    @Column(name = "total_order")
    private Integer totalOrder;

    @Column(name = "total_money_received", precision = 18)
    private BigDecimal totalMoneyReceived;

}
