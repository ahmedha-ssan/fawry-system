package com.SW2.Phase2.FawryServices.Provider.Model;

public class LandLine extends Services{
    private String ServicesName ;
    private double Payment;
    private int id;

    @Override
    public double getPayment() {
        return Payment;
    }

    @Override
    public void setPayment(double payment) {
        Payment = payment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getServicesName() {
        return ServicesName;
    }

    @Override
    public void setServicesName(String servicesName) {
        ServicesName = servicesName;
    }


}
