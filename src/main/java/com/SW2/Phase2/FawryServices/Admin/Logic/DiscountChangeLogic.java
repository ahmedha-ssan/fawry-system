package com.SW2.Phase2.FawryServices.Admin.Logic;

import com.SW2.Phase2.FawryServices.Admin.Model.Admin;
import com.SW2.Phase2.FawryServices.User.model.Userr;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class DiscountChangeLogic  implements Admin {
    Userr U;
    private static ArrayList<Userr> Users;
    public DiscountChangeLogic() {
        Users = new ArrayList<>();
    }
    public String RegisterUser(Userr A) {
        for (Userr userDB:Users) {
            if (userDB.getId() == A.getId()) {
                return "User is already register before...";
            }
        }
        Users.add(A);
        return "User added successfully... ";
    }

    public String RemoveUser(Userr A) {
        for (Userr userDB:Users) {
            if (userDB.getId() == A.getId()) {
                Users.remove(A);
                return "User Removed successfully... ";
            }
        }
        return  "User info is already not exist in DB";
    }

    public String Notify(Userr A) {
        for (Userr userDB:Users) {
            if(userDB.getId() != A.getId()){
                return "User is not exist...";
            }
            else if (userDB.getId() == A.getId()){
                return "User notify successfully for the last discount add to the system...";
            }
        }
        return null;
    }
    public Userr getUsers(int id){
        for (Userr userDB:Users) {
            if(userDB.getId()==id){
                return userDB;
            }
        }
        return null;
    }
}
