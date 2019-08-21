package com.app.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

/**
 * ImportInvoice
 */
@Entity
@Table(
    name = "import_invoices"
)
@Data
public class ImportInvoice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(
        name = "id"
    )
    private long importInvoiceId;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private int importQuantity;

    private long importPrice;

    @Temporal(TemporalType.TIMESTAMP)
    private Date importTime;
    
}