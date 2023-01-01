package com.SW2.Phase2.FawryServices.Payment.model;

public class MobileRechargeDiscount extends Discount{
    private String description ;
    private String amount;
    public MobileRechargeDiscount(String des) {
        description=des;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmount() {
        return amount;
    }
    public double AddDiscount() {
        return 0.92;
    }

}
