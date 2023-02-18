package com.eleservsoftech.inventory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name="vendor")
public class Vendor {
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name="vendor_Code")S
    @Id
     private Long Vendor_id;
    private String vendor_Code;
    private String Name;
//    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp created_at;
    private Timestamp modified_at;
//@Temporal(TemporalType.TIMESTAMP)
//Date modified_at;
    private String created_by;
    private String Last_Modified_by;
    private Boolean isdelete;


}

