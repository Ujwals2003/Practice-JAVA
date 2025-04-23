package com.xworkz;
import com.xworkz.internal.Temple;
public   class God {
    public God(){
        System.out.println("Running in God");
    }

    public void trust() {
        Temple temple = new Temple();
        temple.bell();
        temple.Queue();
    }
}

