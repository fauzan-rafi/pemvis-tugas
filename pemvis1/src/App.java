// author fauzan,khamim,dafa,inas

import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class App extends JFrame {

    //initiate componen
    private JPanel mainPanel,aPanel,bPanel,cPanel,dPanel,ePanel;
    private JButton kembaliButton,lanjutButton,aButton,bButton,cButton,dButton,eButton;
    private JLabel aPanelLabel,bLabelPanel,cLabelPanel,dLabelPanel,eLabelPanel,judulLabel;
    private JSeparator jSeparator;

    // function to set layout
    private void initComponents(){
        judulLabel = new JLabel();
        aButton = new JButton();
        bButton = new JButton();
        cButton = new JButton();
        dButton = new JButton();
        eButton = new JButton();
        jSeparator = new JSeparator();
        mainPanel = new JPanel();
        aPanel = new JPanel();
        aPanelLabel = new JLabel();
        bPanel = new JPanel();
        bLabelPanel = new JLabel();
        cPanel = new JPanel();
        cLabelPanel = new JLabel();
        dPanel = new JPanel();
        dLabelPanel = new JLabel();
        ePanel = new JPanel();
        eLabelPanel = new JLabel();
        lanjutButton = new JButton();
        kembaliButton = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("COntoh Swing Panel 1 Frame");

        judulLabel.setFont(new java.awt.Font("Ubuntu",1,15));
        judulLabel.setText("Contoh Swing Panel 1");

        // init component button
        aButton.setText("Panel A");
        aButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aButtonActionPerformed(evt);
            }
        });

        bButton.setText(">> Panel B");
        bButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bButtonActionPerformed(evt);
            }
        });

        cButton.setText(">> Panel C");
        cButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cButtonActionPerformed(evt);
            }
        });

        dButton.setText(">> Panel D");
        dButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dButtonActionPerformed(evt);
            }
        });

        eButton.setText(">> Panel E");
        eButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eButtonActionPerformed(evt);
            }
        });

        kembaliButton.setFont(new java.awt.Font("Ubuntu", 1, 15));
        kembaliButton.setText("<<");
        kembaliButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliButtonActionPerformed(evt);
            }
        });

        lanjutButton.setFont(new java.awt.Font("Ubuntu", 1, 15));
        lanjutButton.setText(">>");
        lanjutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lanjutButtonActionPerformed(evt);
            }
        });

        jSeparator.setBackground(new Color(247, 247, 247));

        mainPanel.setLayout(new CardLayout());

        aPanel.setBackground(new Color(240, 240, 240));
        aPanelLabel.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        aPanelLabel.setForeground(new java.awt.Color(255, 255, 255));
        aPanelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aPanelLabel.setText("Panel A");

        GroupLayout aPanelLayout = new GroupLayout(aPanel);
        // kalian lanjut mulai dari sini guys


        
    }

    // initiate array for store button,panel and color
    JPanel[] arrPanel;
    JButton[] arrButton;
    Color[] arrColor;
    
    int panelPilihan = 0;

    // function to store component into array
    private void setKomponen() {
        arrPanel = new JPanel[]{aPanel, bPanel, cPanel, dPanel, ePanel};
        arrButton = new JButton[]{aButton,bButton,cButton,dButton,eButton};
        arrColor = new Color[]{Color.RED, Color.ORANGE, Color.BLUE, Color.CYAN, Color.GREEN};  
    }

    // function to menampilkan panel
    private void setTampil() {
        // for looping to fill panel & button with color
        for(int i = 0; i < arrPanel.length; i++){
            // memberi warna semua button
            arrButton[i].setBackground(arrColor[i]);
            arrButton[i].setForeground(Color.WHITE);
            
            // condition to show panel & button
            if(i < panelPilihan){
                arrButton[i].setVisible(true);
                arrPanel[i].setVisible(false);
            } else if(i == panelPilihan){
                arrButton[i].setVisible(true);
                arrPanel[i].setBackground(arrColor[i]);
                arrPanel[i].setVisible(true);
            } else {
                arrButton[i].setVisible(false);
                arrPanel[i].setVisible(true);
            }
        }
        
        if (panelPilihan == 0){
            kembaliButton.setEnabled(false);
            lanjutButton.setEnabled(true);
        } else if(panelPilihan == arrPanel.length - 1){
            kembaliButton.setEnabled(true);
            lanjutButton.setEnabled(false);
        } else {
            kembaliButton.setEnabled(true);
            lanjutButton.setEnabled(true);
        }
    }


    // function button --------------------------------
    private void aButtonActionPerformed(java.awt.event.ActionEvent evt) {
        panelPilihan = 0;
        setTampil();
    }       

    private void bButtonActionPerformed(java.awt.event.ActionEvent evt) {
        panelPilihan = 1;
        setTampil();
    }

    private void cButtonActionPerformed(java.awt.event.ActionEvent evt) {
        panelPilihan = 2;
        setTampil();
    }

    private void dButtonActionPerformed(java.awt.event.ActionEvent evt) {
        panelPilihan = 3;
        setTampil();
    }

    private void eButtonActionPerformed(java.awt.event.ActionEvent evt) {
        panelPilihan = 4;
        setTampil();
    }

    private void kembaliButtonActionPerformed(java.awt.event.ActionEvent evt) {
        panelPilihan -= 1;
        setTampil();
    }

    private void lanjutButtonActionPerformed(java.awt.event.ActionEvent evt) {
        panelPilihan += 1;
        setTampil();
    }
    //----------------------------------------------

    public App() {
        
    }


    public static void main(String[] args) throws Exception {
        
    }
}
