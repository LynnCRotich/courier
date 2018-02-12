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
public class Packages {
    public int package_ID;
    public int weight;
    public int packageNumber;
    public String packageName;
    public String address;
    
    public Packages (){
       package_ID = 0;
       weight = 0;
       packageNumber = 0;
       packageName ="";
       address ="";
    }


public void setpackageNumber(int newvalue){
    
  packageNumber =newvalue;
}
public int getpackageNumber(){
  return packageNumber;
} 

public void setweight(int newvalue){
    
  weight =newvalue;
}
public int getweight(){
  return weight;
}

public int getpackage_ID(){
     if (package_ID >= 100000)
 System.out.println(package_ID);
 
     
 else if (package_ID < 100000 || package_ID > 1000000){
 System.out.println("Incorrect Entry!");
 }
   return package_ID;
}
public void setpackage_ID(int newvalue){

  package_ID = newvalue;
}

public String getpakageName(){
  return packageName;
}
public void setpackageName(String newvalue){
  packageName = newvalue;

    
}

public String getaddress(){
  return address;
}
public void setaddress(String newvalue){
  address = newvalue;

    
}
}

