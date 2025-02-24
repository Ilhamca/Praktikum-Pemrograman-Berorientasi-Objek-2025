/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2.pkgif.h.kendaraan;

/**
 *
 * @author PC PRAKTIKUM
 */
public class Motor extends Kendaraan {
    
    private int tempatDuduk;
    
    public Motor(int roda, int pintu, int tempatDuduk) {
        super(roda, pintu);
        this.tempatDuduk = tempatDuduk;
    }
    
}
