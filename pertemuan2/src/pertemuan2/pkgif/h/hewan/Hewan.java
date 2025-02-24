/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2.pkgif.h.hewan;

/**
 *
 * @author PC PRAKTIKUM
 */
public class Hewan { // Kelas Orang Tua atau Superclass
    private int kaki;
    private int mulut;
    private String nama;

    public Hewan(int kaki, int mulut, String nama) {
        this.kaki = kaki;
        this.mulut = mulut;
        this.nama = nama;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public void setKaki(int kaki){
        if(kaki <4){
            System.out.println("Nilai kaki harus lebih dari 4");
        }else{
            this.kaki = kaki;
        }
    }
    
    public int getKaki(){
        return this.kaki;
    }
    
    public void bergerak(){
        System.out.println(nama+"Bergerak");
    }
    
    public void bersuara(){
        System.out.println(nama+" Bersuara");
    }
}
