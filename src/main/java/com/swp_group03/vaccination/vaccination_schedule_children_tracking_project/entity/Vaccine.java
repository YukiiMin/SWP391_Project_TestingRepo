package com.swp_group03.vaccination.vaccination_schedule_children_tracking_project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Vaccine {
    @Id
    private int vaccine_id;

    @Column(nullable = false)
    private String vaccine_name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String origin;

    @Column(nullable = false)
    private String usage_guide;

    @Column(nullable = false)
    private String contraindication;

    @Column(nullable = false)
    private String warnings;

    @Column(nullable = false)
    private String side_effect;

    @Column(nullable = false)
    private String storage_guide;

    @Column(nullable = false)
    private String target_audience;

    @Column
    private int quantity;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private Date expire_date;

    @Column
    private boolean status;




}
