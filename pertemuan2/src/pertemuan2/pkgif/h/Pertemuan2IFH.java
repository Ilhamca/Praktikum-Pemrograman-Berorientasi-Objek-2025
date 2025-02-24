/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan2.pkgif.h;

import pertemuan2.pkgif.h.hewan.Hewan;
import pertemuan2.pkgif.h.hewan.Anjing;
import pertemuan2.pkgif.h.hewan.Kucing;
import pertemuan2.pkgif.h.kendaraan.Mobil;
import pertemuan2.pkgif.h.kendaraan.Motor;

/**
 *
 * @author PC PRAKTIKUM
 */
public class Pertemuan2IFH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Mobil mobil = new Mobil(4,4,4);
        System.out.println("Spesifikasi Mobil");
        System.out.println("Roda = "+mobil.getRoda());
        System.out.println("Pintu = "+mobil.getPintu());
        mobil.menyala();
        mobil.gas();
        
        Motor motor = new Motor(2,0,1);
        System.out.println("Spesifikasi Motor");
        System.out.println("Roda = "+motor.getRoda());
        System.out.println("Pintu = "+motor.getPintu());
        motor.menyala();
        motor.gas();
        
        
        Kucing kucing = new Kucing(4,1,"Oren");
        
        kucing.bergerak();
        kucing.bersuara();
        
        kucing.setKaki(1);
        System.out.println("kaki kucing = "+kucing.getKaki());
        
        Anjing anjing = new Anjing(4,1,"Doggo");
        
        anjing.setKaki(2);
        System.out.println("Kaki anjing = "+anjing.getKaki());
    }
    
}
