package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ProductDescription
 */
@Entity
@Table(
    name = "products_descriptions"
)
public class ProductDescription {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(
        name = "id"
    )
    private long productDescriptionId;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "description")
    private Description description;
    
}