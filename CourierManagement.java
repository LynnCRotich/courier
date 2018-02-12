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
public class CourierManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scream scream = new Scream();
        scream.setVisible(true);
        Login login = new Login();
             try{
                 for (int i = 0;i <=100; i++){
                     Thread.sleep(40);
                     scream.txt_num_loading.setText(Integer.toString(i)+"%");
                     
                     if(i==100){
                       scream.setVisible(false);
                       login.setVisible(true);
                 }
                 }
             
             }catch (Exception e){
             
             }
       
    }
    
}
