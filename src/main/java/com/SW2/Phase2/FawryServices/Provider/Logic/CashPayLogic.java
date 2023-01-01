package com.SW2.Phase2.FawryServices.Provider.Logic;

import com.SW2.Phase2.FawryServices.Provider.Model.CashPay;
import com.SW2.Phase2.FawryServices.Provider.Model.OnlineWallet;
import com.SW2.Phase2.FawryServices.Provider.Model.Payment;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CashPayLogic implements Payment {
    private static List<CashPay> cashPayList ;
    public CashPayLogic(){
        cashPayList= new ArrayList<>();
    }

    public String  pay(CashPay cashPay) {
        for (CashPay cashPayDB:cashPayList) {
            if (cashPayDB.getId()==cashPay.getId())
                return "That user is already exist on the system...";
        }
        cashPayList.add(cashPay);
        return "Added Successfully (CashPay) Costs "+cashPay.getPayTotal();
    }

    public CashPay getInfo(int id) {
        for (CashPay cashPayDB:cashPayList) {
            if(cashPayDB.getId()==id){
                return cashPayDB;
            }
        }
        return null;
    }

    @Override
    public String PayFee() {
        return "2";
    }

}
