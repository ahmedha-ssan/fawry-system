package com.SW2.Phase2.FawryServices.User.Logic;

import com.SW2.Phase2.FawryServices.User.model.Account;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AccountLogic {
    private static List<Account> AccountList;
    Account account=new Account();
    public AccountLogic() {
        AccountList = new ArrayList<>();
    }

    public String SignIn(String email,String password) {
        if (email.equals("ahmed@gmail") && password.equals("123")) {
            AccountList.add(account);
            return "Successful Sign in Ahmed !";
        }
        else if (email.equals("Saad@gmail") && password.equals("321")) {
            AccountList.add(account);
            return "Successful Sign in Saad !";
        }
        return "Error Sign in";
    }

    public String SignUp(String userName,String email,String password) {
        if ( userName.equals("Ahmed") ||userName.equals("Saad") ||
                email.equals("ahmed@gmail") ||email.equals("Saad@gmail")) {
            return "User or email is already registered before ";
        } else {
            return "Here is your information " + userName + " " +email +" "+password+ " Successful Sign up ";
        }
    }

    public String Check(String email, String password) {
            if (email.equals("ahmed@gmail") && password.equals("123")) {
                return "Ahmed email email is exist ";
            } else if (email.equals("Saad@gmail") && password.equals("321")) {
                return "Saad email email is exist ";
            } else if (email == null || password == null) {
                return "Enter a correct email or Password : ";
            } else {
                return "That email or Password is not registered : ";
            }
        }
    }