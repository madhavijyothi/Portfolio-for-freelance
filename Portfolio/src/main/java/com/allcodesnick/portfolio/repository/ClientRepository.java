package com.allcodesnick.portfolio.repository;

import com.allcodesnick.portfolio.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
