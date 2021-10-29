package passwordField.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingPasswordField extends JFrame {
    private JPasswordField aPasswordField, bPasswordField, cPasswordField;
    private JLabel passwordFieldLabel, jLabel1, jLabel2, jLabel3;
    private JToggleButton passwordAToggleButton, passwordBToggleButton, passwordCToggleButton;

    public SwingPasswordField() {
        initComponents();
    }

    public void initComponents() {
        // ------------------------------------------------------
        setSize(800, 600);
        // membuat judul
        setTitle("Tantangan JPasswordField");
        // close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        // mengatur layout di tengah
        setLocationRelativeTo(null);
        // mengatur warna
        // getContentPane().setBackground(new Color(243, 240, 215));
        setLayout(null);
        // ---------------------------------------------------------

        passwordFieldLabel = new JLabel("Contoh Password Field 1");
        // set font label judulLabel
        passwordFieldLabel.setFont(new Font("Ubuntu", 1, 20));
        passwordFieldLabel.setBounds(75, 30, 350, 70); // mengatur posisi
        add(passwordFieldLabel);
        // ----------------------------------------------------------

        jLabel1 = new JLabel("Password A");
        // set font label judulLabel
        jLabel1.setFont(new Font("Ubuntu", 1, 14));
        jLabel1.setBounds(75, 150, 200, 30); // mengatur posisi
        add(jLabel1);
        // ----------------------------------------------------------

        jLabel2 = new JLabel("Password B");
        // set font label judulLabel
        jLabel2.setFont(new Font("Ubuntu", 1, 14));
        jLabel2.setBounds(75, 250, 200, 30); // mengatur posisi
        add(jLabel2);
        // ----------------------------------------------------------

        jLabel3 = new JLabel("Password C");
        // set font label judulLabel
        jLabel3.setFont(new Font("Ubuntu", 1, 14));
        jLabel3.setBounds(75, 350, 200, 30); // mengatur posisi
        add(jLabel3);
        // ----------------------------------------------------------

        aPasswordField = new JPasswordField();
        aPasswordField.setFont(new Font("Ubuntu", 1, 14));
        aPasswordField.setBounds(200, 150, 200, 30); // mengatur posisi
        add(aPasswordField);

        bPasswordField = new JPasswordField();
        bPasswordField.setEchoChar('\u25cf');
        bPasswordField.setFont(new Font("Ubuntu", 1, 14));
        bPasswordField.setBounds(200, 250, 200, 30); // mengatur posisi
        add(bPasswordField);

        cPasswordField = new JPasswordField();
        cPasswordField.setEchoChar('#');
        cPasswordField.setFont(new Font("Ubuntu", 1, 14));
        cPasswordField.setBounds(200, 350, 200, 30); // mengatur posisi
        add(cPasswordField);

        Icon icon = new ImageIcon(getClass().getResource("../gambar/icons8-blind-60.png"));

        passwordAToggleButton = new JToggleButton();
        passwordAToggleButton.setIcon(icon);
        passwordAToggleButton.setBounds(450, 125, 80, 80);
        add(passwordAToggleButton);

        passwordBToggleButton = new JToggleButton();
        passwordBToggleButton.setIcon(icon);
        passwordBToggleButton.setBounds(450, 225, 80, 80);
        add(passwordBToggleButton);

        passwordCToggleButton = new JToggleButton();
        passwordCToggleButton.setIcon(icon);
        passwordCToggleButton.setBounds(450, 325, 80, 80);
        add(passwordCToggleButton);

        passwordAToggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (passwordAToggleButton.isSelected()) {
                    aPasswordField.setEchoChar((char) 0);
                    Icon iconBlind = new ImageIcon(getClass().getResource("../gambar/icons8-blind-60.png"));
                    passwordAToggleButton.setIcon(iconBlind);
                } else {
                    aPasswordField.setEchoChar('*');
                    Icon iconEye = new ImageIcon(getClass().getResource("../gambar/icons8-eye-60.png"));
                    passwordAToggleButton.setIcon(iconEye);
                }
            }
        });

        passwordBToggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (passwordBToggleButton.isSelected()) {
                    bPasswordField.setEchoChar('\u0000');
                    Icon iconBlind = new ImageIcon(getClass().getResource("../gambar/icons8-blind-60.png"));
                    passwordBToggleButton.setIcon(iconBlind);
                } else {
                    bPasswordField.setEchoChar('\u25cf');
                    Icon iconEye = new ImageIcon(getClass().getResource("../gambar/icons8-eye-60.png"));
                    passwordBToggleButton.setIcon(iconEye);
                }
            }
        });

        passwordCToggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (passwordCToggleButton.isSelected()) {
                    cPasswordField.setEchoChar('\u0000');
                    Icon iconBlind = new ImageIcon(getClass().getResource("../gambar/icons8-blind-60.png"));
                    passwordCToggleButton.setIcon(iconBlind);
                } else {
                    cPasswordField.setEchoChar('#');
                    Icon iconEye = new ImageIcon(getClass().getResource("../gambar/icons8-eye-60.png"));
                    passwordCToggleButton.setIcon(iconEye);
                }
            }
        });

    }

    public static void main(String[] args) {
        SwingPasswordField app = new SwingPasswordField();
    }
}
