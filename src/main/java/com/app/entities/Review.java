package com.app.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.app.model.Rating;

import lombok.Data;

/**
 * Review
 */
@Entity
@Table(
    name = "review"
)
@Data
public class Review {

    @Id
    @GeneratedValue(
        strategy = GenerationType.AUTO
    )
    @Column(
        name = "id"
    )
    private long reviewId;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private User customer;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime;

    @Enumerated(EnumType.ORDINAL)
    private Rating rating;

    @OneToOne
    @JoinColumn(name = "comment_id")
    private Comment comment;
    
}