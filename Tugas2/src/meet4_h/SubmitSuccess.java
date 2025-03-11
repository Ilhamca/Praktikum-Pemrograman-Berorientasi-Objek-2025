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
public class SubmitSuccess extends JFrame implements ActionListener, RoomAbstract {

    //GUI and Initialization
    JLabel labelHomepage = new JLabel("Successfully Booked!");
    JButton smallRoom = new JButton("Login Page");

    private JLabel namaField, lamaMenginapField, genderField, jumlahOrangBox, hargaField;

    //Harga Label
    SubmitSuccess(String room, String nama, String gender, int people, int duration, int price) {
        //totalPrice
        int totalPrice = duration * price;

        //Initilazitaion for information crossover or something idk how to call it
        namaField = new JLabel("Nama : " + nama);
        genderField = new JLabel("Gender : " + gender);
        jumlahOrangBox = new JLabel("How Many People : " + people);
        lamaMenginapField = new JLabel("Duration : " + duration);
        hargaField = new JLabel("Harga : " + totalPrice);

        //JLabel labelInformation = new JLabel("Nama: " + nama + ", Gender: " + gender + ", Total Harga: Rp " + totalHarga);
        //Boring stuff
        setVisible(true);
        setSize(720, 480);
        setTitle("Success");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setLayout(null);


        add(labelHomepage);
        labelHomepage.setBounds(200, 40, 200, 40);

        //Information about the payment
        add(namaField);
        namaField.setBounds(200, 80, 200, 40);
        add(genderField);
        genderField.setBounds(200, 120, 200, 40);
        add(jumlahOrangBox);
        jumlahOrangBox.setBounds(200, 160, 200, 40);
        add(lamaMenginapField);
        lamaMenginapField.setBounds(200, 200, 200, 40);
        add(hargaField);
        hargaField.setBounds(200, 240, 200, 40);

        //Back to Login page, not bothered to change name
        add(smallRoom);
        smallRoom.setBounds(50, 320, 200, 32);
        smallRoom.addActionListener(this);

    }
//    @Override
//    public void actionPerformed(ActionEvent e) {
//            String nama = getNama();
//            String gender = maleButton.isSelected() ? "Laki-laki" : femaleButton.isSelected() ? "Perempuan" : "";
//            int jumlahOrang = Integer.parseInt((String) jumlahOrangBox.getSelectedItem());
//            int lamaMenginap;
//            
//            try {
//                lamaMenginap = Integer.parseInt(lamaMenginapField.getText());
//                if (lamaMenginap <= 0) throw new NumberFormatException();
//            } catch (NumberFormatException ex) {
//                resultLabel.setText("Format Lama menginap Salah!");
//                return;
//            }
//            
//            int harga = typeRoom.equals("small") ? 250000 : 5000;
//            int totalHarga = harga * lamaMenginap;
//            
//            resultLabel.setText("Nama: " + nama + ", Gender: " + gender + ", Total Harga: Rp " + totalHarga);
//        }
//    }

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

    @Override
    public void setNama(String nama) {
        namaField.setText(nama);
    }

    @Override
    public String getNama() {
        return namaField.getText();
    }

    @Override
    public void setJenisKelamin(String jenisKelamin) {
        genderField.setText(jenisKelamin);
    }

    @Override
    public String getJenisKelamin() {
        return genderField.getText();
    }

    @Override
    public void setJumlahOrang(String jumlah) {
        jumlahOrangBox.setText(jumlah);
    }

    @Override
    public int getJumlahOrang() {
        return Integer.parseInt(jumlahOrangBox.getText());
    }

    @Override
    public void setLamaMenginap(int hari) {
        lamaMenginapField.setText(String.valueOf(hari));
    }

    @Override
    public int getLamaMenginap() {
        return Integer.parseInt(lamaMenginapField.getText());
    }
}
