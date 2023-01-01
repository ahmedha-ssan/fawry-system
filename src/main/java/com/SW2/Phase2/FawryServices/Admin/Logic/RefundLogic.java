package com.SW2.Phase2.FawryServices.Admin.Logic;

import com.SW2.Phase2.FawryServices.Admin.Model.Refund;
import com.SW2.Phase2.FawryServices.User.model.Userr;
import org.springframework.stereotype.Service;

@Service
public class RefundLogic {
    Refund refund=new Refund();

     public String listRefund(String ServiceName) {
         if (ServiceName.equals("MobileRecharge")) {
             refund.setAmount(22);
             return ServiceName + " : add to our list .. its cost " + refund.getAmount() + " list in # " + refund.getCount();
         } else if (ServiceName.equals("InternetPayment")) {
             refund.setAmount(66.4);
             return refund.getServiceName() + " : add to our list .. its cost " + refund.getAmount() + " list in # " + refund.getCount();
         } else if (ServiceName.equals("LandLine")) {
             refund.setAmount(222.2);
             return refund.getServiceName() + " : add to our list .. its cost " + refund.getAmount() + " list in # " + refund.getCount();
         } else if (ServiceName.equals("Donation")) {
             refund.setAmount(5000);
             return refund.getServiceName() + " : add to our list .. its cost " + refund.getAmount() + " list in # " + refund.getCount();
         } else {
             return "Enter a correct Service name : ";
         }
     }

}
