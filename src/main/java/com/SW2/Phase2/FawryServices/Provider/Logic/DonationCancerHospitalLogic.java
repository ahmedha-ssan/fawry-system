package com.SW2.Phase2.FawryServices.Provider.Logic;

import com.SW2.Phase2.FawryServices.Provider.Model.CreditCard;
import com.SW2.Phase2.FawryServices.Provider.Model.Donation;
import com.SW2.Phase2.FawryServices.Provider.Model.ServicesProvider;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class DonationCancerHospitalLogic implements ServicesProvider{
    private static List<Donation> donationList;

    public DonationCancerHospitalLogic(){
        this.donationList = new ArrayList<>();
    }
    public String AddServices(Donation donation) {
        for (Donation DonationDB:donationList) {
            if(DonationDB.getId()==donation.getId())
                return "Donation Cancer HospitalLogic Services is payed Successfully before";
        }
        donationList.add(donation);
        return "Donation Cancer Services payed Successfully...";
    }

    public Donation getServices(int id){
        for (Donation DonationDB:donationList) {
            if(DonationDB.getId()==id){
                return DonationDB;
            }
        }
        return null;
    }
    public double PayBill() {
        return 500;
    }
}
