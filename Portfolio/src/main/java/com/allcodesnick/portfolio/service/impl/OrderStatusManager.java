package com.allcodesnick.portfolio.service.impl;

import com.allcodesnick.portfolio.exception.ResourceNotFoundException;
import com.allcodesnick.portfolio.model.OrderStatus;
import com.allcodesnick.portfolio.repository.OrderStatusRepository;
import com.allcodesnick.portfolio.service.OrderStatusService;
import org.springframework.stereotype.Service;

@Service
public class OrderStatusManager implements OrderStatusService {

    private OrderStatusRepository orderStatusRepository;

    public OrderStatusManager(OrderStatusRepository orderStatusRepository) {
        super();
        this.orderStatusRepository = orderStatusRepository;
    }

    @Override
    public OrderStatus saveOrderStatus(OrderStatus orderStatus){
        return orderStatusRepository.save(orderStatus);
    }

    @Override
    public OrderStatus getOrderStatusById(long id){
        return orderStatusRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Order Status","ID", id));
    }

    @Override
    public OrderStatus updateOrderStatus(OrderStatus orderStatus, long id){
        OrderStatus existingOrderStatus = orderStatusRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Order Status","ID", id));
        existingOrderStatus.setStatus(orderStatus.getStatus());
        return orderStatusRepository.save(existingOrderStatus);
    }

    @Override
    public void deleteOrderStatus(long id) {
        OrderStatus orderStatus = orderStatusRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Order Status","ID", id));
        orderStatusRepository.delete(orderStatus);
    }

}
