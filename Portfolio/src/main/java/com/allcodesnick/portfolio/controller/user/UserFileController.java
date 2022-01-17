package com.allcodesnick.portfolio.controller.user;

import com.allcodesnick.portfolio.model.Document;
import com.allcodesnick.portfolio.service.DocumentService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/user/file")
public class UserFileController {

    private DocumentService documentService;

    public UserFileController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @PostMapping("/upload-file")
    public Document saveDocument(MultipartFile file) throws IOException {
        return documentService.saveFile(file);
    }

    @DeleteMapping("/delete/{documentId}")
    public void deleteDocument(@PathVariable long documentId){
        documentService.deleteDocument(documentId);
    }

}
