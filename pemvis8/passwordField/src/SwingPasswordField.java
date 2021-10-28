package passwordField.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingPasswordField extends JFrame{
    private JPasswordField aPasswordField, bPasswordField, cPasswordField;
    private JLabel passwordFieldLabel, jLabel1, jLabel2, jLabel3;
    private JToggleButton passwordAToggleButton, passwordBToggleButton, passwordCToggleButton;

    public SwingPasswordField() {
        initComponents();
    }

    public void initComponents() {
        //------------------------------------------------------
        setSize(700,600);
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
        //---------------------------------------------------------

        passwordFieldLabel = new JLabel("Contoh Password Field 1");
        // set font label judulLabel
        passwordFieldLabel.setFont(new Font("Ubuntu",1,20));
        passwordFieldLabel.setBounds(75,30,350,70); // mengatur posisi 
        add(passwordFieldLabel);
        // ----------------------------------------------------------

        jLabel1 = new JLabel("Password A");
        // set font label judulLabel
        jLabel1.setFont(new Font("Ubuntu",1,14));
        jLabel1.setBounds(75,125,200,30); // mengatur posisi 
        add(jLabel1);
        // ----------------------------------------------------------

        jLabel2 = new JLabel("Password B");
        // set font label judulLabel
        jLabel2.setFont(new Font("Ubuntu",1,14));
        jLabel2.setBounds(75,225,200,30); // mengatur posisi 
        add(jLabel2);
        // ----------------------------------------------------------

        jLabel3 = new JLabel("Password C");
        // set font label judulLabel
        jLabel3.setFont(new Font("Ubuntu",1,14));
        jLabel3.setBounds(75,325,200,30); // mengatur posisi 
        add(jLabel3);
        // ----------------------------------------------------------

        aPasswordField = new JPasswordField();
        aPasswordField.setFont(new Font("Ubuntu",1,14));
        aPasswordField.setBounds(200,125,200,30); // mengatur posisi 
        add(aPasswordField);

        bPasswordField = new JPasswordField();
        bPasswordField.setEchoChar('\u25cf');
        bPasswordField.setFont(new Font("Ubuntu",1,14));
        bPasswordField.setBounds(200,225,200,30); // mengatur posisi 
        add(bPasswordField);

        cPasswordField = new JPasswordField();
        cPasswordField.setEchoChar('#');
        cPasswordField.setFont(new Font("Ubuntu",1,14));
        cPasswordField.setBounds(200,325,200,30); // mengatur posisi 
        add(cPasswordField);

        passwordAToggleButton = new JToggleButton();
        passwordAToggleButton.setIcon(new ImageIcon(getClass().getResource("../gambar/icons8-mute-48.png")));
        passwordAToggleButton.setBounds(300,125,50,50);
        add(passwordAToggleButton);

        passwordBToggleButton = new JToggleButton();
        passwordBToggleButton.setIcon(new ImageIcon(getClass().getResource("../gambar/icons8-mute-48.png")));
        passwordBToggleButton.setBounds(300,225,50,50);
        add(passwordBToggleButton);

        passwordCToggleButton = new JToggleButton();
        passwordCToggleButton.setIcon(new ImageIcon(getClass().getResource("../gambar/icons8-mute-48.png")));
        passwordCToggleButton.setBounds(300,325,50,50);
        add(passwordCToggleButton);

        passwordAToggleButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(passwordAToggleButton.isSelected()){
                    aPasswordField.setEchoChar((char) 0);
                    passwordAToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icons8-blind-60.png")));
                }else{
                    aPasswordField.setEchoChar('*');
                    passwordAToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icons8-eye-60.png")));
                }
            }
        });

        passwordBToggleButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(passwordBToggleButton.isSelected()){
                    bPasswordField.setEchoChar('\u0000');
                    passwordBToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icons8-blind-60.png")));
                }else{
                    bPasswordField.setEchoChar('\u25cf');
                    passwordBToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icons8-eye-60.png")));
                }
            }
        });

        passwordCToggleButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(passwordCToggleButton.isSelected()){
                    cPasswordField.setEchoChar('\u0000');
                    passwordCToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icons8-blind-60.png")));
                }else{
                    cPasswordField.setEchoChar('#');
                    passwordCToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icons8-eye-60.png")));
                }
            }
        });
        




    }

    public static void main(String[] args) {
        SwingPasswordField app = new SwingPasswordField();
    }
}
