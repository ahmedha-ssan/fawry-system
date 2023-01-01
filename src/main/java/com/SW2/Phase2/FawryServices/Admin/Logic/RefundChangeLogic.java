package com.SW2.Phase2.FawryServices.Admin.Logic;

import com.SW2.Phase2.FawryServices.Admin.Model.Admin;
import com.SW2.Phase2.FawryServices.User.model.Userr;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class RefundChangeLogic implements Admin {

    private static ArrayList<Userr> userrArrayList;
    Userr U;

    public RefundChangeLogic() {
        userrArrayList =new ArrayList<Userr>();
    }
    public String RegisterUser(Userr A) {
        for (Userr userDB:userrArrayList) {
            if (userDB.getId() == A.getId()) {
                return "User is already register before...";
            }
        }
        userrArrayList.add(A);
        return "User added successfully... ";
    }
    public String RemoveUser(Userr A) {
        for (Userr userDB:userrArrayList) {
            if (userDB.getId() == A.getId()) {
                userrArrayList.remove(A);
                return "User Removed successfully... ";
            }
        }
        return  "User info is already not exist in DB";
    }

    public String  Notify(Userr A) {
        for (Userr userDB:userrArrayList) {
            if(userDB.getId()!= A.getId()){
                return "User is not exist...";
            }
            else {
                return "User notify successfully for the last Refund add to the system...";
            }
        }
        return null;
    }

    public Userr getUsers(int id){
        for (Userr userDB:userrArrayList) {
            if(userDB.getId()==id){
                return userDB;
            }
        }
        return null;
    }
}
