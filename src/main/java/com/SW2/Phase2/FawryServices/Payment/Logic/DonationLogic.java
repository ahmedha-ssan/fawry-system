package com.SW2.Phase2.FawryServices.Payment.Logic;

import com.SW2.Phase2.FawryServices.Payment.model.DonationDiscount;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class DonationLogic {
    private final List<DonationDiscount> donationDiscountlist  ;

    public DonationLogic(){
        this.donationDiscountlist=new ArrayList<>();
    }

    public String AddDiscount(DonationDiscount donationDiscount) {
        donationDiscountlist.add(donationDiscount );
        return "Donation Discount added successfully it costs : "+donationDiscount.AddDiscount();
    }
    public DonationDiscount getDiscount(String Name){
        for (DonationDiscount DonationDiscountDB:donationDiscountlist) {
            if(DonationDiscountDB.getDescription()==Name){
                return DonationDiscountDB;
            }
        }
        return null;
    }

}
