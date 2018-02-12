/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courier.management;

/**
 *
 * @author Admin
 */
public class TransportDetails {
   public int transport_ID;
   public String deliveryStatus;
   public String numberPlate;
   public String destination;
   public Packages packageNumber;
  
  
  public TransportDetails (){
   deliveryStatus = "";
   numberPlate = "";
   destination = " ";
   transport_ID =0;
   
  
}
//Getter and Setter methods

public String getdestination(){
  return destination;
}
public void setdestination(String newvalue){
  destination = newvalue;
}
public String getnumberPlate(){
  return numberPlate;
}
public void setnumberPlate(String newvalue){
  numberPlate = newvalue;
}
public int gettransport_ID(){
     if (transport_ID >= 100000)
 System.out.println(transport_ID);
 
     
 else if (transport_ID < 100000 || transport_ID > 1000000){
 System.out.println("Incorrect Entry!");
 }
   return transport_ID;
}
public void settransport_ID(int newvalue){

  transport_ID = newvalue;
}
public String getdeliveryStatus(){
  return deliveryStatus;
}
public void setdeliveryStatus(String newvalue){
  deliveryStatus = newvalue;

    
}
}