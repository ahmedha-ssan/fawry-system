package com.SW2.Phase2.FawryServices.Provider.Model;

public class Services {

    private String ServicesName ;
    private double Payment;

    public void setServicesName(String servicesName) {
        ServicesName = servicesName;
    }

    public String getServicesName() {
        return ServicesName;
    }

    public void setPayment(double payment) {
        Payment = payment;
    }

    public double getPayment() {
        return Payment;
    }
}
