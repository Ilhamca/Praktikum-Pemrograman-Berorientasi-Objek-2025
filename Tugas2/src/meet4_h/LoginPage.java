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
public class LoginPage extends JFrame implements ActionListener {

    //instansiasi GUI COMPONENT
    JLabel tulisan = new JLabel("LOGIN PAGE");
    JLabel usernameLabel = new JLabel("Username : ");
    JLabel passwordLabel = new JLabel("Password : ");
    JTextField usernameTextField = new JTextField();
    JPasswordField passTextField = new JPasswordField();

    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");

    LoginPage() {
        //setting frame
        setVisible(true);
        setSize(720, 480);
        setTitle("Title: Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setLayout(null);

        //add GUI COMPONENT to frame
        add(tulisan);
        add(usernameLabel);
        add(passwordLabel);
        add(usernameTextField);
        add(passTextField);
        add(loginButton);
        add(resetButton);

        tulisan.setBounds(210, 20, 150, 24);
        usernameLabel.setBounds(20, 84, 440, 12);
        passwordLabel.setBounds(20, 152, 440, 12);
        usernameTextField.setBounds(18, 100, 440, 32);
        passTextField.setBounds(18, 170, 440, 32);
        loginButton.setBounds(50, 220, 200, 32);
        resetButton.setBounds(300, 220, 200, 32);

        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == loginButton) {
                //code yang dijalankan jika click tombol button
                String username = usernameTextField.getText();
                char[] passChar = passTextField.getPassword();
                String password = new String(passChar);

                if (username.equals("adm") && password.equals("adm")) {
                    System.out.println("Login Success");
                    new HomePage(username);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Wrong Username or Pass");
                }
            } else if (e.getSource() == resetButton){
                //kode yang dijalankan jika tombol reset di click
                usernameTextField.setText("");
                passTextField.setText("");
            }

        } catch (Exception error) {

        }
    }

}
