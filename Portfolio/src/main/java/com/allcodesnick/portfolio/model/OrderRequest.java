package com.allcodesnick.portfolio.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Set;

@Data
@Entity
public class OrderRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Product product;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dateRequested;

    private java.sql.Date requestedCompletionDate;

    @Column(length = 400)
    private String projectDescription;

    @OneToOne
    private Client client;

    @OneToMany(mappedBy = "orderRequest")
    private Set<Document> documents;

    @OneToOne(mappedBy = "orderRequest")
    private OrderStatus orderStatus;
}
