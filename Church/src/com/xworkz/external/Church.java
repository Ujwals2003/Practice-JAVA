package com.xworkz.external;

public class Church {
    public Church(){
        System.out.println("no-args Church constructor");
    }

    public void pray(){
        System.out.println("Praying inside Church");
    }

    void bell(){
        System.out.println("Church bell ringing");
        sermon();
    }

    private void sermon(){
        System.out.println("Listening to sermon");
    }
}
