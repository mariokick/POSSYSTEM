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
public class testclass {
    public static void main(String[] args) {
Barcode br = new Barcode();
Ipad ip = new Ipad();
EMV em = new EMV();
CashDrawer cr = new CashDrawer();
Printer pt =new Printer();
br.readbBarcode(br.randomID("11","11","1121"));
  ip.addbarcode(br.partBarcode());
  br.readbBarcode(br.randomID("21","11","1121"));
  ip.addbarcode(br.partBarcode());
  br.readbBarcode(br.randomID("31","11","1121"));
  ip.addbarcode(br.partBarcode());

    EMV.readCCard("บัตรเดบิต","10-10-1994","1289481224116");
    EMV.partCHK();
    EMV.partCode();
    EMV.partDateend();
    
  
  pt.Print();
    }
}