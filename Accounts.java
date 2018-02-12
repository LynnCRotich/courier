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
public class Accounts {
     public String username;
    public int account_ID;
    private String password;
    public int payment;
    
public Accounts() {
    username = " ";
    account_ID = 0;
    password = " ";
    payment = 0;        
    }
    
 public String getusername(){
  return username;
}
 public void setusername(String newvalue){
  username = newvalue;
}
 public int getaccount_ID(){
      
        if (account_ID >= 100){
        System.out.println(account_ID);
        }
        else if (account_ID < 100 || account_ID >= 1000000){
        System.out.println("Incorrect Entry!");
        }
  return account_ID;
}
 public int setaccount_ID(int newvalue){
         account_ID = newvalue;
   return account_ID;
}
public int getpayment(){
  return payment;
}
 public void setpayment(int newvalue){
  payment = newvalue;
}
 public String getpassword(){
  return password;
}
public void setpassword(String newvalue){
  password = newvalue;
}
    
}
/*
try
{
   class.forName(JBDC_DRIVER);
   con=DriverManager.getConnection(DB_URL, USER, PASS);
}
catch(Exception ex){
   JOptionPane.showMeassageialog(null,ex);
}

*/
