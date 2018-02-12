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
public class Tracking {
    public int tracking_ID;
    public TransportDetails destination;
    
    public Tracking(){
      tracking_ID = 0;
      
    }
    public int gettracking_ID(){
     if (tracking_ID >= 100000)
 System.out.println(tracking_ID);
 
     
 else if (tracking_ID < 100000 || tracking_ID > 1000000){
 System.out.println("Incorrect Entry!");
 }
   return tracking_ID;
}
public void settracking_ID(int newvalue){

  tracking_ID = newvalue;
}
    
}
 