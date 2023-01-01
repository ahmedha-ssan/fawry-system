package com.SW2.Phase2.FawryServices.Payment.Logic;

import com.SW2.Phase2.FawryServices.Payment.model.Discount;
import com.SW2.Phase2.FawryServices.Payment.model.LandLineDiscount;
import com.SW2.Phase2.FawryServices.Payment.model.MobileRechargeDiscount;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class MobileRechargeLogic{
    private final List<MobileRechargeDiscount> MobileRechargeDiscountlist;
    public MobileRechargeLogic(){
        this.MobileRechargeDiscountlist=new ArrayList<>();
    }

    public double AddDiscount(MobileRechargeDiscount mobileRechargeDiscount) {
        MobileRechargeDiscountlist.add(mobileRechargeDiscount );
        return 0.99;
    }
    public MobileRechargeDiscount getDiscount(String Name){
        for (MobileRechargeDiscount MobileRechargeDiscountDB:MobileRechargeDiscountlist) {
            if(MobileRechargeDiscountDB.getDescription()==Name){
                return MobileRechargeDiscountDB;
            }
        }
        return null;
    }

}
