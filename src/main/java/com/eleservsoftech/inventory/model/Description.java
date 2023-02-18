package com.eleservsoftech.inventory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.security.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "description")
public class Description {
    @Id
    private Long description_id;
    private String name;
    private Timestamp created_at;
    private  Timestamp modified_at;
    private String created_by;

    private String last_modified_by;
    private Boolean isdelete;
}
