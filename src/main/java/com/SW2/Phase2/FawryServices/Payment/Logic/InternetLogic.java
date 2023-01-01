package com.SW2.Phase2.FawryServices.Payment.Logic;

import com.SW2.Phase2.FawryServices.Payment.model.InternetDiscount;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class InternetLogic {

    private final List<InternetDiscount> InternetDiscountlist  ;

    public InternetLogic(){
        this.InternetDiscountlist=new ArrayList<>();
    }

    public String AddDiscount(InternetDiscount internetDiscount) {
        InternetDiscountlist.add(internetDiscount );
        return "Internet Discount added successfully it costs :0.66";
    }
    public InternetDiscount getDiscount(String Name){
        for (InternetDiscount InternetDiscountDb:InternetDiscountlist) {
            if(InternetDiscountDb.getDescription()==Name){
                return InternetDiscountDb;
            }
        }
        return null;
    }

}

