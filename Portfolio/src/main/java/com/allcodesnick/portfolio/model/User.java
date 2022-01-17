package com.allcodesnick.portfolio.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(uniqueConstraints={
        @UniqueConstraint(columnNames = {"username", "password"})
})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.ORDINAL)
    private Roles roles;

    private boolean isEnabled;

    private boolean isAccountNonExpired;

    private boolean isAccountNonLocked;

    private boolean isCredentialsNonExpired;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Client client;

    public User(){
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.roles = Roles.USER;
        this.isEnabled = true;
        this.isAccountNonExpired = true;
        this.isAccountNonLocked = true;
        this.isCredentialsNonExpired = true;
    }

}
