/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2.pkgif.h.kendaraan;

/**
 *
 * @author PC PRAKTIKUM
 */
class Kendaraan {
    private int roda;
    private int pintu;
    
    public Kendaraan(int roda, int pintu){
        this.roda = roda;
        this.pintu = pintu;
    }
    
    public int getRoda(){
        return this.roda;
    }
    
    public int getPintu(){
        return this.pintu;
    }
    
    public void menyala(){
        System.out.println("Kendaraan Menyala");
    }
    
    public void gas(){
        System.out.println("Kendaraan Maju");
    }
}
