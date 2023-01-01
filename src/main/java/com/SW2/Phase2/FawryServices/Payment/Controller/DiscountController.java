package com.SW2.Phase2.FawryServices.Payment.Controller;

import com.SW2.Phase2.FawryServices.Payment.Logic.*;
import com.SW2.Phase2.FawryServices.Payment.model.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class DiscountController{

/////////////////////////////////////////////////
    private final LandLineLogic landLineLogic=new LandLineLogic();
    Discount discount=new LandLineDiscount("Land Line Discount");
    @PostMapping(value = "/Discount/LandLine")
    public String addLLDisc(){
        return discount.getDescription()+"$"+discount.AddDiscount();
    }
    @GetMapping(value = "/Discount/LandLine/{Name}")
    public LandLineDiscount getLLdis(@PathVariable("name") String Name){
        return landLineLogic.getDiscount(Name);
    }

    //////////////////////////////////////////////////
    private final DonationLogic donationLogic =new DonationLogic();
    Discount discount3=new DonationDiscount("Donation Discount");
    @PostMapping(value = "/Discount/Donation")
    public String addDDisc(){
        return discount3.getDescription()+"$"+discount3.AddDiscount();
    }
    @GetMapping(value = "/Discount/Donation/{Name}")
    public DonationDiscount getDdis(@PathVariable("Name") String Name){
        return donationLogic.getDiscount(Name);
    }
//////////////////////////////////////////////////
    private final InternetLogic internetLogic =new InternetLogic();
    Discount discount4=new InternetDiscount("Internet Discount");
    @PostMapping(value = "/Discount/Internet")
    public String addIisc(){
        return discount4.getDescription()+"$"+discount4.AddDiscount();
    }
    @GetMapping(value = "/Discount/Internet/{Name}")
    public InternetDiscount getIdis(@PathVariable("Name") String Name){
        return internetLogic.getDiscount(Name);
    }
//////////////////////////////////////////////////
    private final MobileRechargeLogic mobileRechargeLogic =new MobileRechargeLogic();
    Discount discount5=new MobileRechargeDiscount("Mobile Recharge Discount");
    @PostMapping(value = "/Discount/MobileRecharge")
    public String addMisc(){
        return discount5.getDescription()+"$"+discount5.AddDiscount();
    }
    @GetMapping(value = "/Discount/MobileRecharge/{Name}")
    public MobileRechargeDiscount getMdis(@PathVariable("name") String Name){
        return mobileRechargeLogic.getDiscount(Name);
    }
//////////////////////////////////////////////////
    private final OverallLogic overallLogic=new OverallLogic();
    Discount discount6=new OverallLogic();
    @PostMapping(value = "/Discount/MobileRecharge/Specific")
    public String addODisc(){
        discount6=new LandLineDiscount("Mobile Recharge Discount");
        return  discount6.getDescription()+"$"+discount6.AddDiscount();
    }
    @PostMapping(value = "/Decorator/Overall/Description")
    public String addOdes(@RequestBody Decorator decorator){
        return  overallLogic.getDescription(String.valueOf(decorator));
    }

    @GetMapping(value = "/Discount/Overall/{name}")
    public String getODisc(@PathVariable("name") String name){
        return overallLogic.getDescription(name);
    }

/////////////////////////////////////////////////
//LandLine+Overall
    private final SpecificLogic specificLogic=new SpecificLogic();
    Discount discount2=new SpecificLogic();
    @PostMapping(value = "/Discount/LandLine/WithSpecific")
    public String addLLDiscSpecific(){
        discount2=new LandLineDiscount("Land Line dscount with Specific discount");
        return discount2.getDescription()+"$"+discount2.AddDiscount();
    }
    @PostMapping(value = "/Decorator/specific/pay")
    public double addSDisc(@RequestBody Decorator decorator){
        return specificLogic.AddDiscount(decorator);
    }
    @PostMapping(value = "/Decorator/specific/Description")
    public String addSdes(@RequestBody Decorator decorator){
        return  overallLogic.getDescription(String.valueOf(decorator));
    }
    @GetMapping(value = "/Discount/specific/{name}")
    public String getSDisc(@PathVariable("name") String  name){
        return specificLogic.getDescription(name);
    }
/////////////////////////////////////////////////
}

