package com.SW2.Phase2.FawryServices.User.Logic;

import com.SW2.Phase2.FawryServices.User.model.Userr;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service

public class RefundDisplayLogic {
    private static List<Userr> userList;
    public RefundDisplayLogic(){
        this.userList= new ArrayList<>();
    }

    public String UpDate(Userr user) {
            if (user.getEmail() == null) {
                return (user.getEmail() + " No Refunds added");
            } else{
                userList.add(user);
                return (user.getEmail()+ " update refund ");
            }

    }

    public String Display(Userr user) {
        return "Display the Refund...";
    }

}
