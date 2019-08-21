package com.app.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import lombok.Data;

/**
 * User
 */
@Entity
@Table(
    name = "users",
    uniqueConstraints = @UniqueConstraint(
        columnNames = {"email", "phoneNumber"}
    )
)
@Data
public class User {

    @Id
    private String username;

    @Column(
        columnDefinition = "nvarchar(50)"
    )
    private String firstname;

    @Column(
        columnDefinition = "nvarchar(50)"
    )
    private String lastname;

    @Temporal(TemporalType.DATE)
    private Date birthday;

    private boolean gender;

    @Column(
        length = 16
    )
    private String password;

    private String email;

    @Column(
        length = 13
    )
    private String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "avartar_id")
    private Image avartar;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;
    
}