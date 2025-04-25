package com.ujwal.internal;
import com.ujwal.external.GooglePay;
import com.ujwal.external.Paytm;

public class PaymentApp {
      private PayementGateway gateway;

    public  PaymentApp(PayementGateway gateway)
    {
       this.gateway = gateway;
    }
    public void makePayment(double amount){
        if(gateway != null){
            gateway.pay(amount);
        }else{
            System.out.println("No Payment gateway selected");
        }
    }
}
