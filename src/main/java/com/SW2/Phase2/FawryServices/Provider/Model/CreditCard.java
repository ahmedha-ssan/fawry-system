package com.SW2.Phase2.FawryServices.Provider.Model;

public class CreditCard{
    private String userName;
    private double payTotal;
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public void setPayTotal(double payTotal) {
        this.payTotal = payTotal;
    }

    public double getPayTotal() {
        return payTotal;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }


}
