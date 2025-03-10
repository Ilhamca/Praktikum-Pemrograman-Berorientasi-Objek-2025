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
public class SubmitSuccess extends JFrame implements ActionListener{
    
    //GUI and Initialization
    JLabel labelHomepage = new JLabel("Successfully Booked!");
    JButton smallRoom = new JButton("Login Page");

    
    //Harga Label


    
    
    SubmitSuccess(){
        setVisible(true);
        setSize(720, 480);
        setTitle("Success");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setLayout(null);
        
        add(labelHomepage);
        labelHomepage.setBounds(200, 40, 200, 100);
        
        //Smallroom & Price
        add(smallRoom);
        smallRoom.setBounds(50, 220, 200, 32);
        

        
        smallRoom.addActionListener(this);
    }
    
@Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == smallRoom) {
                //code yang dijalankan jika click tombol button
                new LoginPage();
                this.dispose();

            }

        } catch (Exception error) {

        }
    }

}
