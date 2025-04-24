package com.xworkz.internal;

public class IplApp {
 private JDBC jdbc;
 public IplApp( JDBC jdbc){
     this.jdbc=jdbc;
 }
 public void  teamInfo(){
     if(this.jdbc != null)
     {
         this.jdbc.save();
     }else {
         System.out.println("is null");
     }
 }
}
