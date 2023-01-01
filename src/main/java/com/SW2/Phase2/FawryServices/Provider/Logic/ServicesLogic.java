package com.SW2.Phase2.FawryServices.Provider.Logic;

import com.SW2.Phase2.FawryServices.Provider.Model.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Service
public class ServicesLogic {
    Donation donation =new Donation();
    LandLine landLine =new LandLine();
    MobileRecharge mobileRecharge =new MobileRecharge();
    InternetPayment internetPayment=new InternetPayment();
    CreditCard creditCard=new CreditCard();
    OnlineWallet onlineWallet=new OnlineWallet();
    CashPay cashPay=new CashPay();
    OnlineWalletLogic onlineWalletLogic=new OnlineWalletLogic();
    CashPayLogic cashPayLogic=new CashPayLogic();
    CreditCardLogic creditCardLogic =new CreditCardLogic();

    private static List<Services>servicesList = null;

    public ServicesLogic() {
        servicesList= new ArrayList<>();
    }

    public String getServices(Services services){
            if(services.getServicesName()==null){
                return null;
            }
            if(Objects.equals(services.getServicesName(), "MobileRecharge")){
                return mobileRecharge.getServicesName();
            }
            if(Objects.equals(services.getServicesName(), "InternetPayment")){
                return internetPayment.getServicesName();
            }
            if(Objects.equals(services.getServicesName(), "LandLine")){
                return landLine.getServicesName();
            }
            if(Objects.equals(services.getServicesName(), "Donation")){
                return donation.getServicesName();
            }
        return "Cannot find that Services in query";
    }


    public String Search(String name){
            if(Objects.equals(name, "MobileRecharge")){
                return mobileRecharge.getServicesName();
            }
            if(Objects.equals(name, "InternetPayment")){
                return  internetPayment.getServicesName();
            }
            if(Objects.equals(name, "LandLine")){
                return  landLine.getServicesName();
            }
            if(Objects.equals(name, "Donation")){
                return  donation.getServicesName();
            }
        return "Name is not exist";
    }

    public String AddProvider() {
        return  " Admin add provider successfully";
    }
    /////////////////////////////////////////

    public String info(String ServiceName, String PayMethod){
        for (Services ServicesDB:servicesList) {
            if(ServiceName=="LandLine"){
                if(PayMethod=="CreditCard"){
                    return creditCardLogic.pay(creditCard)+ creditCardLogic.getInfo(1)+ServicesDB.getServicesName();
                }
                if(PayMethod=="OnlineWallet"){
                    return onlineWalletLogic.pay(onlineWallet)+ onlineWalletLogic.getInfo(1)+ServicesDB.getServicesName();
                }
                if(PayMethod=="CashPay"){
                    return cashPayLogic.pay(cashPay)+ cashPayLogic.getInfo(1)+ServicesDB.getServicesName();
                }
            }

            if(ServiceName=="InternetPayment"){
                if(PayMethod=="CreditCard"){
                    return creditCardLogic.pay(creditCard)+ creditCardLogic.getInfo(1)+ServicesDB.getServicesName();
                }
                if(PayMethod=="OnlineWallet"){
                    return onlineWalletLogic.pay(onlineWallet)+ onlineWalletLogic.getInfo(1)+ServicesDB.getServicesName();
                }
                if(PayMethod=="CashPay"){
                    return cashPayLogic.pay(cashPay)+ cashPayLogic.getInfo(1)+ServicesDB.getServicesName();
                }
            }

            if(ServiceName== "LandLine"){
                if(PayMethod=="CreditCard"){
                    return creditCardLogic.pay(creditCard)+ creditCardLogic.getInfo(1)+ServicesDB.getServicesName();
                }
                if(PayMethod=="OnlineWallet"){
                    return onlineWalletLogic.pay(onlineWallet)+ onlineWalletLogic.getInfo(1)+ServicesDB.getServicesName();
                }
                if(PayMethod=="CashPay"){
                    return cashPayLogic.pay(cashPay)+ cashPayLogic.getInfo(1)+ServicesDB.getServicesName();
                }
            }

            if(ServiceName== "Donation"){
                if(PayMethod=="CreditCard"){
                    return creditCardLogic.pay(creditCard)+ creditCardLogic.getInfo(1)+ServicesDB.getServicesName();
                }
                if(PayMethod=="OnlineWallet"){
                    return onlineWalletLogic.pay(onlineWallet)+ onlineWalletLogic.getInfo(1)+ServicesDB.getServicesName();
                }
                if(PayMethod=="CashPay"){
                    return cashPayLogic.pay(cashPay)+ cashPayLogic.getInfo(1)+ServicesDB.getServicesName();
                }
            }
        }
        return "Service name is not exist";
    }

    public Services getPayName(String name){
        for (Services ServicesDB:servicesList) {
            if(Objects.equals(ServicesDB.getServicesName(), name)){
                return ServicesDB;
            }
        }
        return null;
    }
}

