package com.SW2.Phase2.FawryServices.Admin.Model;

import com.SW2.Phase2.FawryServices.Provider.Model.CashPay;

public class Transaction {
    public String UserName1;
    public String Amount1 ;

    public String UserName2;
    public String Amount2 ;

    int count=0;

    public void setCount(int count) {
        count++;
        this.count = count;
    }

    public int getCount() {
        count++;
        return count;
    }



    public void setUserName1(String userName1) {
        userName1="Judy";
        UserName1 = userName1;
    }

    public String getUserName1() {
        return UserName1;
    }

    public void setUserName2(String userName2) {
        userName2="Rana";
        UserName2 = userName2;
    }

    public String getUserName2() {
        return UserName2;
    }

    public void setAmount1(String amount1) {
        amount1="50";
        Amount1 = amount1;
    }

    public String getAmount1() {
        return Amount1;
    }

    public void setAmount2(String amount2) {
        amount2="66.5";
        Amount2 = amount2;
    }

    public String getAmount2() {
        return Amount2;
    }


}
