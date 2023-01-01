package com.SW2.Phase2.FawryServices.Admin.Model;

public class Refund {
    public String ServiceName;
    public double Amount;
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
        Amount = amount;
    }

    public double getAmount() {
        return Amount;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public void setServiceName(String serviceName) {
        ServiceName = serviceName;
    }
}
