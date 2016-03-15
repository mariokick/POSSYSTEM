/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package possystem;

import java.util.ArrayList;

/**
 *
 * @author Godonlyknows
 */
public class Ipad {
    public static ArrayList<String> ListBarcode = new ArrayList<String>();
    private static Barcode  barcode ;
    private static String CashCard  ="";
    private static String CHK ;
    private static String DateEnd;
    private static String CODE;
    private static boolean CheckCashCard = false;
             
    
    Barcode br = new Barcode();
    
    public void addbarcode(String ba){
    ListBarcode.add(ba);
    }
    public static boolean CheckCCard(){
        getCashCard();
        if(partCashCard().equals("")){
            CheckCashCard = false;
        }
        else{
            CheckCashCard=true;
        }
   return CheckCashCard;
    }
    public static String partCashCard(){
        return CashCard;
    }
    public static void getCashCard(){
       // if(EMV.partCHK().equals("") || EMV.partDateend().equals("")||EMV.partCode().equals("")){
        // System.out.println("CCardERROR");
      //  }
      //  else{
      CashCard =  EMV.partCHK()+ EMV.partCode()+ EMV.partDateend();
      CHK=EMV.partCHK();
      CODE=EMV.getCODE();
      DateEnd=EMV.getDateend();

               
       // }
    }
    public static String getCODE() {
        return CODE;
    }
    public static String getDateEnd() {
        return DateEnd;
    }
    public static String getCHK (){
        return CHK;
    }
    public String getBarcode() {
        return Barcode.partBarcode();
    }
}
