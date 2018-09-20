/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author asus
 */
public class UjiBus4 {
    
    public static void main (String [] args) {
        Bus4 bus = new Bus4(50) ;
        bus.getPenumpang(30);
        bus.cetak();
        bus.addPenumpang(20, 100);
        bus.cetak();
        bus.addPenumpang(15,50);
        bus.cetak();
        bus.getAverage();

    }

}
