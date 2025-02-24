/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;
import Pakaian.Pakaian;
import Pakaian.Cloth;
import Pakaian.Shirt;
import Pakaian.Tshirt;
import Pakaian.Jacket;

/**
 *
 * @author Iam
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */

    
    public static void main(String[] args) {
        Shirt shirt = new Shirt("Baju Tengkorak", 32, "Adodas","Cotton");
        Tshirt tshirt = new Tshirt("Kaos Putih", 35, "Evada", "Fabric");
        Jacket jacket = new Jacket("Coklat Coat", 37, "Naiki", "Wool");
        shirt.informasiPakaian();
        System.out.println("");
        tshirt.informasiPakaian();
        System.out.println("");
        jacket.informasiPakaian();
//        Cloth shirtCloth = new Shirt("Baju Tengkorak", 32, "Adodas");
//        System.out.println("Tipe kain: " + shirtCloth.clothType());
//        System.out.println("Ketebalan Kain: " + shirtCloth.thickness());
//        System.out.println("Lama Ketahanan Kain (Dalam Bulan): " + shirtCloth.durability());
        
    }
    
}
