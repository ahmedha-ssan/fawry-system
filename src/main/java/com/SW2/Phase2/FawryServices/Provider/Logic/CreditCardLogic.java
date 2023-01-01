package com.SW2.Phase2.FawryServices.Provider.Logic;

import com.SW2.Phase2.FawryServices.Provider.Model.CreditCard;
import com.SW2.Phase2.FawryServices.Provider.Model.OnlineWallet;
import com.SW2.Phase2.FawryServices.Provider.Model.Payment;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class CreditCardLogic implements Payment {
    private static List<CreditCard> creditCardList;
    public CreditCardLogic(){
        creditCardList = new ArrayList<>();
    }

    public String  pay(CreditCard creditCard) {
        for (CreditCard CreditCardDB:creditCardList) {
            if (CreditCardDB.getId() == creditCard.getId())
                return  "User info is already exist in DB";
        }
        creditCardList.add(creditCard);
        return "Added Successfully (creditCard) Costs :"+creditCard.getPayTotal();
    }
    public CreditCard getInfo(int id) {
        for (CreditCard creditCardDB : creditCardList) {
            if (creditCardDB.getId() == id) {
                return creditCardDB;
            }
        }
        return null;
    }
    public String PayFee() {
        return "32";
    }
}