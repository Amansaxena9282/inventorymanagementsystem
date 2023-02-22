package com.eleservsoftech.inventory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
//@EnableJpaRepositories

@AllArgsConstructor
//@Entity
//@DynamicInsert
//@DynamicUpdate

public class Dispatched_scan {
    @Id
    private int  dispatched_id;
    private String case_id;
    private String doctor_name;
    private String patient_name;
    private String crm;
    private String Sr_no;
    private String item;
    private String dispatch;
    private String dispatch_no;
    private String tracking_id;
    private String delivery_nn;
    private String Type_of_dispatch;
    private String decesion;
    private String remark;
    private Timestamp date;
    private String no_of_aligners;
    private String mode_of_dispatch;
    private String address;
    private String phone;
    private String location;
    private String city;
    private String pincode;
    private String default_starterkit;
    private String default_address;
    private String confirm_status;
    private String upper_aligner_from;
    private String upper_aligner_to;
    private String lower_aligner_from;
    private String lower_aligner_to;
    private String upper_att;
    private String lower_att;
    private Timestamp created_At;


}
