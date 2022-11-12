package com.ags.wordmemorizing.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class WordPackage {

    @Id
    public String id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer rank;

    @Column(nullable = false)
    public Date updatedDate;

    @Column(nullable = false)
    public Date createdDate;
}
