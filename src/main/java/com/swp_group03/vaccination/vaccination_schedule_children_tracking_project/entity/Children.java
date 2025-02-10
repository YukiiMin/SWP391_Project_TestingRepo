package com.swp_group03.vaccination.vaccination_schedule_children_tracking_project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Children {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private int Children_ID;

    @Column(name = "Name")
    private String Children_Name;

    @Column(name = "Date_Of_Birth")
    private Date dateOfBirth;

    @Column(name = "Gender")
    private String Children_Gender;

    @Column(name = "Address")
    private String Children_Address;

    @Column
    private double Height;
    @Column
    private double Weight;

    @ManyToOne
    @JoinColumn(name = "Account_ID")
    private Account Account_ID;

}
