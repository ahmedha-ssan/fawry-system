package com.SW2.Phase2.FawryServices.Provider.Logic;

import com.SW2.Phase2.FawryServices.Provider.Model.Donation;
import com.SW2.Phase2.FawryServices.Provider.Model.InternetPayment;
import com.SW2.Phase2.FawryServices.Provider.Model.ServicesProvider;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class InternetPaymentEtisalatLogic implements ServicesProvider{
    private static List<InternetPayment> internetPaymentList;

    public InternetPaymentEtisalatLogic(){
        this.internetPaymentList = new ArrayList<>();
    }
    public String AddServices(InternetPayment internetPayment) {
        for (InternetPayment InternetPaymentDb:internetPaymentList) {
            if(InternetPaymentDb.getId()==internetPayment.getId())
                return "Its Internet Payment Etisalat Services is payed Successfully before";
        }
        internetPaymentList.add(internetPayment);
        return "Internet Payment Etisalat Services payed Successfully...";
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
        return 24;
    }
}
