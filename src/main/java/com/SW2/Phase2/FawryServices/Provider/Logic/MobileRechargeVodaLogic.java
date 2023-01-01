package com.SW2.Phase2.FawryServices.Provider.Logic;

import com.SW2.Phase2.FawryServices.Provider.Model.MobileRecharge;
import com.SW2.Phase2.FawryServices.Provider.Model.ServicesProvider;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class MobileRechargeVodaLogic implements ServicesProvider {
    private static List<MobileRecharge> mobileRechargeList;

    public MobileRechargeVodaLogic(){
        this.mobileRechargeList = new ArrayList<>();
    }

    public String AddServices(MobileRecharge mobileRecharge) {
        for (MobileRecharge mobileRechargeDB:mobileRechargeList) {
            if(mobileRechargeDB.getServicesName()==mobileRecharge.getServicesName())
                return "Its Mobile Recharge Voda Services is payed Successfully before";
        }
        mobileRechargeList.add(mobileRecharge);
        return "Mobile Recharge Voda Services payed Successfully...";
    }
    public MobileRecharge getServices(int id){
        for (MobileRecharge MobileRechargeDB:mobileRechargeList) {
            if(MobileRechargeDB.getId()==id){
                return MobileRechargeDB;
            }
        }
        return null;
    }

    public double PayBill() {
        return 80;
    }

}

