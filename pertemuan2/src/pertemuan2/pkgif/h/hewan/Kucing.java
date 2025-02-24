/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2.pkgif.h.hewan;

/**
 *
 * @author PC PRAKTIKUM
 */
public class Kucing extends Hewan {
    
    public Kucing(int kaki, int mulut, String nama) {
        super(kaki, mulut, nama);
    }
    
    public void bergerak(){
        System.out.println("Kucing "+super.getNama()+" bergerak");
    }
    
    public void bersuara(){
        System.out.println("meong");
    }
    
}
