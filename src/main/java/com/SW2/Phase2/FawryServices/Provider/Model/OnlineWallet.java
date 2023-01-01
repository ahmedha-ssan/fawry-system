package com.SW2.Phase2.FawryServices.Provider.Model;

public class OnlineWallet {
    private String email;
    private String UserName;
    private int password;
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

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.UserName = userName;
    }

    public String getUserName() {
        return UserName;
    }
}
