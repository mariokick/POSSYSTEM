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
public class Printer {
    
    public void Print(){
        if(Ipad.CheckCCard() == true){

        System.out.println("\n "+CashDrawer.CashDrawerout()
                + "\n Product Barcode : "+Ipad.ListBarcode+"\n Pay by CashCard  "
                +"\n ประเภทบัตร :"+Ipad.getCHK()
                +"\n รหัส CashCard :"+Ipad.getCODE()
                +"\n วันหมดอายุบัตร :"+Ipad.getDateEnd());
                    
        }
        else{
              System.out.println("\n "+CashDrawer.CashDrawerout()
                + "\n Product Barcode : "+Ipad.ListBarcode+"\n NOT CASHCARD");
        }
    }
    
}
