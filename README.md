...The whole source code is written by Ahmed A. Hassan...
Language and technology used in the project (java, SOLID principles, design patterns, MAVEN, RESTFUL API, SDLC)+ Documentation.
---------------------------------------------------------------------------------------------------------------
(i) How to build the project...
    -> import as a maven project using eclipse enterprise edition and browse to the path of the project
    -->open project then 
            src ->main->com->SW2->Phase2->FawryService->FawryServicesApplication.java
              then run FawryServicesApplication.java
---------------------------------------------------------------------------------------------------------------              

(ii) Any extra notes that are necessary to build the project... 
    Its maven project depends on Java 11 build and run with SPRING
---------------------------------------------------------------------------------------------------------------
                                    (...YOU CAN TEST ANY ITS JUST A SAMPLE...)
                                                    (..THANKS..)
---------------------------------------------------------------------------------------------------------------
(iii) Steps you may follow to test the hole project 
    After the run go to post Man
        -to sign in with an existing email and password
              POST->http://localhost:8080/Account/SignIN?email=ahmed@gmail&password=123
                  --{"userName":"ahmed","email":"ahmed@gamil", "password":"123"} 
                  
        -to sign up with name and emial that is not exist  
              POST->http://localhost:8080/Account/SignUp?name=Hassan&email=hassan@gmail&password=123456
                  --{"userName":"Hassan", "email":"hassan@gmail", "password":"123456"} 
                  
        -to check if the email is exist or not
              POST->http://localhost:8080/Account/Check?email=ahmed@gamil&password=123 ---is exist
              POST->http://localhost:8080/Account/Check?email=notttt&password=123      ---is not exist
                  --{"userName":"Ahmed", "email":"ahmed@gmail","password":"123"} 
                  
        -to update discount on a given user
             POST->http://localhost:8080/Discount/UpDate
                 --{"userName":"Ahmed", "email":"ahmed@gmail","password":"123"}//null->no discount added 
                 
        -admin accepts refund req.
             POST->http://localhost:8080/Admin/Accept/Refund
                 --{"serviceName":"donation","amount":222,"count":3}
                 
        -admin add discount to user.(follow)
             POST->http://localhost:8080/Discount/change/register
                 --{"userName":"ahmed", "email":"ammodi9@gamil","password":"123","id":20200026}
       
       -admin remove discount to user.(Unfollow)
             POST->http://localhost:8080/Discount/change/remove
                 --{"userName":"ahmed", "email":"ammodi9@gamil","password":"123","id":20200026}
       
       -admin can get(search) user.(using ID)
             GET->http://localhost:8080/Discount/change/register/20200026
                
       -admin notify discount to user.(notify)
             POST->http://localhost:8080/Discount/change/notify
                 --{"userName":"ahmed", "email":"ammodi9@gamil","password":"123","id":20200026}
        
       -admin list refund req.
             POST->http://localhost:8080/Refund/listRefund?name=MobileRecharge
                 --{"serviceName":"MobileRecharge", "amount":22,"count":2} 
 
       -admin list Transaction req.
             POST->http://localhost:8080/Refund/listTransaction?UserName=Ahmed
                 --{"serviceName":"MobileRecharge", "amount":22,"count":2} 
                 
       -user pay the receipt for donation cancer hospital.
             POST->http://localhost:8080/Donation/Cancer
                 --{"servicesName":"DonationCancer", "payment":22,"id":2} //We can use any service as /Internet/Voda 
  
       -get all info for the user id.
             GET->http://localhost:8080/Donation/Cancer/2
               
       -user pay the receipt using cash on pay.
             POST->http://localhost:8080/Service/CashPay
                 --{"userName":"Ahmed Abdelahmeed", "payTotal":1099,"id":20200026} 
  
       -get user info using his ID.
             GET->http://localhost:8080/Service/CashPay/20200026
                 
       -user pay the receipt using online wallet.
             POST->http://localhost:8080/Service/OnlineWalletPay
                 --{"userName":"Ahmed Abdelahmeed", "payTotal":1099,"id":202000261,"email":"ammodi9@gmail.com","password":123}
                 
       -get user info using his ID.
             GET->http://localhost:8080/Service/OnlineWalletPay/20200026
             
       -user get a discount on donation payment.
             POST->http://localhost:8080/Discount/Donation
                 --{"description":"Donationdiscount", "amount":1.3} 
                 
       -get user info using discount service name.
             GET->http://localhost:8080/Discount/Donation/Donationdiscount
       
       -user get a discount on land line with overall.
             POST->http://localhost:8080/Discount/LandLine
                 --{"description":"LLwithOverall", "amount":1.3}     
                 
       -get user info using discount service name.
             GET->http://localhost:8080/Discount/LandLine/LLwithOverall
                  
                 
        
       
                       
             
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                          













                 
