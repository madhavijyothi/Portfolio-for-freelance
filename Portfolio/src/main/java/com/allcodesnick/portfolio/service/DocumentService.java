package com.allcodesnick.portfolio.service;

import com.allcodesnick.portfolio.model.Document;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface DocumentService {

    Document saveFile(MultipartFile file) throws IOException;

    Document getFile(long id);

    void deleteDocument(long id);
}
