/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author asus
 */
public class UjiBus2 {
    public static void main (String [] args) {
        
        //membuat objek busBesar dari class Bus2
        Bus2 busBesar = new Bus2 (40) ;
        busBesar.cetak();
        
       //penambahan penumpang
       busBesar.addPenumpang(15);
       busBesar.cetak();
       
       //penambahan penumpang
       busBesar.addPenumpang(5) ;
       busBesar.cetak();
       
       //penambahan penumpang
       busBesar.addPenumpang(26) ;
       busBesar.cetak();
        
    }
    
}
