/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class UjiBola {
    public static void main (String [] args){
    Scanner masukan = new Scanner (System.in) ;
    Bola uji = new Bola ();
 
        System.out.println("Dewi Nurul Mahardika / 16 / X RPL 6");
      
  
        uji.setJariJari (7);
        System.out.println("");
        System.out.println("Jari - Jari            :" + uji.getJariJari());
        System.out.println(" Diameter            : " + uji.getDiameter());
        System.out.println("Luas Permukaan  :"+uji.getLuasPermukaan());
        System.out.println("Volume                : " + uji.getVolume());
        
        
    }
}
