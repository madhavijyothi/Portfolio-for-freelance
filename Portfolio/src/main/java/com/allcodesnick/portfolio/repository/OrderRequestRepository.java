package com.allcodesnick.portfolio.repository;

import com.allcodesnick.portfolio.model.OrderRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRequestRepository extends JpaRepository<OrderRequest, Long> {

}
