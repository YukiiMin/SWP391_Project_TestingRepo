package com.swp_group03.vaccination.vaccination_schedule_children_tracking_project.entity;

import jakarta.persistence.*;
/*import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;*/
import org.hibernate.annotations.Nationalized;

@Entity
@Table(name = "Account")

public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String Account_ID;

    @Column(name = "username", length = 30,unique=true)
    private String Username;

    @Column(name = "password", length = 50)
    private String Password;

    @Column(name = "first_Name", length = 100)
    @Nationalized
    private String First_Name;

    @Column(name = "last_Name", length = 100)
    private String Last_Name;

    @Column(name = "email", length = 50)
    private String Email;

    @Column(name = "phoneNumber", length = 10)
    private int Phone_number;

    @Column(name = "address", length = 100)
    @Nationalized
    private String Address;

    @Column(name = "gender", length = 6)
    private String Gender;

    @Column(name = "status")
    private boolean Status;

    @Column(name = "URL_image")
    private String url_image;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Role_ID")
    private Account_Role role;

    public Account() {

    }

    public Account(String username, String password, String first_Name, String last_Name, String email, int phone_number, String address, String gender, boolean status, String url_image, Account_Role role) {
        Username = username;
        Password = password;
        First_Name = first_Name;
        Last_Name = last_Name;
        Email = email;
        Phone_number = phone_number;
        Address = address;
        Gender = gender;
        Status = status;
        this.url_image = url_image;
        this.role = role;
    }

    public String getAccount_ID() {
        return Account_ID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getPhone_number() {
        return Phone_number;
    }

    public void setPhone_number(int phone_number) {
        Phone_number = phone_number;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

    public String getUrl_image() {
        return url_image;
    }

    public void setUrl_image(String url_image) {
        this.url_image = url_image;
    }

    public Account_Role getRole() {
        return role;
    }

    public void setRole(Account_Role role) {
        this.role = role;
    }
}
