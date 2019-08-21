package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Description
 */
@Entity
@Table(
    name = "descriptions"
)
public class Description {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(
        name = "id"
    )
    private long descriptionId;
    
    @Column(
        columnDefinition = "nvarchar(max)",
        name = "content"
    )
    private String descriptionContent;

}