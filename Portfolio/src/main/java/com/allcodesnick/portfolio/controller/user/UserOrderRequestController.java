package com.allcodesnick.portfolio.controller.user;

import com.allcodesnick.portfolio.model.OrderRequest;
import com.allcodesnick.portfolio.service.OrderRequestService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order-request")
public class UserOrderRequestController {

    private OrderRequestService orderRequestService;

    public UserOrderRequestController(OrderRequestService orderRequestService) {
        this.orderRequestService = orderRequestService;
    }

    @PostMapping("/create")
    public OrderRequest createOrderRequest(@RequestBody OrderRequest orderRequest) {
        return orderRequestService.saveOrderRequest(orderRequest);
    }

    @DeleteMapping("/delete/{orderRequestId}")
    public void deleteOrderRequest(@PathVariable long orderRequestId) {
        orderRequestService.deleteOrderRequest(orderRequestId);
    }

    @PutMapping("/update/{orderRequestId}")
    public OrderRequest updateOrderRequest(@RequestBody OrderRequest orderRequest, @PathVariable long orderRequestId) {
        return orderRequestService.updateOrderRequest(orderRequest, orderRequestId);
    }

    @GetMapping("/view/{orderRequestId}")
    public OrderRequest viewOrderRequest(@PathVariable long orderRequestId) {
        return orderRequestService.getOrderRequestByID(orderRequestId);
    }

}
