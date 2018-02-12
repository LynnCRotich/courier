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
public class Users {
    public String userName;
    public String password;
    public int user_ID;
    public String address;
    public int phoneNumber;
    public String email;
    
    public Users(){
       userName = "";
       password = "";
       user_ID = 0;
       address = "";
       phoneNumber = 0;
       email = "";
                
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
public void setemail(String newvalue){
  email = newvalue;
}
public String getemail(){
  return email;
}
public void setaddress(String newvalue){
  address = newvalue;
}
public String getaddress(){
  return address;
}
public void setphoneNumber(int newvalue){
    
  phoneNumber =newvalue;
}
public int getphoneNumber(){
  return phoneNumber;
} 

public int getuser_ID(){
     if (user_ID >= 100000)
 System.out.println(user_ID);
 
     
 else if (user_ID < 100000 || user_ID > 1000000){
 System.out.println("Incorrect Entry!");
 }
   return user_ID;
}
public void setuser_ID(int newvalue){

  user_ID = newvalue;
}
    
}
