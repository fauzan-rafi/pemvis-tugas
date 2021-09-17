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

    public App() {
        initComponents();
        // setTampil();
        setKomponen();
    }

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

        // init component & function button
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
        // ---------------

        jSeparator.setBackground(new Color(247, 247, 247));

        mainPanel.setLayout(new CardLayout());

        aPanel.setBackground(new Color(240, 240, 240));
        aPanelLabel.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        aPanelLabel.setForeground(new java.awt.Color(255, 255, 255));
        aPanelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aPanelLabel.setText("Panel A");

        // memasukan layout panel a menjadi bagian dari grouplayout
        GroupLayout aPanelLayout = new GroupLayout(aPanel);
        aPanel.setLayout(aPanelLayout);
        aPanelLayout.setHorizontalGroup(
            aPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING).
            addGroup(aPanelLayout.createSequentialGroup()
            .addGap(247, 247, 247)
            .addComponent(aPanelLabel)
            .addContainerGap(399, Short.MAX_VALUE))
        );
        aPanelLayout.setVerticalGroup(
            aPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING).
            addGroup(aPanelLayout.createSequentialGroup()
            .addGap(144, 144, 144)
            .addComponent(aPanelLabel)
            .addContainerGap(192, Short.MAX_VALUE))
        );
        // ---------------------------------------
        
        // memasukan layout panel b menjadi bagian dari grouplayout

        mainPanel.add(aPanel, "card2");

        bPanel.setBackground(new Color(240, 240, 240));
        bLabelPanel.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        bLabelPanel.setForeground(new java.awt.Color(000, 000, 000));
        bLabelPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bLabelPanel.setText("Panel B");

        GroupLayout bPaneLayout = new GroupLayout(bPanel);
        bPanel.setLayout(bPaneLayout);
        bPaneLayout.setHorizontalGroup(
            bPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING).
            addGroup(bPaneLayout.createSequentialGroup()
            .addGap(249, 249, 249)
            .addComponent(bLabelPanel)
            .addContainerGap(398, Short.MAX_VALUE))
        );
        bPaneLayout.setVerticalGroup(
            bPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING).
            addGroup(bPaneLayout.createSequentialGroup()
            .addGap(147, 147, 147)
            .addComponent(bLabelPanel)
            .addContainerGap(189, Short.MAX_VALUE))
        );

        mainPanel.add(bPanel, "card3");
        // --------------------------------------------------------


        // memasukan layout panel c menjadi bagian dari grouplayout


        cPanel.setBackground(new Color(240, 240, 240));
        cLabelPanel.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        cLabelPanel.setForeground(new java.awt.Color(0, 0, 0));
        cLabelPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cLabelPanel.setText("Panel C");

        
        mainPanel.add(cPanel, "card4");

        GroupLayout cPanelLayout = new GroupLayout(cPanel);
        cPanel.setLayout(cPanelLayout);
        cPanelLayout.setHorizontalGroup(
            cPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING).
            addGroup(cPanelLayout.createSequentialGroup()
            .addGap(229, 229, 229)
            .addComponent(cLabelPanel)
            .addContainerGap(418, Short.MAX_VALUE))
        );
        cPanelLayout.setVerticalGroup(
            cPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING).
            addGroup(cPanelLayout.createSequentialGroup()
            .addGap(144, 144, 144)
            .addComponent(cLabelPanel)
            .addContainerGap(192, Short.MAX_VALUE))
        );

        // --------------------------------------------------------

        // memasukan layout panel d menjadi bagian dari grouplayout
        dPanel.setBackground(new Color(240, 240, 240));
        dLabelPanel.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        dLabelPanel.setForeground(new java.awt.Color(0, 0, 0));
        dLabelPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dLabelPanel.setText("Panel D");

        mainPanel.add(dPanel, "card5");

        GroupLayout dPanelLayout = new GroupLayout(dPanel);
        dPanel.setLayout(dPanelLayout);
        dPanelLayout.setHorizontalGroup(
            dPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING).
            addGroup(dPanelLayout.createSequentialGroup()
            .addGap(259, 259, 259)
            .addComponent(dLabelPanel)
            .addContainerGap(386, Short.MAX_VALUE))
        );
        dPanelLayout.setVerticalGroup(
            dPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING).
            addGroup(dPanelLayout.createSequentialGroup()
            .addGap(142, 142, 142)
            .addComponent(dLabelPanel)
            .addContainerGap(194, Short.MAX_VALUE))
        );
        // --------------------------------------------------------

        // memasukan layout panel e menjadi bagian dari grouplayout
        ePanel.setBackground(new Color(240, 240, 240));
        eLabelPanel.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        eLabelPanel.setForeground(new java.awt.Color(0, 0, 0));
        eLabelPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eLabelPanel.setText("Panel E");

        mainPanel.add(ePanel, "card6");

        GroupLayout ePanelLayout = new GroupLayout(ePanel);
        ePanel.setLayout(ePanelLayout);
        ePanelLayout.setHorizontalGroup(
            ePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING).
            addGroup(ePanelLayout.createSequentialGroup()
            .addGap(282, 282, 282)
            .addComponent(eLabelPanel)
            .addContainerGap(366, Short.MAX_VALUE))
        );
        ePanelLayout.setVerticalGroup(
            ePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING).
            addGroup(ePanelLayout.createSequentialGroup()
            .addGap(132, 132, 132)
            .addComponent(eLabelPanel)
            .addContainerGap(204, Short.MAX_VALUE))
        );
        // --------------------------------------------------------

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kembaliButton, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(lanjutButton, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator)
                            .addComponent(judulLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(aButton, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(bButton)
                                .addGap(31, 31, 31)
                                .addComponent(cButton)
                                .addGap(33, 33, 33)
                                .addComponent(dButton)
                                .addGap(37, 37, 37)
                                .addComponent(eButton)))))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judulLabel)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(aButton)
                    .addComponent(cButton)
                    .addComponent(dButton)
                    .addComponent(eButton)
                    .addComponent(bButton))
                .addGap(18, 18, 18)
                .addComponent(jSeparator, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lanjutButton)
                    .addComponent(kembaliButton))
                .addGap(25, 25, 25))
        );

        pack();
        
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
    private void setTampil(){
        for(int i = 0; i < arrPanel.length; i++){
            // memberi warna semua button
            arrButton[i].setBackground(arrColor[i]);
            arrButton[i].setForeground(Color.WHITE);
            
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

    


    public static void main(String[] args) throws Exception {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run() {
                new App().setVisible(true);
            }
        });
    }
}
