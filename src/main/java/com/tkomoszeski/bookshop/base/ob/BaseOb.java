package com.tkomoszeski.bookshop.base.ob;

import java.io.Serializable;
import javax.persistence.*;
import lombok.*;
import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@MappedSuperclass
@SequenceGenerator(allocationSize = 1, name = "SEQ", sequenceName = "GEN_BASE_ID")
public abstract class BaseOb implements Serializable{

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator= "SEQ")
    private Long id;
    
    @Column(name = "TECHDATE",columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date techDate;

    @PrePersist
    @PreUpdate
    private void setCurrentDate(){
            techDate = new Date();
    }
}