package com.SW2.Phase2.FawryServices.Provider.Model;

public class Services {

    private String servicesName ;
    private double payment;

    public void setServicesName(String servicesName) {
        this.servicesName = servicesName;
    }

    public String getServicesName() {
        return servicesName;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public double getPayment() {
        return payment;
    }
}
