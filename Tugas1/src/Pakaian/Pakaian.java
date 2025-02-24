/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pakaian;

/**
 *
 * @author Iam
 */
public abstract class Pakaian {

    protected String name;
    protected int size;
    protected String brand;

    public Pakaian(String name, int size, String brand) {
        this.name = name;
        this.brand = brand;
        this.size = size;
    }

    public void informasiPakaian() {
        System.out.println("Nama Pakaian: " + name);
        System.out.println("Ukuran Pakaian: " + size);
        System.out.println("Brand Pakaian: " + brand);
    }
}
