package com.allcodesnick.portfolio.controller.admin;

import com.allcodesnick.portfolio.model.Document;
import com.allcodesnick.portfolio.service.DocumentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/file")
public class AdminFileController {

    private DocumentService documentService;

    public AdminFileController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @GetMapping("/view/{documentId}")
    public Document getFile(@PathVariable long documentId){
        return documentService.getFile(documentId);
    }
}
