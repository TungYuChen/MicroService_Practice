package com.microservicepractice.order.controller;

import com.microservicepractice.order.model.OrderRequest;
import com.microservicepractice.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest) {
        System.out.println(orderRequest.getOrderLineItemsDataList());
        orderService.placeOrder(orderRequest);
        return "Order Placed Successfully";
    }
}
