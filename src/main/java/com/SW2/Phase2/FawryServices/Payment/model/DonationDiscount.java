package com.SW2.Phase2.FawryServices.Payment.model;

public class DonationDiscount extends Discount{
    private String description ;
    private String amount;
    public DonationDiscount(String des) {
        description=des;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmount() {
        return amount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    public double AddDiscount() {
        return 0.72;
    }


}