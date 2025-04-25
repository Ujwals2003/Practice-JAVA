package com.ujwal.external;

import com.ujwal.internal.PayementGateway;

public class Paytm implements PayementGateway {
    public void pay(double amount){
        System.out.println("Paid:" + amount + "via Paytm");
    }

}
