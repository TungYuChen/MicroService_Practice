package com.microservicepractice.order.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItemsData {
    private long id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}
