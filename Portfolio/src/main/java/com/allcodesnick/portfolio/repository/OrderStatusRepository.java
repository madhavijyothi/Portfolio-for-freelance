package com.allcodesnick.portfolio.repository;

import com.allcodesnick.portfolio.model.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderStatusRepository extends JpaRepository<OrderStatus, Long> {
}
