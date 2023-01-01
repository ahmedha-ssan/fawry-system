package com.SW2.Phase2.FawryServices.Provider.Model;

public class CashPay {

    private String UserName;
    private double PayTotal=300;
    private int id ;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setPayTotal(double payTotal) {
        this.PayTotal = payTotal;
    }

    public double getPayTotal() {
        return PayTotal;
    }

    public void setUserName(String userName) {
        this.UserName = userName;
    }

    public String getUserName() {
        return UserName;
    }
}
