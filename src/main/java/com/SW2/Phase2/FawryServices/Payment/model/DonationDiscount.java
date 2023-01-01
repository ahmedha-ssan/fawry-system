package com.SW2.Phase2.FawryServices.Payment.model;

public class DonationDiscount extends Discount{
    private String description ;
    private double amount;
    public DonationDiscount(String des) {
        description=des;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    public double AddDiscount() {
        return 1.3;
    }
}
