package com.SW2.Phase2.FawryServices.Admin.Controller;

import com.SW2.Phase2.FawryServices.Admin.Logic.*;
import com.SW2.Phase2.FawryServices.Admin.Model.Refund;
import com.SW2.Phase2.FawryServices.User.model.Userr;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {
    private final AcceptRefundLogic acceptRefundLogic =new AcceptRefundLogic();
    @PostMapping(value = "/Admin/Accept/Refund")
    public String AcceptState(@RequestBody Refund refund){
        return refund.getServiceName()+" "+refund.getAmount()+"  $ status :"+acceptRefundLogic.state();
    }
    ///////////////////////////////////////////////////
    private final RejectRefundLogic rejectRefundLogic =new RejectRefundLogic();
    @PostMapping(value = "/Admin/Reject/Refund")
    public String RejectState(@RequestBody Refund refund){
        return  refund.getServiceName()+" "+refund.getAmount()+"  $ status :"+rejectRefundLogic.state();
    }
    ///////////////////////////////////////////////////
    private final DiscountChangeLogic discountChangeLogic =new DiscountChangeLogic();
    @PostMapping(value = "/Discount/change/register")
    public String addUser(@RequestBody Userr userr){
        return discountChangeLogic.RegisterUser(userr);
    }
    @GetMapping(value = "/Discount/change/register/{id}")
    public Userr getUser(@PathVariable("id") int id){
        return discountChangeLogic.getUsers(id);
    }
    @PostMapping(value = "/Discount/change/remove")
    public String removeUser(@RequestBody Userr userr){
        return discountChangeLogic.RemoveUser(userr);
    }
    @PostMapping(value = "/Discount/change/notify")
    public String notifyUser(@RequestBody Userr userr){
        return discountChangeLogic.Notify(userr);
    }
    ///////////////////////////////////////////////////
    private final RefundChangeLogic refundChangeLogic =new RefundChangeLogic();
    @PostMapping(value = "/Refund/change/register")
    public String addRefund(@RequestBody Userr userr){
        return refundChangeLogic.RegisterUser(userr);
    }
    @GetMapping(value = "/Refund/change/register/{id}")
    public Userr getRefund(@PathVariable("id") int id){
        return refundChangeLogic.getUsers(id);
    }
    @PostMapping(value = "/Refund/change/remove")
    public String removeRefund(@RequestBody Userr userr){
        return refundChangeLogic.RemoveUser(userr);
    }
    @PostMapping(value = "/Refund/change/notify")
    public String notifyRefund(@RequestBody Userr user){
        return refundChangeLogic.Notify(user);
    }
    ///////////////////////////////////////////////////
    private final RefundLogic refundLogic=new RefundLogic();
    // /Refund/listRefund?name=MobileRecharge
    @PostMapping(value = "/Refund/listRefund")
    public String getlistRefund(@RequestParam("name") String name){
        return refundLogic.listRefund(name);
    }
    ///////////////////////////////////////////////////
    // /Refund/listTransaction?UserName=Ahmed
    private final TransactionLogic transactionLogic=new TransactionLogic();
    @PostMapping(value = "/Refund/listTransaction")
    public String getlistTransaction(@RequestParam("UserName") String UserName){
    return transactionLogic.listTransaction(UserName);
}
}