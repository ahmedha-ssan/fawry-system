package com.SW2.Phase2.FawryServices.Payment.Logic;

import com.SW2.Phase2.FawryServices.Payment.model.Decorator;
import com.SW2.Phase2.FawryServices.Payment.model.Discount;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class SpecificLogic extends Decorator{
    @Override
    public double AddDiscount() {
        return 0;
    }
    private final List<Discount> discountList;

    public SpecificLogic(){
        this.discountList=new ArrayList<>();
    }
    @Override
    public String getDescription(String name) {
        return discount.getDescription()+" + Specific discount";
    }
    @Override
    public double AddDiscount(Discount discount) {
        discountList.add(discount);
        return 0.70+discount.AddDiscount();
    }
}
