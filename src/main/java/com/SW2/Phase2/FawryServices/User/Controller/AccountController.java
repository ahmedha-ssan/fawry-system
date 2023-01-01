package com.SW2.Phase2.FawryServices.User.Controller;

import com.SW2.Phase2.FawryServices.User.Logic.AccountLogic;
import com.SW2.Phase2.FawryServices.User.Logic.DiscountDisplayLogic;
import com.SW2.Phase2.FawryServices.User.Logic.RefundDisplayLogic;
import com.SW2.Phase2.FawryServices.User.model.Userr;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    private AccountLogic accountLogic =new AccountLogic();
    // /Account/SignIN?email=ahmed@gmail&password=123
    @PostMapping(value = "/Account/SignIN")
    public String SignIn(@RequestParam("email") String email, @RequestParam("password") String password) {
        return accountLogic.SignIn(email,password);
    }
    // /Account/SignUp?name=Hassan&email=hassan@gmail&password=123456
    @PostMapping(value = "/Account/SignUp")
    public String SignUp(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("password") String password) {
        return accountLogic.SignUp(name,email,password);
    }
    // /Account/Check?email=ahmed@gmail&password=123
    @PostMapping(value = "/Account/Check")
    public String Check(@RequestParam("email") String email, @RequestParam("password") String password) {
        return accountLogic.Check(email, password);
    }
    //////////////////////////////////////////////////////
    private DiscountDisplayLogic discountDisplayLogic =new DiscountDisplayLogic();
     @PostMapping(value = "/Discount/UpDate")
    public String UpDdate(@RequestBody Userr userr) {
        return discountDisplayLogic.UpDate(userr);
    }
    @PostMapping(value = "/Discount/Display")
    public String DisplayD(Userr userr) {
        return discountDisplayLogic.Display(userr);
    }
    //////////////////////////////////////////////////////
    private RefundDisplayLogic refundDisplayLogic =new RefundDisplayLogic();
    @PostMapping(value = "/Refund/UpDate")
    public String UpdateR(@RequestBody Userr userr) {
        return refundDisplayLogic.UpDate(userr);
    }
    @PostMapping(value = "/Refund/Display")
    public String DisplayR(Userr userr) {
        return refundDisplayLogic.Display(userr);
    }
    //////////////////////////////////////////////////////
}
