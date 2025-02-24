/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2.pkgif.h.kendaraan;

/**
 *
 * @author PC PRAKTIKUM
 */
public class Mobil extends Kendaraan{
    
    private int jendela;
    
    public Mobil(int roda, int pintu, int jendela) {
        super(roda, pintu);
        this.jendela = jendela;
    }
    
}
