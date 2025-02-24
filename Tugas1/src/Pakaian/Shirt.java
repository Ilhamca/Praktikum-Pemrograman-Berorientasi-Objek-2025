/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pakaian;

/**
 *
 * @author Iam
 */
public class Shirt extends Pakaian implements Cloth {

//    @Override
//    public String clothType() {
//        return "Fabric";
//    }
    String clothType;

    @Override
    public double thickness() {
        return 35;
    }

    @Override
    public int durability() {
        return 60;
    }

    public Shirt(String name, int size, String brand, String clothType) {
        super(name, size, brand);
        this.clothType = clothType;
    }

    @Override // Dibutuhkan Override dari superclass untuk polymorphism
    public void informasiPakaian() {
        double thickness = thickness();
        int durability = durability();
        
        System.out.println("Nama Shirt: " + name);
        System.out.println("Ukuran Shirt: " + size);
        System.out.println("Brand Shirt: " + brand);
        System.out.println("Cloth type : " + clothType);
        System.out.println("Cloth Thickness (In MM) : " + thickness);
        System.out.println("Cloth Durability (In Month) : " + durability);
    }
}
