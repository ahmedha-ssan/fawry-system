package com.SW2.Phase2.FawryServices.Admin.Logic;

import com.SW2.Phase2.FawryServices.Admin.Model.Refund;
import org.springframework.stereotype.Service;

@Service
public class AcceptRefundLogic extends Refund {
    public String state() {
       return "Refund Accepted";
    }
}
