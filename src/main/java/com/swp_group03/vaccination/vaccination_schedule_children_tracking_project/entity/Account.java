package com.swp_group03.vaccination.vaccination_schedule_children_tracking_project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Account")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private int Account_ID;

    @Column(name = "username", length = 30,unique=true)
    private String Username;

    @Column(name = "password", length = 50)
    private String Password;

    @Column(name = "firstName", length = 100)
    private String First_Name;

    @Column(name = "lastName", length = 100)
    private String Last_Name;

    @Column(name = "email", length = 50)
    private String Email;

    @Column(name = "phoneNumber", length = 10)
    private int Phone_number;

    @Column(name = "address", length = 100)
    private String Address;

    @Column(name = "gender", length = 6)
    private String Gender;

    @Column(name = "status")
    private boolean Status;

    @Column(name = "URL_image")
    private String url_image;

}
