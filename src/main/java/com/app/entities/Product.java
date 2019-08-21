package com.app.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

/**
 * Product
 */
@Entity
@Table(
    name = "products"
)
@Data
public class Product {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long productId;

    @Column(
        columnDefinition = "nvarchar(255)",
        name = "name"
    )
    private String productName;

    private int remainingQuantity;

    private long currentPrice;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;
    
    @ManyToOne
    @JoinColumn( name = "seller_username" )
    private User seller;

    @ManyToOne
    @JoinColumn( name = "category_id" )
    private Category category;

    @OneToMany(mappedBy = "product")
    private Collection<ProductImage> productImages;

    @OneToOne
    @JoinColumn(name = "sale_id", referencedColumnName = "id")
    private Sale sale;

    @OneToMany( mappedBy = "product" )
    private Collection<ProductDescription> productDescriptions;

    @OneToMany(mappedBy = "product")
    private Collection<Review> reviews;

    @OneToMany(mappedBy = "product")
    private Collection<ImportInvoice> importInvoices;

}