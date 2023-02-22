package com.eleservsoftech.inventory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.security.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@EnableJpaRepositories
//@Configuration
//@EnableTransactionManagement
@Entity
//@DynamicInsert
//@DynamicUpdate

public class Stagging {
    @Id
    private Long planning_id;
    private String staging;
    private String crm;
    private String planning_type;
    private String d_name;
    private String caseid;
    private String from_type;
    private String to_type;
    private String aln_upper;
    private String aln_lower;
    private String thick_upper;
    private String thick_lower;
    private String margin_upper;
    private String margin_lower;
    private String molor_upper;
    private String molor_lower;
    private String sheet_type;
    private String review_attach;
    private String ipr_sheet_;
    private String soft_tissus;
    private Timestamp date;
    private String patient_name;
    private String decesion;
    private String remark;
    private String upper_aligner_from;
    private String upper_aligner_to;
    private String lower_aligner_from;
    private String lower_aligner_to;
    private Timestamp created_At;

}
