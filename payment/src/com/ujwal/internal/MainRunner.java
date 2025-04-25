package com.ujwal.internal;
import com.ujwal.external.GooglePay;
import com.ujwal.external.Paytm;
public class MainRunner {
    public static void main(String[] args) {
        PayementGateway gateway = new GooglePay();
        PaymentApp app = new PaymentApp(gateway);
        app.makePayment(499.99);
    }
}
