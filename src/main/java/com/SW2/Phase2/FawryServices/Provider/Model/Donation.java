package com.SW2.Phase2.FawryServices.Provider.Model;

public class Donation extends Services{
    private String servicesName ;
    private double payment;
    private int id;

    @Override
    public void setPayment(double payment) {
        this.payment = payment;
    }
    @Override
    public double getPayment() {
        return payment;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public void setServicesName(String servicesName) {
        this.servicesName = servicesName;
    }
    @Override
    public String getServicesName() {
        return servicesName;
    }



}