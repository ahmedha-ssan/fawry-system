package com.SW2.Phase2.FawryServices.Admin.Model;

public class Refund {
    public String serviceName;
    public double amount;
    public int count;

    public void setCount(int count) {
        count=0;
        this.count = count;
    }

    public int getCount() {
        count++;
        return count;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceName() {
        return serviceName;
    }

   }
