package com.allcodesnick.portfolio.service.impl;

import com.allcodesnick.portfolio.exception.ResourceNotFoundException;
import com.allcodesnick.portfolio.model.OrderRequest;
import com.allcodesnick.portfolio.repository.OrderRequestRepository;
import com.allcodesnick.portfolio.service.OrderRequestService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrderRequestManager implements OrderRequestService {

    private OrderRequestRepository orderRequestRepository;

    public OrderRequestManager(OrderRequestRepository orderRequestRepository) {
        this.orderRequestRepository = orderRequestRepository;
    }

    @Override
    public OrderRequest saveOrderRequest(OrderRequest orderRequest) {
        return orderRequestRepository.save(orderRequest);
    }

    @Override
    public List<OrderRequest> listOrderRequest() {
        return orderRequestRepository.findAll();
    }

    @Override
    public OrderRequest getOrderRequestByID(long id) {
        return orderRequestRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Order Request","ID", id));
    }

    @Override
    public void deleteOrderRequest(long id) {
        OrderRequest orderRequest = orderRequestRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Order Request","ID", id));
        orderRequestRepository.delete(orderRequest);
    }

    @Override
    public OrderRequest updateOrderRequest(OrderRequest orderRequest, long id) {
        OrderRequest existingOrderRequest = orderRequestRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Order Request","ID", id));
        existingOrderRequest.setRequestedCompletionDate(orderRequest.getRequestedCompletionDate());
        existingOrderRequest.setProjectDescription(orderRequest.getProjectDescription());
        return orderRequestRepository.save(existingOrderRequest);
    }


}
