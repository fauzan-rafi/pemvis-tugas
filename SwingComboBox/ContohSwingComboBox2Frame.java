
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ContohSwingComboBox2Frame extends javax.swing.JFrame {

   
    public ContohSwingComboBox2Frame() {
        initComponents();
        
        initData ( ) ;
        setDefaultComboBoxFakultas ( ) ;
         setDefaultComboBoxJurusan ( ) ;
          setDefaultComboBoxProdi ( ) ;
    }

                            
    private void initComponents() {

        JudulLabel = new javax.swing.JLabel();
        FakultasLabel = new javax.swing.JLabel();
        FakultasComboBox = new javax.swing.JComboBox<>();
        JurusanLabel = new javax.swing.JLabel();
        JurusanComboBox = new javax.swing.JComboBox<>();
        ProdiLabel = new javax.swing.JLabel();
        ProdiComboBox = new javax.swing.JComboBox<>();
        SubmitButton = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contoh Swing ComboBox 2");

        JudulLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JudulLabel.setText("Contoh Swing ComboBox 2");

        FakultasLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FakultasLabel.setText("Fakultas");

        FakultasComboBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FakultasComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        FakultasComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FakultasComboBoxItemStateChanged(evt);
            }
        });

        JurusanLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JurusanLabel.setText("Jurusan");

        JurusanComboBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JurusanComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JurusanComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JurusanComboBoxItemStateChanged(evt);
            }
        });

        ProdiLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ProdiLabel.setText("Prodi");

        ProdiComboBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ProdiComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        ResetButton.setText("Reset");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JudulLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ProdiLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JurusanLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FakultasLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                            .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FakultasComboBox, 0, 311, Short.MAX_VALUE)
                            .addComponent(JurusanComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ProdiComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(JudulLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FakultasLabel)
                    .addComponent(FakultasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JurusanLabel)
                    .addComponent(JurusanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProdiLabel)
                    .addComponent(ProdiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubmitButton)
                    .addComponent(ResetButton))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>                        

    private void initData( )  {
        
        arrListFakultas.clear( ) ;
        
        arrListFakultas.add ( new String [ ]  { "FT", "FAKULTAS TEKNIK" } ) ;
        arrListFakultas.add ( new String [ ]  { "FIK", "FAKULTAS ILMU KEOLAHRAGAAN" } ) ;
        arrListFakultas.add ( new String [ ]  { "FBS", "FAKULTAS BAHASA & SENI" } ) ;
        
        arrListJurusan.clear( ) ;
        arrListJurusan.add ( new String [ ]  {"PTEI", "PENDIDIKAN TEKNIK ELEKTRONIKA DAN INFORMATIKA" , "FT" } ) ;
        arrListJurusan.add ( new String [ ]  {"PTBB", "PENDIDIKAN TEKNIK BOGA DAN BUSANA" , "FT" } ) ;
        arrListJurusan.add ( new String [ ]  {"PO", "PENDIDIKAN OLAHRAGA","FIK" } ) ;
        arrListJurusan.add ( new String [ ]  {"PK", "PENDIDIKAN KEPELATIHAN " , "FIK" } ) ;
        arrListJurusan.add ( new String [ ]  {"PBSI", "PENDIDIKAN BAHASA DAN SASTRA INDONESIA ","FBS" } ) ;
        arrListJurusan.add ( new String [ ]  {"PBSI", "PENDIDIKAN SENI RUPA ","FBS" } ) ;
        
        
        arrListProdi.clear( ) ;
        arrListProdi.add ( new String [ ]  {"S1 PENDIDKAN INFORMATIKA " ,"PTEI" } ) ;
        arrListProdi.add ( new String [ ]  {"S1 TEKNOLOGI  INFORMASI " ,"PTEI" } ) ;
        arrListProdi.add ( new String [ ]  {"S1 PENDIDIKAN ELEKTRONIKA ","PTEI" } ) ;
        arrListProdi.add ( new String [ ]  {"S1 PENDIDIKAN OLAHRAGA " ,"PK"} ) ;
        arrListProdi.add ( new String [ ]  {"S1 PENDIDIKAN DAN SASTRA INDONESIA " ,"PK"} ) ;
        arrListProdi.add ( new String [ ]  {"S1  SASTRA INDONESIA " ,"PBSI"} ) ;
        arrListProdi.add ( new String [ ]  {"S1 PJKR" ,"PO"} ) ;
        arrListProdi.add ( new String [ ]  {"S1 PGSD PENJAS " ,"PO"} ) ;
        arrListProdi.add ( new String [ ]  {"S1 PENDIDIKAN TEKNIK BOGA","PTBB" } ) ;
        arrListProdi.add ( new String [ ]  {"D3 TATA RIAS DAN KECANTIKAN","PTBB" } ) ;
        arrListProdi.add ( new String [ ]  {"S1 PENDIDIKAN TEKNIK BUSANA","PTBB" } ) ;
        arrListProdi.add ( new String [ ]  {"S1 PENDIDIKAN SENI RUPA" , "PSR"} ) ;
        arrListProdi.add ( new String [ ]  {"S1 PENDIDIKAN KRIYA" , "PSR"} ) ;
        
          
    }
    
    private void setDefaultComboBoxFakultas ( )  {
    FakultasComboBox.removeAllItems ( ) ;
    FakultasComboBox.addItem ("-PILIH-" ) ;
    
    for (String [ ] arrFakultas  : arrListFakultas)   {
        FakultasComboBox.addItem (arrFakultas [1] ) ;
        
         
    }
    
}
    
    private void setDefaultComboBoxJurusan ( ) {
        JurusanComboBox.removeAllItems ( ) ;
        JurusanComboBox.addItem ("-PILIH-" ) ;   
        
    }
    
     private void setDefaultComboBoxProdi ( ) {
        ProdiComboBox.removeAllItems ( ) ;
        ProdiComboBox.addItem ("-PILIH-" ) ;
        
     }
     
     private void setComboBoxJurusan (int paramIndeksFakultas ) {
         idFakultas = arrListFakultas.get (paramIndeksFakultas) [0] ;
         arrListIdJurusan.clear ( ) ;
         
         setDefaultComboBoxJurusan ( ) ;
         for (int i=0; i<arrListJurusan.size ( ) ;  i++)  {
             if (arrListJurusan.get (i) [2] .equals (idFakultas)) {
                 arrListIdJurusan.add(arrListJurusan.get (i) [0] ) ;
                 JurusanComboBox.addItem(arrListJurusan.get (i) [1] ) ;
                 
             }
         }
         
     }
     
     private void setComboBoxProdi ( String paramIdJurusan) {
         setDefaultComboBoxProdi ( ) ;
                 for (int i = 0; i<arrListProdi.size ( ) ; i++ ) {
                     if (arrListProdi.get  (i) [1] .equals(paramIdJurusan) ) {
                         ProdiComboBox.addItem (arrListProdi.get (i) [0]) ;
                         
                     }
                 }
         
     }
    
    
    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        if (FakultasComboBox.getSelectedIndex( ) == 0 ) {
            JOptionPane.showMessageDialog (this, "silahkan pilih fakultas!" , "error" , JOptionPane.ERROR_MESSAGE) ;
            FakultasComboBox.requestFocusInWindow ( ) ;
        } else if (JurusanComboBox.getSelectedIndex( ) == 0 ) {
            JOptionPane.showMessageDialog (this, "silahkan pilih jurusan!" , "error" , JOptionPane.ERROR_MESSAGE) ;
             JurusanComboBox.requestFocusInWindow ( ) ;
             
        } else if (ProdiComboBox.getSelectedIndex( ) == 0 ) {
            JOptionPane.showMessageDialog (this, "silahkan pilih prodi!" , "error" , JOptionPane.ERROR_MESSAGE) ;
             ProdiComboBox.requestFocusInWindow ( ) ;
             
        }  else {
            JOptionPane.showMessageDialog (this, "Fakultas:  " + FakultasComboBox.getSelectedItem ( ) .toString ( ) +
                                                                                          " \nJurusan: " +  JurusanComboBox.getSelectedItem ( ) .toString  ( ) +
                                                                                          " \nProdi: " + ProdiComboBox.getSelectedItem ( ) .toString  ( ) ,
                                                                                        "HasilPilihanComboBox" , JOptionPane.INFORMATION_MESSAGE) ;
        }
    }                                            

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        setDefaultComboBoxFakultas ( ) ;
        setDefaultComboBoxJurusan ( ) ;
        setDefaultComboBoxProdi ( ) ;
        
        
    }                                           

    private void FakultasComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {                                                  
        // TODO add your handling code here:
        if (evt.getStateChange( ) == ItemEvent.SELECTED ) {
            if(FakultasComboBox.getSelectedIndex( ) == 0) {
                setDefaultComboBoxJurusan ( ) ;
                setDefaultComboBoxProdi ( ) ;
                        
            } else {
                setComboBoxJurusan(FakultasComboBox.getSelectedIndex( ) - 1 );
                
                
            }
        }
    }                                                 

    private void JurusanComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {                                                 
        // TODO add your handling code here:
        if (evt.getStateChange ( ) ==  ItemEvent.SELECTED)  {
            if(JurusanComboBox.getSelectedIndex ( ) == 0) {
                 setDefaultComboBoxProdi ( ) ;
                 
            } else {
                setComboBoxProdi (arrListIdJurusan.get (JurusanComboBox.getSelectedIndex() - 1) ) ;
                
                
            }
               
            
        }
    }                                                

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ContohSwingComboBox2Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContohSwingComboBox2Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContohSwingComboBox2Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContohSwingComboBox2Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContohSwingComboBox2Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JComboBox<String> FakultasComboBox;
    private javax.swing.JLabel FakultasLabel;
    private javax.swing.JLabel JudulLabel;
    private javax.swing.JComboBox<String> JurusanComboBox;
    private javax.swing.JLabel JurusanLabel;
    private javax.swing.JComboBox<String> ProdiComboBox;
    private javax.swing.JLabel ProdiLabel;
    private javax.swing.JButton ResetButton;
    private javax.swing.JButton SubmitButton;
    // End of variables declaration                   

ArrayList<String [ ] > arrListFakultas = new ArrayList <String [ ] > ( ) ;
ArrayList<String [ ] > arrListJurusan = new ArrayList <String [ ] > ( ) ;
ArrayList<String [ ] > arrListProdi = new ArrayList <String [ ] > ( ) ;

String idFakultas = "";
ArrayList<String> arrListIdJurusan = new ArrayList<String > ( ) ;

}
