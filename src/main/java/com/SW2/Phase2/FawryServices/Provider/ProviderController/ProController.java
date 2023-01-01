package com.SW2.Phase2.FawryServices.Provider.ProviderController;


import com.SW2.Phase2.FawryServices.Provider.Logic.*;
import com.SW2.Phase2.FawryServices.Provider.Model.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProController {
    private final DonationCancerHospitalLogic donationCancerHospitalLogic =new DonationCancerHospitalLogic();
    @PostMapping(value = "/Donation/Cancer")
    public String addDonationCancer(@RequestBody Donation donation){
        return donationCancerHospitalLogic.AddServices(donation)+" Donation Schools bill is : "+donationCancerHospitalLogic.PayBill();

    }
    @GetMapping(value = "/Donation/Cancer/{id}")
    public Donation getDonationCancer(@PathVariable("id") int id){
        return donationCancerHospitalLogic.getServices(id);
    }


    /////////////////////////////////////////////////////
    private DonationNGOsLogic donationNGOsLogic =new DonationNGOsLogic();
    @PostMapping(value = "/Donation/NGOs")
    public String addDonationNGOs(@RequestBody Donation donation){
        return donationNGOsLogic.AddServices(donation)+" Donation NGOs bill is : "+donationNGOsLogic.PayBill();
    }
    @GetMapping(value = "/Donation/NGOs/{id}")
    public Donation getDonationNGOs(@PathVariable("id") int id){
        return donationNGOsLogic.getServices(id);
    }
    /////////////////////////////////////////////////////
    private DonationSchoolsLogic donationSchoolsLogic =new DonationSchoolsLogic();
    @PostMapping(value = "/Donation/Schools")
    public String addDonationScools(@RequestBody Donation donation){
        return donationSchoolsLogic.AddServices(donation)+" Donation Schools bill is : "+donationSchoolsLogic.PayBill();
    }
    @GetMapping(value = "/Donation/Schools/{id}")
    public Donation getDonationSchools(@PathVariable("id") int id){
        return donationSchoolsLogic.getServices(id);
    }


    /////////////////////////////////////////////////////
    private InternetPaymentEtisalatLogic internetPaymentEtisalatLogic =new InternetPaymentEtisalatLogic();
    @PostMapping(value = "/Internet/Etisalat")
    public String addInternetEtisalat(@RequestBody InternetPayment internetPayment){
        return  internetPaymentEtisalatLogic.AddServices(internetPayment)+
                " Internet Etisalat bill is : "+internetPaymentEtisalatLogic.PayBill();
    }
    @GetMapping(value = "/Internet/Etisalat/{id}")
    public InternetPayment getInternetEtisalat(@PathVariable("id") int id){
        return internetPaymentEtisalatLogic.getServices(id);
    }
    /////////////////////////////////////////////////////
    private InternetPaymentOrangeLogic internetPaymentOrangeLogic =new InternetPaymentOrangeLogic();
    @PostMapping(value = "/Internet/Orange")
    public String addInternetOrange(@RequestBody InternetPayment internetPayment){
        return  internetPaymentOrangeLogic.AddServices(internetPayment)+
                " Internet Orange bill is : "+internetPaymentOrangeLogic.PayBill();
    }
    @GetMapping(value = "/Internet/Orange/{id}")
    public InternetPayment getInternetOrange(@PathVariable("id") int id){
        return internetPaymentOrangeLogic.getServices(id);
    }
    /////////////////////////////////////////////////////
    private InternetPaymentVodaLogic internetPaymentVodaLogic =new InternetPaymentVodaLogic();
    @PostMapping(value = "/Internet/Voda")
    public String addInternetVoda(@RequestBody InternetPayment internetPayment){
        return  internetPaymentVodaLogic.AddServices(internetPayment)+
                " Internet Vada bill is : "+internetPaymentVodaLogic.PayBill();
    }
    @GetMapping(value = "/Internet/Voda/{id}")
    public InternetPayment getInternetVoda(@PathVariable("id") int id){
        return internetPaymentVodaLogic.getServices(id);
    }
    /////////////////////////////////////////////////////

    private InternetPaymentWeLogic internetPaymentWeLogic =new InternetPaymentWeLogic();
    @PostMapping(value = "/Internet/We")
    public String addInternetWe(@RequestBody InternetPayment internetPayment){
        return  internetPaymentWeLogic.AddServices(internetPayment)+
                " Internet We bill is : "+internetPaymentWeLogic.PayBill();
    }
    @GetMapping(value = "/Internet/We/{id}")
    public InternetPayment getInternetWe(@PathVariable("id") int id){
        return internetPaymentWeLogic.getServices(id);
    }
    /////////////////////////////////////////////////////

    private LandLineMonthlyReceiptLogic landLineMonthlyReceiptLogic =new LandLineMonthlyReceiptLogic();
     @PostMapping(value = "/LandLine/Monthly")
    public String addLandLineMonthly(@RequestBody LandLine landLine){
        return  landLineMonthlyReceiptLogic.AddServices(landLine)+
                " LandLine Monthly bill is : "+landLineMonthlyReceiptLogic.PayBill();
    }
    @GetMapping(value = "/LandLine/Monthly/{id}")
    public LandLine getLandLineMonthly(@PathVariable("id") int id){
        return landLineMonthlyReceiptLogic.getServices(id);
    }
    /////////////////////////////////////////////////////


    private LandLineQuarterReceiptLogic landLineQuarterReceiptLogic=new LandLineQuarterReceiptLogic();
    @PostMapping(value = "/LandLine/Quarter")
    public String addLandLineQuarter(@RequestBody LandLine landLine){
        return  landLineQuarterReceiptLogic.AddServices(landLine)+
                " LandLine Quarter bill is : "+landLineQuarterReceiptLogic.PayBill();
    }
    @GetMapping(value = "/LandLine/Quarter/{id}")
    public LandLine getLandLineQuarter(@PathVariable("id") int id){
        return landLineQuarterReceiptLogic.getServices(id);
    }
    /////////////////////////////////////////////////////

    private MobileRechargeEtisalatLogic mobileRechargeEtisalatLogic =new MobileRechargeEtisalatLogic();
    @PostMapping(value = "/Mobile/Etislat")
    public String addMobileRechargeEtisalat(@RequestBody MobileRecharge mobileRecharge){
        return  mobileRechargeEtisalatLogic.AddServices(mobileRecharge)+
                " Mobile Etislat bill is : "+mobileRechargeEtisalatLogic.PayBill();
    }
    @GetMapping(value = "/Mobile/Etislat/{id}")
    public MobileRecharge getMobileRechargeEtisalat(@PathVariable("id") int id){
        return mobileRechargeEtisalatLogic.getServices(id);
    }
    /////////////////////////////////////////////////////
    private MobileRechargeOrangeLogic mobileRechargeOrangeLogic =new MobileRechargeOrangeLogic();
    @PostMapping(value = "/Mobile/Orange")
    public String addMobileRechargeOrange(@RequestBody MobileRecharge mobileRecharge){
        return  mobileRechargeOrangeLogic.AddServices(mobileRecharge)+
                " Mobile Orange bill is : "+mobileRechargeOrangeLogic.PayBill();
    }
    @GetMapping(value = "/Mobile/Orange/{id}")
    public MobileRecharge getMobileRechargeOrange(@PathVariable("id") int id){
        return mobileRechargeOrangeLogic.getServices(id);
    }
    //////////////////////////////////////////////////////

    private MobileRechargeVodaLogic mobileRechargeVodaLogic =new MobileRechargeVodaLogic();
     @PostMapping(value = "/Mobile/Voda")
    public String addMobileRechargeVoda(@RequestBody MobileRecharge mobileRecharge){
        return  mobileRechargeVodaLogic.AddServices(mobileRecharge)+
                " Mobile Voda bill is : "+mobileRechargeVodaLogic.PayBill();
    }
    @GetMapping(value = "/Mobile/Voda/{id}")
    public MobileRecharge getMobileRechargeVoda(@PathVariable("id") int id){
        return mobileRechargeVodaLogic.getServices(id);
    }
    /////////////////////////////////////////////////////

    private MobileRechargeWeLogic mobileRechargeWeLogic =new MobileRechargeWeLogic();
    @PostMapping(value = "/Mobile/We")
    public String addMobileRechargeWe(@RequestBody MobileRecharge mobileRecharge){
        return  mobileRechargeWeLogic.AddServices(mobileRecharge)+
                " Mobile Voda bill is : "+mobileRechargeWeLogic.PayBill();
    }
    @GetMapping(value = "/Mobile/We/{id}")
    public MobileRecharge getMobileRechargeWe(@PathVariable("id") int id){
        return mobileRechargeWeLogic.getServices(id);
    }
    /////////////////////////////////////////////////////
}
