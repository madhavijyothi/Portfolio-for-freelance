package com.allcodesnick.portfolio.repository;

import com.allcodesnick.portfolio.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentsRepository extends JpaRepository<Document, Long> {
}
