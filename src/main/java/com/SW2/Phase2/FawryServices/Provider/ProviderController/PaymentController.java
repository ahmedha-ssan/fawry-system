package com.SW2.Phase2.FawryServices.Provider.ProviderController;

import com.SW2.Phase2.FawryServices.Provider.Logic.CashPayLogic;
import com.SW2.Phase2.FawryServices.Provider.Logic.CreditCardLogic;
import com.SW2.Phase2.FawryServices.Provider.Logic.OnlineWalletLogic;
import com.SW2.Phase2.FawryServices.Provider.Model.CashPay;
import com.SW2.Phase2.FawryServices.Provider.Model.CreditCard;
import com.SW2.Phase2.FawryServices.Provider.Model.OnlineWallet;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {
    private final CashPayLogic cashPayLogic =new CashPayLogic();
    @PostMapping(value = "/Service/CashPay")
    public String addCashSer(@RequestBody CashPay cashPay){
        return cashPayLogic.pay(cashPay)+" Service fee on cash : "+cashPayLogic.PayFee();
    }
    @GetMapping(value = "/Service/CashPay/{id}")
    public CashPay getCashSer(@PathVariable("id") int id){
        return cashPayLogic.getInfo(id);
    }
    /////////////////////////////////////////////////////
    private final CreditCardLogic creditCardLogic =new CreditCardLogic();
    @PostMapping(value = "/Service/CreditCardPay")
    public String addCreditSer(@RequestBody CreditCard creditCard){
        return creditCardLogic.pay(creditCard)+" Service fee on Credit Card : "+creditCardLogic.PayFee();
    }
    @GetMapping(value = "/Service/CreditCardPay/{id}")
    public CreditCard getCreditSer(@PathVariable("id")int id){
        return creditCardLogic.getInfo(id);
    }
    /////////////////////////////////////////////////////
    private final OnlineWalletLogic onlineWalletLogic =new OnlineWalletLogic();
    @PostMapping(value = "/Service/OnlineWalletPay")
    public String addOnlineWalletSer(@RequestBody OnlineWallet onlineWallet){
        return onlineWalletLogic.pay(onlineWallet)+" Service fee on Online Wallet : "+onlineWalletLogic.PayFee();
    }
    @GetMapping(value = "/Service/OnlineWalletPay/{id}")
    public OnlineWallet getOnlineWalletSer(@PathVariable("id")int id){
        return onlineWalletLogic.getInfo(id);
    }
}
