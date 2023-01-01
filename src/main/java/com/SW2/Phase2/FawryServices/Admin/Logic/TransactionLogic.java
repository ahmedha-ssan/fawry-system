package com.SW2.Phase2.FawryServices.Admin.Logic;

import com.SW2.Phase2.FawryServices.Admin.Model.Transaction;
import com.SW2.Phase2.FawryServices.Provider.Model.CashPay;
import com.SW2.Phase2.FawryServices.Provider.Model.OnlineWallet;
import com.SW2.Phase2.FawryServices.User.model.Userr;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class TransactionLogic {


    private static List<Transaction> onlineWalletList;
    private static List<Userr> userrList;
    Transaction transaction=new Transaction();

    public TransactionLogic(){
        this.onlineWalletList= new ArrayList<>();
        this.userrList=new ArrayList<>();
    }
    CashPay cashPay=new CashPay();
    OnlineWallet onlineWallet=new OnlineWallet();
    public String listTransaction(String UserName) {
            if(UserName.equals("Judy")){
                cashPay.setPayTotal(22);
                return "User # " +transaction.getCount()+ " Payment transaction is Cash pay "+ cashPay.getPayTotal() +
                        " Refund transaction #"+ transaction.getCount() +"is accepted Refund transaction #"+transaction.getCount()  +"is rejected";
            }
            else if(UserName.equals("Ahmed")){
                cashPay.setPayTotal(22);
                onlineWallet.setPayTotal(22);
                return "User # " +transaction.getCount()+ " Payment transaction is Online Wallet "+onlineWallet.getPayTotal()
                        +" Refund transaction #"+ transaction.getCount() +" is accepted";
            }
            return "List Transaction successfully...";
    }
}//     Payment transaction.
  //       Add to wallet transaction.
//         Refund transaction.
