package com.SW2.Phase2.FawryServices.Payment.model;

public abstract class Discount {
    private String description ;
    private String amount;

    public Discount() {}
    public Discount(String description ,String amount) {
        this.description =description;
        this.amount =amount;
    }
    public void setDescription(String description) {
        this.description =description;
    }
    public String getDescription() {
        return "Here is all discounts available : ";
    }
    public void setAmount(String amount) {
        this.amount =amount;
    }
    public String getAmount() {
        return amount;
    }


    public double getDiscount() {
        return 33;
    }
    public abstract double AddDiscount();

}
