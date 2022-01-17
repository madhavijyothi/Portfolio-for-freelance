package com.allcodesnick.portfolio.repository;

import com.allcodesnick.portfolio.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
