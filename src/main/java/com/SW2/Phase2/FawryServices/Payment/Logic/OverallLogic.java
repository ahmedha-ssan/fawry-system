package com.SW2.Phase2.FawryServices.Payment.Logic;

import com.SW2.Phase2.FawryServices.Payment.model.Decorator;
import com.SW2.Phase2.FawryServices.Payment.model.Discount;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class OverallLogic extends Decorator{
    private final List<Discount> discountList  ;
    public OverallLogic(){
        this.discountList=new ArrayList<>();
    }

    @Override
    public double AddDiscount() {
        return 0;
    }
    @Override
    public double AddDiscount(Discount discount) {
        discountList.add(discount );
        return 0.90+discount.AddDiscount();
    }
    @Override
    public String getDescription(String name) {
        return discount.getDescription()+" + Overall ";
    }


}
