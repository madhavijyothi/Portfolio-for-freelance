package com.allcodesnick.portfolio.model;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String fileName;

    private String fileType;

    @Lob
    private byte[] data;

    @ManyToOne
    private OrderRequest orderRequest;

    public Document(String fileName, String fileType, byte[] data) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.data = data;
    }

    public Document() {

    }
}
