package com.SW2.Phase2.FawryServices.Provider.Logic;

import com.SW2.Phase2.FawryServices.Provider.Model.InternetPayment;
import com.SW2.Phase2.FawryServices.Provider.Model.ServicesProvider;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class InternetPaymentOrangeLogic implements ServicesProvider{
    private static List<InternetPayment> internetPaymentList;

    public InternetPaymentOrangeLogic(){
        this.internetPaymentList = new ArrayList<>();
    }
    public String AddServices(InternetPayment internetPayment) {
        for (InternetPayment InternetPaymentDb:internetPaymentList) {
            if(InternetPaymentDb.getId()==internetPayment.getId())
                return "Its Internet Payment Orange Services is payed Successfully before";
            else
                return "This Service in not exist ...";
        }
        internetPaymentList.add(internetPayment);
        return "Internet Payment Orange Services payed Successfully...";
    }
    public InternetPayment getServices(int id){
        for (InternetPayment InternetPaymentDB:internetPaymentList) {
            if(InternetPaymentDB.getId()==id){
                return InternetPaymentDB;
            }
        }
        return null;
    }

    public double PayBill() {
        return 28;
    }
}
