package toggleButton.src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingToggleButton extends JFrame{
    private JToggleButton onOffToggleButton, iconToggleButton;
    private JLabel judulLabel;
    private JButton onOffButton;

    public SwingToggleButton() {
        initComponents();
    }

    public void initComponents() {
        //------------------------------------------------------
        setSize(600,550);
        // membuat judul
        setTitle("Tantangan JToggleButton");
        // close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        // mengatur layout di tengah
        setLocationRelativeTo(null);
        // mengatur warna
        // getContentPane().setBackground(new Color(243, 240, 215));
        setLayout(null);
        //---------------------------------------------------------

        judulLabel = new JLabel("Contoh Swing Toggle Button 1");
        // set font label judulLabel
        judulLabel.setFont(new Font("Ubuntu",1,20));
        judulLabel.setBounds(75,30,350,70); // mengatur posisi 
        add(judulLabel);

        onOffToggleButton = new JToggleButton("JToggleButton [OFF]");
        onOffToggleButton.setFont(new Font("Ubuntu",0,12));
        onOffToggleButton.setBounds(75,100,200,30);
        onOffToggleButton.setBackground(Color.black);
        onOffToggleButton.setForeground(Color.white);
        add(onOffToggleButton);
        
        onOffButton = new JButton("Button [OFF]");
        onOffButton.setFont(new Font("Ubuntu",0,12));
        onOffButton.setBounds(75,150,150,30);
        onOffButton.setBackground(Color.red);
        onOffButton.setForeground(Color.white);
        add(onOffButton);

        
        iconToggleButton = new JToggleButton();
        Icon icon = new ImageIcon(getClass().getResource("../gambar/icons8-mute-48.png"));
        iconToggleButton.setIcon(icon);
        iconToggleButton.setBounds(75,220,150,150);
        add(iconToggleButton);

        onOffToggleButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(onOffToggleButton.isSelected()){
                    onOffToggleButton.setBackground(Color.white);
                    onOffToggleButton.setForeground(Color.black);
                    onOffToggleButton.setFont(onOffToggleButton.getFont().deriveFont(Font.BOLD,14));
                    onOffToggleButton.setText("JToggleButton [ON]");
                }else{
                    onOffToggleButton.setBackground(Color.black);
                    onOffToggleButton.setForeground(Color.white);
                    onOffToggleButton.setFont(onOffToggleButton.getFont().deriveFont(Font.PLAIN,12));
                    onOffToggleButton.setText("JToggleButton [OFF]");
                }
            }
        });

        onOffButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(onOffButton.isSelected()){
                    System.out.println("JButton Dipilih");
                }else{
                    System.out.println("JButton tidak Dipilih");
                }
            }
        });

        iconToggleButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(iconToggleButton.isSelected()){
                    Icon icon = new ImageIcon(getClass().getResource("../gambar/icons8-sound-48.png"));
                    iconToggleButton.setIcon(icon);
                }else{
                    Icon icon = new ImageIcon(getClass().getResource("../gambar/icons8-mute-48.png"));
                    iconToggleButton.setIcon(icon);
                }
            }
        });

    }

    public static void main(String[] args) {
        SwingToggleButton app = new SwingToggleButton();
    }
}
