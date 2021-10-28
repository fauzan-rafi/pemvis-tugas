/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoh;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author FAUZAN
 */
public class ContohSwingJComboBoxJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ContohSwingJComboBoxJFrame
     */
    public ContohSwingJComboBoxJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judulLabel = new javax.swing.JLabel();
        waktuLabel = new javax.swing.JLabel();
        waktuComboBox = new javax.swing.JComboBox<>();
        submitButton = new javax.swing.JButton();
        hariLabel = new javax.swing.JLabel();
        hariComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contoh Swing Combo Box 1");

        judulLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        judulLabel.setText("Contoh Swing Combo Box 1");

        waktuLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        waktuLabel.setText("Waktu");

        waktuComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih -", "08.15 WIB - 09.00 WIB", "09.15 WIB - 10.00 WIB", "10.15 WIB - 11.00 WIB", "11.15 WIB - 12.00 WIB", "12.15 WIB - 13.00 WIB", "13.15 WIB - 14.00 WIB", "14.15 WIB - 15.00 WIB", "15.15 WIB - 16.00 WIB", " " }));

        submitButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        submitButton.setText("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        hariLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        hariLabel.setText("Hari");

        hariComboBox.setModel(modelHari);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(submitButton)
                            .addComponent(hariLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(hariComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(waktuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(waktuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(judulLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(judulLabel)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(waktuLabel)
                    .addComponent(waktuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hariLabel)
                    .addComponent(hariComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(submitButton)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        if( waktuComboBox.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, "Silahkan Pilih Waktu!", "Error", JOptionPane.ERROR_MESSAGE);
        } else if(hariComboBox.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, "Silahkan Pilih Hari!", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, "Waktu: " + waktuComboBox.getSelectedItem().toString()
                    +"\n Hari: "+ hariComboBox.getSelectedItem().toString() , 
                    "Hasil Pilihan", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ContohSwingJComboBoxJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContohSwingJComboBoxJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContohSwingJComboBoxJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContohSwingJComboBoxJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContohSwingJComboBoxJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> hariComboBox;
    private javax.swing.JLabel hariLabel;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JComboBox<String> waktuComboBox;
    private javax.swing.JLabel waktuLabel;
    // End of variables declaration//GEN-END:variables
    final String[] arrHari = {"- Pilih -","Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"};
    final DefaultComboBoxModel modelHari = new DefaultComboBoxModel(arrHari);
}