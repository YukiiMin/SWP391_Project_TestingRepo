package com.swp_group03.vaccination.vaccination_schedule_children_tracking_project.service;

import com.swp_group03.vaccination.vaccination_schedule_children_tracking_project.entity.Account;
import com.swp_group03.vaccination.vaccination_schedule_children_tracking_project.mapper.AccountMapper;
import com.swp_group03.vaccination.vaccination_schedule_children_tracking_project.model.AccRequest;
import com.swp_group03.vaccination.vaccination_schedule_children_tracking_project.repository.AccRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private AccRepo accRepo;
    @Autowired
    @Qualifier("accountMapper")
    private AccountMapper accMapper;

    public Account createAccount(AccRequest request){

        Account acc = accMapper.toAccount(request);
//        account.setUsername(request.getUsername());
//        account.setPassword(request.getPassword());
//        account.setFirst_Name(request.getFirst_Name());
//        account.setLast_Name(request.getLast_Name());
//        account.setEmail(request.getEmail());
//        account.setPhone_number(request.getPhone_number());
//        account.setAddress(request.getAddress());
//        account.setGender(request.getGender());
//        account.setUrl_image(request.getUrl_image());
//        account.setStatus(true);
        return accRepo.save(acc);
    }

}
