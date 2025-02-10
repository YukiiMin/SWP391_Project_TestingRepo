package com.swp_group03.vaccination.vaccination_schedule_children_tracking_project.entity;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Admin extends Account{
    private String admin_name;
    private int phone_number;

    public Admin(String admin_name, int phone_number) {
        this.admin_name = admin_name;
        this.phone_number = phone_number;
    }


}
