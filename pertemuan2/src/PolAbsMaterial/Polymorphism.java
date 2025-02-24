/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PolAbsMaterial;

class AlatElektronik{
    void nyalakan(){
        System.out.println("Alat elektronik dinyalakan...");
    }
}

class TV extends AlatElektronik{
    @Override
    void nyalakan(){
        System.out.println("TV dinyalakan...");
    }
}

class AC extends AlatElektronik{
    @Override
    void nyalakan(){
        System.out.println("AC dinyalakan dan mulai mendinginkan ruangan...");
    }
}

class Kalkulator{
    int tambah(int a, int b){
       return a+b;
    }
    
    int tambah(int a, int b, int c){
        return a+b+c;
    }
    
    float tambah(float a, float b){
        return a+b;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
     TV alat1 = new TV();
     AlatElektronik alat2 = new AC();
     alat2 = new TV();
//     alat1 = new AC();
     alat1.nyalakan();
     alat2.nyalakan();
     
    Kalkulator k = new Kalkulator();
    System.out.println("\nNilai 1: "+k.tambah(1.5F, 1.2F));
    System.out.println("Nilai 2: "+k.tambah(1, 3));
    System.out.println("Nilai 3: "+k.tambah(1, 3, 4));
   

    }
}