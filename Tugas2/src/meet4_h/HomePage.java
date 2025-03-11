/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meet4_h;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author PC PRAKTIKUM
 */
public class HomePage extends JFrame implements ActionListener{
    
    //GUI and Initialization

    JButton smallRoom = new JButton("Order Small Room");
    JButton largeRoom = new JButton("Order Large Room");
    
    //Harga Label
    JLabel hargaSmall = new JLabel("Rp. 200.000 Per Orang");
    JLabel hargaLarge = new JLabel("Rp. 350.000 Per Orang");
    
    
    HomePage(String username){
        //Gui for cross reference
        JLabel labelHomepage = new JLabel("WELCOME " + username + " TO HOMEPAGE");
                
        
        
        setVisible(true);
        setSize(720, 480);
        setTitle("Home Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setLayout(null);
        
        add(labelHomepage);
        labelHomepage.setBounds(200, 40, 200, 100);
        
        //Smallroom & Price
        add(smallRoom);
        smallRoom.setBounds(50, 220, 200, 32);
        add(hargaSmall);
        hargaSmall.setBounds(90,260,150,20);
        
        //LargeRoom & price
        add(largeRoom);
        largeRoom.setBounds(300, 220, 200, 32);
        add(hargaLarge);
        hargaLarge.setBounds(340,260,150,20);
        
        smallRoom.addActionListener(this);
        largeRoom.addActionListener(this);
    }
    
@Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == smallRoom) {
                //code yang dijalankan jika click tombol button
                String roomName = "Ordered Small Room for Rp. 200.000";
                new BookingPage(1);
                this.dispose();

            } else if (e.getSource() == largeRoom){
                //code yang dijalankan jika click tombol button
                String roomName = "Ordered Large Room for Rp. 350.000";

                new BookingPage(2);
                this.dispose();
            }

        } catch (Exception error) {

        }
    }

}
