/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package possystem;

/**
 *
 * @author Godonlyknows
 */
public class CashDrawer {
    
    public static String CashDrawerout(){
   if(Ipad.Type.equals("Card")){
       return "CashClose";
   }
   else{
       return "CashOPEN";
       
   }
}
    
}
