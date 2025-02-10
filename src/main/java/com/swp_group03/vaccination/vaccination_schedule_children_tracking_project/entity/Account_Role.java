package com.swp_group03.vaccination.vaccination_schedule_children_tracking_project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Account_Role {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private int Role_ID;
    @Column
    private String Role_Name;
    @OneToOne
    @JoinColumn(name = "Account_ID")
    private Account Account_ID;

}
