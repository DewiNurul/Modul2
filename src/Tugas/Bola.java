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
public class Bola {
private double jariJari;
private double diameter;
private double luasPermukaan ;
private double volume ;

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getDiameter() {
        diameter = 2*this.jariJari;
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getLuasPermukaan() {
        luasPermukaan = Math.PI*this.jariJari*this.jariJari ;
        return luasPermukaan;
    }

    public void setLuasPermukaan(double luasPermukaan) {
        this.luasPermukaan = luasPermukaan;
    }

    public double getVolume() {
        volume = 4/3*this.jariJari*this.jariJari*this.jariJari ;
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }


    
}

      
      
        
        
    