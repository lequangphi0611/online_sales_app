package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

/**
 * Address
 */
@Entity
@Data
public class Address {

    @Id
    @Column(
        name = "id"
    )
    private long addressId;

    @Column(
        columnDefinition = "nvarchar(255)",
        nullable = false,
        unique = true
    )
    private String detailedAddress;

    @ManyToOne
    @JoinColumn( name = "district_id" )
    private District district;
    
}