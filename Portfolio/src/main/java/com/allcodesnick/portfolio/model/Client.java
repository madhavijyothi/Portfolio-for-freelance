package com.allcodesnick.portfolio.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Set;


@Data
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String fullName;

    private String email;

    @Column(length = 10, nullable = false)
    private String phoneNumber;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar accountCreatedDate;

    @OneToOne(mappedBy = "client")
    private OrderRequest orderRequest;

    @OneToMany(mappedBy = "client")
    private Set<Message> messages;

    @OneToOne
    private User user;
}
