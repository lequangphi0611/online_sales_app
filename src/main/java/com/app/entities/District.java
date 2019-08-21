package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

/**
 * District
 */
@Entity
@Table(
    name = "districts"
)
@Data
public class District {

    @Id
    @Column(
        name = "id"
    )
    private long districtId;

    @Column(
        columnDefinition = "nvarchar(50)",
        unique = true,
        nullable = false
    )
    private String districtName;

    @ManyToOne
    @JoinColumn(name = "province_id")
    private Province province;
    
}