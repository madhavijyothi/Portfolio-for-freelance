package com.allcodesnick.portfolio.service;

import com.allcodesnick.portfolio.model.OrderStatus;

public interface OrderStatusService {

    OrderStatus saveOrderStatus(OrderStatus orderStatus);

    OrderStatus getOrderStatusById(long id);

    OrderStatus updateOrderStatus(OrderStatus orderStatus, long id);

    void deleteOrderStatus(long id);
}
