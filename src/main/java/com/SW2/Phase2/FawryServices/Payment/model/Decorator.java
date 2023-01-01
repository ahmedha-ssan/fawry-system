package com.SW2.Phase2.FawryServices.Payment.model;

public abstract class Decorator extends Discount{
    public Discount discount;

    public abstract double AddDiscount(Discount discount);
    public abstract String getDescription(String des);
}

