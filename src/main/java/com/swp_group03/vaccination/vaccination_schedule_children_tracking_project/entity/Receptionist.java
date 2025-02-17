package com.swp_group03.vaccination.vaccination_schedule_children_tracking_project.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Receptionist extends Authenticated_User{
    private String receptionist_id;
    private String receptionist_password;
    private String receptionist_name;
    private String receptionist_email;

}
