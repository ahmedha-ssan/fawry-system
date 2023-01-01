package com.SW2.Phase2.FawryServices.Payment.Logic;


import com.SW2.Phase2.FawryServices.Payment.model.LandLineDiscount;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LandLineLogic{
    private final List<LandLineDiscount> landLineDiscountList  ;
    public LandLineLogic(){
        this.landLineDiscountList=new ArrayList<>();
    }

    public String AddDiscount(LandLineDiscount landLineDiscount) {
        landLineDiscountList.add(landLineDiscount );
        return "land Line Discount added successfully it costs : "+landLineDiscount.AddDiscount();
    }
    public LandLineDiscount getDiscount(String description){
        for (LandLineDiscount LandLineDiscountDB:landLineDiscountList) {
            if(LandLineDiscountDB.getDescription()==description){
                return LandLineDiscountDB;
            }
        }
        return null;
    }
}
