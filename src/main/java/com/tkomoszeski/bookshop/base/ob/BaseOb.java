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
@NoArgsConstructor
public abstract class BaseOb implements Serializable{

    private static final long serialVersionUID = -6442818871656762337L;

	@Id
    @Column(name = "ID")
    @SequenceGenerator(name = "my_entity_gen", sequenceName = "my_entity_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_entity_gen")
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