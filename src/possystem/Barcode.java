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
public class Barcode {
    

    
          
    private static String barcode;
         //   static Barcode br = new Barcode();
    
    public static void readbBarcode(String b){
                
        barcode =b;

    }
    public static String randomID(String typeproduct , String  host , String place){
            //   00 ประเภทสินค้า 11

            //00 บริษัทที่ผลิต

            //0000 รหัสสถานที่จำหน่าย 
            
        int random ;
         random = (int )(Math.random() * (100000));
         String idproduct = String.valueOf(random);
         barcode = typeproduct + host + place + idproduct ;
         return barcode;
           
    }
      public static String partBarcode() {

        return barcode;
    }
    


}
