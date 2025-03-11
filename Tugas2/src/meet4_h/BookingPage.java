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
public class BookingPage extends JFrame implements ActionListener {

    //instansiasi GUI COMPONENT
    //Roomname
    JLabel room = new JLabel("");
    JLabel price = new JLabel("");
    JLabel roomInformation = new JLabel("");

    //Text Nama
    JLabel tulisan = new JLabel("Booking Page");
    JLabel nameLabel = new JLabel("Name : ");
    JTextField usernameTextField = new JTextField();

    //Radio Gender
    JLabel chooseGender = new JLabel("Gender : ");
    ButtonGroup pilihGender = new ButtonGroup();
    JRadioButton pilihMale = new JRadioButton("Male");
    JRadioButton pilihFemale = new JRadioButton("Female");

    //Dropdown Guest
    JLabel chooseGuest = new JLabel("Guest : ");
    String[] guest = {
        "-",
        "1",
        "2",
        "3",
        "4"
    };
    JComboBox pilihanGuest = new JComboBox(guest);

    //int Duration
    JLabel durationLabel = new JLabel("Length of stay (In Days) : ");
    JTextField durationTextField = new JTextField();

    JButton loginButton = new JButton("Book");
    JButton resetButton = new JButton("Reset");

    public BookingPage(int roomName) {
        //setting frame
        setVisible(true);
        setSize(720, 480);
        setTitle("Booking Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setLayout(null);

        //add GUI COMPONENT to frame
        //Roomtitle info
        add(room);
        add(price);
        add(roomInformation);
        switch (roomName) {
            case 1:
                room.setText("Small Room");
                price.setText("200000");
                roomInformation.setText("Small Room for Rp 200.000");
                break;
            case 2:
                room.setText("Big Room");
                price.setText("350000");
                roomInformation.setText("Small Room for Rp 350.000");
                break;
            default:

        }
        roomInformation.setBounds(160, 5, 300, 24);

        //Login Username
        add(tulisan);
        add(nameLabel);
        add(usernameTextField);

        tulisan.setBounds(210, 20, 150, 24);
        nameLabel.setBounds(20, 84, 440, 12);

        usernameTextField.setBounds(18, 100, 440, 32);

        //mengelompokkan radio button menjadi satu GROUP,
        add(chooseGender);
        chooseGender.setBounds(20, 150, 128, 12);

        pilihGender.add(pilihMale);
        pilihGender.add(pilihFemale);
        //x, y, xsize, ysizze
        add(pilihMale);
        pilihMale.setBounds(120, 174, 128, 12);
        add(pilihFemale);
        pilihFemale.setBounds(300, 174, 128, 12);
        pilihGender.clearSelection();

        //Dropdown Guest
        add(chooseGuest);
        chooseGuest.setBounds(20, 220, 100, 40);
        add(pilihanGuest);
        pilihanGuest.setBounds(75, 220, 100, 40);

        //Length of stay text field
        add(durationLabel);
        durationLabel.setBounds(20, 270, 200, 40);
        add(durationTextField);
        durationTextField.setBounds(20, 300, 100, 20);

        //Register or Reset Button
        add(loginButton);
        add(resetButton);
        loginButton.setBounds(50, 350, 200, 32);
        resetButton.setBounds(300, 350, 200, 32);
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == loginButton) {
                // Check if username is empty
                if (usernameTextField.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Name field cannot be empty.", "Input Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                // Check if radio has been ticked on
                if (!pilihMale.isSelected() && !pilihFemale.isSelected()) {
                    JOptionPane.showMessageDialog(this, "Please select a gender.", "Input Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Check if dropdown has been chosen
                if (pilihanGuest.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(this, "Please select the number of guests.", "Input Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Check if duration is a valid integer
                try {
                    int duration = Integer.parseInt(durationTextField.getText().trim());
                    if (duration <= 0) {
                        JOptionPane.showMessageDialog(this, "Duration must be a positive integer.", "Input Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Please enter a valid integer for duration.", "Input Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Code to proceed with booking if inputs are valid
                String roomTitle = room.getText();
                String username = usernameTextField.getText().trim();

                String gender = null;
                if (pilihMale.isSelected()) {
                    gender = "Male";
                } else if (pilihFemale.isSelected()) {
                    gender = "Female";
                }

                int people = pilihanGuest.getSelectedIndex();
                int duration = Integer.parseInt(durationTextField.getText().trim());
                int priceRoom = Integer.parseInt(price.getText().trim());
                //sendit
                new SubmitSuccess(roomTitle, username, gender, people, priceRoom, duration);
                this.dispose();
            } else if (e.getSource() == resetButton) {
                //kode yang dijalankan jika tombol reset di click
                usernameTextField.setText("");
                pilihanGuest.setSelectedIndex(0);
                pilihGender.clearSelection();
                durationTextField.setText("");

            }

        } catch (Exception error) {
            error.printStackTrace();
        }
    }
}
