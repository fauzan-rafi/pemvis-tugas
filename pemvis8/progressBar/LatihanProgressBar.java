package progressBar;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
// package latihan;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import javax.swing.Painter;
import javax.swing.Timer;
import javax.swing.UIDefaults;

/**
 *
 * @author gummlas
 */
public class LatihanProgressBar extends javax.swing.JFrame {

    /**
     * Creates new form LatihanProgressBar
     */
    public LatihanProgressBar() {
        initComponents();
        setDefaultTampilanAwal();
        jalankanProgressBarA();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        aProgressBar = new javax.swing.JProgressBar();
        mulaiButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Swing Progress Bar Frame");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel1.setText("Swing Progress Bar");

        aProgressBar.setStringPainted(true);

        mulaiButton.setText("Mulai");
        mulaiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulaiButtonActionPerformed(evt);
            }
        });

        resetButton.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mulaiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(117, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(aProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(mulaiButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(resetButton)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>                        

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        setDefaultTampilanAwal();
    }                                           

    private void mulaiButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        jalankanProgressBarA();
    }                                           

    public void setDefaultTampilanAwal(){
        aProgressBar.setValue(0);
        mulaiButton.setVisible(true);
        resetButton.setVisible(false);
    }
    
    public void jalankanProgressBarA(){
        uiDef = new UIDefaults();
        uiDef.put("ProgressBar[enabled].foregroundPainter", new ProgressBarPainter(Color.RED));
        
        aProgressBar.putClientProperty("Nimbus.Overrides.InheritDefaults", true);
        aProgressBar.putClientProperty("Nimbus.Overrides", true);
        
        timer = new Timer(100, (ActionEvent e) -> {
            aProgressBar.setValue(aProgressBar.getValue() + 1);
            mulaiButton.setVisible(false);

            switch(aProgressBar.getValue()){
                case 25:
                    mulaiButton.setVisible(false);

                    uiDef = new UIDefaults();
                    uiDef.put("ProgressBar[enabled].foregroundPainter", new ProgressBarPainter(Color.YELLOW));

                    aProgressBar.putClientProperty("Nimbus.Overrides.InheritDefaults", true);
                    aProgressBar.putClientProperty("Nimbus.Overrides", true);
                    break;
                case 50:
                    mulaiButton.setVisible(false);

                    
                    uiDef = new UIDefaults();
                    uiDef.put("ProgressBar[enabled].foregroundPainter", new ProgressBarPainter(Color.BLUE));

                    aProgressBar.putClientProperty("Nimbus.Overrides.InheritDefaults", true);
                    aProgressBar.putClientProperty("Nimbus.Overrides", true);
                    
                    aProgressBar.setForeground(Color.WHITE);
                    break;
                case 75:
                    mulaiButton.setVisible(false);

                    
                    uiDef = new UIDefaults();
                    uiDef.put("ProgressBar[enabled].foregroundPainter", new ProgressBarPainter(Color.GREEN));
                    uiDef.put("ProgressBar[enabled+finished].foregroundPainter", new ProgressBarPainter(Color.PINK));


                    aProgressBar.putClientProperty("Nimbus.Overrides.InheritDefaults", true);
                    aProgressBar.putClientProperty("Nimbus.Overrides", true);
                    
                    aProgressBar.setForeground(Color.BLACK);
                    break;
                case 100:
                    mulaiButton.setVisible(true);
                    resetButton.setVisible(true);
                    timer.stop();
                    break;
                default:
                    break;
            }
        });
        timer.start();
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LatihanProgressBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LatihanProgressBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LatihanProgressBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LatihanProgressBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LatihanProgressBar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JProgressBar aProgressBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mulaiButton;
    private javax.swing.JButton resetButton;
    // End of variables declaration                   

    UIDefaults uiDef;
    Timer timer;
    
}


class ProgressBarPainter implements Painter<JProgressBar>{

    private final Color color;
    
    public ProgressBarPainter(Color paramColor){
        this.color = paramColor;
    }
    
    @Override
    public void paint(Graphics2D gd, JProgressBar t, int width, int height) {
        gd.setColor(color);
        gd.fillRect(3, 2, width-5, height-5);
    }
    
}

