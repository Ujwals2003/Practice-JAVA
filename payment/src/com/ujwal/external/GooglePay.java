package com.ujwal.external;

import com.ujwal.internal.PayementGateway;

public class GooglePay implements PayementGateway {
    public void pay(double amount){
        System.out.println("Paid :" + amount + "via Google Pay") ;
    }

}
