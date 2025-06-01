/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import View.Buku.View;
import Controller.ControllerBuku;
/**
 *
 * @author Iam
 */
public class PerpustakaanDigital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        View view = new View();
        ControllerBuku controller = new ControllerBuku(view);
        view.setVisible(true);
    }
}
