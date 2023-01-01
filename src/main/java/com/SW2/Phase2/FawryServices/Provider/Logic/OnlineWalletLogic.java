package com.SW2.Phase2.FawryServices.Provider.Logic;

import com.SW2.Phase2.FawryServices.Provider.Model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class OnlineWalletLogic implements Payment{
    private final List<OnlineWallet> onlineWalletList;
    public OnlineWalletLogic(){
         onlineWalletList= new ArrayList<>();
    }
//onlineWalletDB.getEmail() == onlineWallet.getEmail() || onlineWalletDB.getUserName() == onlineWallet.getUserName()
    public String  pay(OnlineWallet onlineWallet) {
        for (OnlineWallet onlineWalletDB : onlineWalletList) {
            if (onlineWalletDB.getId()==onlineWallet.getId())
                return "That user is already exist on the system...";
        }
        onlineWalletList.add(onlineWallet);
        return "Added Successfully (OnlineWallet) costs :"+ onlineWallet.getPayTotal();
    }
    public OnlineWallet getInfo(int id) {
        for (OnlineWallet onlineWalletDB:onlineWalletList) {
            if(onlineWalletDB.getId()==id){
                return onlineWalletDB;
            }
        }
        return null;
    }

    @Override
    public String PayFee() {
        return "42";
    }

}
