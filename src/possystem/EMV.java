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
public class EMV {
   
    private static String Dateend="" ;
    private static String CODE="";
    private static String CHK="";

    public static void setCHK(String CHK) {
        EMV.CHK = CHK;
    }

    public static void setCODE(String CODE) {
        EMV.CODE = CODE;
    }

    public static void setDateend(String Dateend) {
        EMV.Dateend = Dateend;
    }

    public static String getCHK() {
        return CHK;
    }

    public static String getCODE() {
        return CODE;
    }

    public static String getDateend() {
        return Dateend;
    }
    
    public static void readCCard(String C ,String datec ,String codecard){
        if(C.equals("") || codecard.equals("") || datec.equals("")){
               System.out.println("ERROR NOT FOUND CARD");
  
        }
        else{
            System.out.println("FOUND CARD");
                    //   Type="Card";
        CHK=C;
        Dateend =datec;
        CODE=codecard;
        }
    }
    public static String partCHK(){
        return CHK;
    }
    public static String partDateend(){
        return Dateend;
    }
    public static String partCode(){
        return CODE;
    }
}
