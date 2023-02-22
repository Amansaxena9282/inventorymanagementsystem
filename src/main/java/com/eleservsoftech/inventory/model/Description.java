package com.eleservsoftech.inventory.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.persistence.*;
import java.io.Serializable;
import java.security.Timestamp;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DynamicInsert
@DynamicUpdate
public class Description {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long description_id;
    private String name;
//    private Timestamp created_at;
    @Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
    private LocalDate created_at;
//    private  Timestamp modified_at;
@Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
private LocalDate modified_at;
    private String created_by;
    private String last_modified_by;
    private Boolean isdelete;
}
