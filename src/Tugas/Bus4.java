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
public class Bus4 {
    public double penumpang ;
    public double maxPenumpang ;
    public double beratPenumpang ;
    
    
    public Bus4(double maxPenumpang){
     this.maxPenumpang = maxPenumpang ;
        System.out.println("Dewi Nurul Mahardika / 16 / X RPL 6");
     
    }
   
    public void addPenumpang (double penumpang, double beratPenumpang){
        int temp =
        temp = (int) (double) (this.penumpang+penumpang) ;
        if (temp > maxPenumpang){
            System.out.println("Kapasitas Bus penuh");
        }
        else{
            this.penumpang = temp ;
            this.beratPenumpang+= beratPenumpang ;
        }
        
        
    }
    public void getPenumpang(int password) {
        if(password == 30) {
            System.out.println("Password Benar");
        }
        else{
            System.out.println("Password Salah");
        }
        
    }
 public void getAverage() {   
     System.out.println("Rata-Rata Berat = "+ this.beratPenumpang/this.penumpang);
    
 }
 public void cetak(){
     System.out.println("Jumlah Penumpang = " + this.penumpang);
     System.out.println("Kapasitas Bus =" + this.maxPenumpang);

 }
}

