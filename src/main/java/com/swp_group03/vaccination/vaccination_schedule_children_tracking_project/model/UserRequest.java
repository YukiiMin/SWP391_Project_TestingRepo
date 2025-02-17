package com.swp_group03.vaccination.vaccination_schedule_children_tracking_project.model;

import jakarta.persistence.Column;

public class UserRequest {

    private String Username;

    private String Password;


    private String First_Name;

    private String Last_Name;


    private String Email;


    private int Phone_number;

    private String Address;

    private String Gender;

    private boolean Status;

    private String url_image;

    public UserRequest() {
    }

    public UserRequest(String username, String password, String first_Name, String last_Name,
                       String email, int phone_number, String address, String gender, String url_image,
                       boolean status) {
        Username = username;
        Password = password;
        First_Name = first_Name;
        Last_Name = last_Name;
        Email = email;
        Phone_number = phone_number;
        Address = address;
        Gender = gender;
        this.url_image = url_image;
        Status = status;
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
}
