package com.SW2.Phase2.FawryServices.Payment.model;

public abstract class Discount {
    private String description ;
    private double amount;

    public Discount() {}
    public Discount(String description ,double amount) {
        this.description =description;
        this.amount =amount;
    }
    public void setDescription(String description) {
        this.description =description;
    }
    public String getDescription() {
        description="Here is all discounts available : ";
        return description;
    }
    public void setAmount(double amount) {
        this.amount =amount;
    }
    public double getAmount() {
        return amount;
    }
    public double getDiscount() {
        return 33;
    }
    public abstract double AddDiscount();

}
