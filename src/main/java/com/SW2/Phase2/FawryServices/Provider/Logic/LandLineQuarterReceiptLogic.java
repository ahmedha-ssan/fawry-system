package com.SW2.Phase2.FawryServices.Provider.Logic;

import com.SW2.Phase2.FawryServices.Provider.Model.LandLine;
import com.SW2.Phase2.FawryServices.Provider.Model.ServicesProvider;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class LandLineQuarterReceiptLogic implements ServicesProvider{
    private static List<LandLine> landLineList;

    public LandLineQuarterReceiptLogic(){
        this.landLineList = new ArrayList<>();
    }
    public String AddServices(LandLine landLine) {
        for (LandLine LandLineDb:landLineList) {
            if(LandLineDb.getId()==landLine.getId())
                return "Its Land Line Quarter Receipt Services is payed Successfully before";
        }
        landLineList.add(landLine);
        return "Land Line Quarter Receipt Services payed Successfully...";
    }
    public LandLine getServices(int id){
        for (LandLine LandLineDb:landLineList) {
            if(LandLineDb.getId()==id){
                return LandLineDb;
            }
        }
        return null;
    }
    public double PayBill() {
        return 800;
    }
}
