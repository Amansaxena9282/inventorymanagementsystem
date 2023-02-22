package com.eleservsoftech.inventory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.*;
import java.security.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@EnableJpaRepositories
@Entity
//@DynamicInsert
//@DynamicUpdate

public class Planning {
    @Id
    private int planning_id;
    private String crm;
    private String doctor_name;
    private String patient_name;
    private String case_id;
    private String planning_type;
    private String base_segment;
    private String planned;
    private String ipr_sheet;
    private String treat_report;
    private String upload_digiplan;
    private String plan_review;
    private String decesion;
    private String remark;
    private String from_type;
    private String to_type;
    private Timestamp date;
    private String planned_no;
    private String upper_aligner_from;
    private String upper_aligner_to;
    private String lower_aligner_from;
    private String lower_aligner_to;
    private Timestamp created_At;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "fk_planning_id")
    private Planning planning;

}
