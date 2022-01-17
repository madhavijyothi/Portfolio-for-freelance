package com.allcodesnick.portfolio.controller.admin;

import com.allcodesnick.portfolio.model.OrderRequest;
import com.allcodesnick.portfolio.service.OrderRequestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/order-request")
public class AdminOrderRequestController {

    private OrderRequestService orderRequestService;

    public AdminOrderRequestController(OrderRequestService orderRequestService) {
        this.orderRequestService = orderRequestService;
    }

    @GetMapping("/list-all")
    public List<OrderRequest> listOrderRequests(){
        return orderRequestService.listOrderRequest();
    }

    @DeleteMapping("/delete/{orderRequestId}")
    public void deleteOrderRequest(@PathVariable long orderRequestId){
        orderRequestService.deleteOrderRequest(orderRequestId);
    }

    @PutMapping("/update/{orderRequestId}")
    public OrderRequest updateOrderRequest(@RequestBody OrderRequest orderRequest, @PathVariable long orderRequestId){
        return orderRequestService.updateOrderRequest(orderRequest, orderRequestId);
    }

    @GetMapping("/view/{orderRequestId}")
    public OrderRequest viewOrderRequest(@PathVariable long orderRequestId) {
        return orderRequestService.getOrderRequestByID(orderRequestId);
    }

}
