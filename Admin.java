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
public class Admin {
    public int admin_ID;
    public String userName;
    public String password;
    
    public Admin(){
       admin_ID = 0;
       userName = "";
       password = "";
       
    }
    
public String getuserName(){
  return userName;
}
public void setuserName(String newvalue){
  userName = newvalue;
}

public String getpassword(){
  return password;
}
public void setpassword(String newvalue){
  password = newvalue;
}

public int getadmin_ID(){
     if (admin_ID >= 100000)
 System.out.println(admin_ID);
 
     
 else if (admin_ID < 100000 || admin_ID > 1000000){
 System.out.println("Incorrect Entry!");
 }
   return admin_ID;
}
public void setadmin_ID(int newvalue){

  admin_ID = newvalue;
}
}
