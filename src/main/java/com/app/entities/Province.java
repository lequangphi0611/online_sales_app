package com.app.entities;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

/**
 * Province
 */
@Entity
@Table(
    name = "provinces"
)
@Data
public class Province {

    @Id
    @Column(
        name = "id"
    )
    private String provinceId;

    @Column(
        columnDefinition = "nvarchar(50)",
        unique = true,
        nullable = false
    )
    private String provinceName;

    @OneToMany(
        mappedBy = "province"
    )
    private Collection<District> districts;
    
}