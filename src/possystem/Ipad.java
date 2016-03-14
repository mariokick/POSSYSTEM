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
  static ArrayList<String> ListBarcode = new ArrayList<String>();
 // static           ArrayList<String> ListCashCard = new ArrayList<String>();
    static Barcode  barcode ;
    private static String CashCard  ="";
      static String Type ="Cash";
    
    Barcode br = new Barcode();
    
    public void addbarcode(String ba){
    ListBarcode.add(ba);
    }
    public static String getCCard(){
       // if(EMV.partCHK().equals("") || EMV.partDateend().equals("")||EMV.partCode().equals("")){
        // System.out.println("CCardERROR");
      //  }
      //  else{
 
           return CashCard = "\n ประเภทบัตร : "+ EMV.partCHK()+"\n หมายเลขบัตร : "+ EMV.partCode()+"\n วันหมดอายุของบัตร : "+ EMV.partDateend();
       // }
       // }
    }
    public String addCCard(){
  
       return(getCCard());
    }
    public String getBarcode (){
        return Barcode.partBarcode();
    }

    public static String getType() {
        return Type;
    }
    
}
