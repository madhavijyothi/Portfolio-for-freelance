package com.allcodesnick.portfolio.controller.admin;

import com.allcodesnick.portfolio.model.OrderStatus;
import com.allcodesnick.portfolio.service.OrderStatusService;
import org.aspectj.weaver.ast.Or;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/order-status")
public class AdminOrderStatusController {

    private OrderStatusService orderStatusService;

    public AdminOrderStatusController(OrderStatusService orderStatusService) {
        this.orderStatusService = orderStatusService;
    }

    @PostMapping("/set-status")
    public OrderStatus setOrderStatus(OrderStatus orderStatus){
        return orderStatusService.saveOrderStatus(orderStatus);
    }

    @PutMapping("/update-status/{orderStatusId}")
    public OrderStatus updateOrderStatus(@RequestBody OrderStatus orderStatus,@PathVariable long orderStatusId){
        return orderStatusService.updateOrderStatus(orderStatus, orderStatusId);
    }

    @DeleteMapping("/delete/{orderStatusId}")
    public void deleteOrderStatus(@PathVariable long orderStatusId){
        orderStatusService.deleteOrderStatus(orderStatusId);
    }

}
