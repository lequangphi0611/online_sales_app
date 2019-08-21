package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Image
 */
@Entity
@Table(name = "images")
@Data
@NoArgsConstructor
public class Image {

    @Id
    @Column(name = "id")
    private long imageId;

    @Lob
    private byte[] data;
    
}