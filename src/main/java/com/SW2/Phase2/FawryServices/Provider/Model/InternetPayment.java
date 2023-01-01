package com.SW2.Phase2.FawryServices.Provider.Model;

public class InternetPayment extends Services{
    private String servicesName ;
    private double payment;
    private int id;

    @Override
    public double getPayment() {
        return payment;
    }

    @Override
    public void setPayment(double payment) {
        this.payment = payment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getServicesName() {
        return servicesName;
    }

    @Override
    public void setServicesName(String servicesName) {
        this.servicesName = servicesName;
    }

}
