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
public class Employees {
    public int employee_ID;
    public String userName;
    public int password;
     
    public Employees(){
       employee_ID= 0;
       userName = "";
       password = 0;
    
    }
 public String getuserName(){
  return userName;
}
public void setuserName(String newvalue){
  userName = newvalue;
}
public void setpassword(int newvalue){
    
  password =newvalue;
}
public int getpassword(){
  return password;
} 
 public int getemployee_ID(){
     if (employee_ID >= 100000)
 System.out.println(employee_ID);
 
     
 else if (employee_ID < 100000 || employee_ID > 1000000){
 System.out.println("Incorrect Entry!");
 }
   return employee_ID;
}
public void setemployee_ID(int newvalue){

  employee_ID = newvalue;
}
    
}
