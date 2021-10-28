
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class ContohSwingList2 extends javax.swing.JFrame {

  
    public ContohSwingList2() {
        initComponents();
        setDefaultList ( );
        
    }

                            
    private void initComponents() {

        judulLabel = new javax.swing.JLabel();
        daftarMahasiswaLabel = new javax.swing.JLabel();
        daftarMahasiswaListScrollPane = new javax.swing.JScrollPane();
        daftarMahasiswaList = new javax.swing.JList<>();
        pilihButton = new javax.swing.JButton();
        kembalikanButton = new javax.swing.JButton();
        mahasiswaPilihanLabel = new javax.swing.JLabel();
        mahasiswaPilihanScrollPane = new javax.swing.JScrollPane();
        mahasiswaPilihanList = new javax.swing.JList<>();
        submitButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contoh Swing List 2 Frame");

        judulLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        judulLabel.setText("Contoh Swing List 2");

        daftarMahasiswaLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        daftarMahasiswaLabel.setText("Daftar Mahasiswa");

        daftarMahasiswaList.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        daftarMahasiswaList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        daftarMahasiswaListScrollPane.setViewportView(daftarMahasiswaList);

        pilihButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pilihButton.setText(">>");
        pilihButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihButtonActionPerformed(evt);
            }
        });

        kembalikanButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        kembalikanButton.setText("<<");
        kembalikanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembalikanButtonActionPerformed(evt);
            }
        });

        mahasiswaPilihanLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mahasiswaPilihanLabel.setText("Mahasiswa Pilihan");

        mahasiswaPilihanList.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mahasiswaPilihanList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        mahasiswaPilihanScrollPane.setViewportView(mahasiswaPilihanList);

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        resetButton.setText("Reset");
        resetButton.setToolTipText("");
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
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(submitButton)
                        .addGap(18, 18, 18)
                        .addComponent(resetButton))
                    .addComponent(judulLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(daftarMahasiswaListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pilihButton)
                                    .addComponent(kembalikanButton)))
                            .addComponent(daftarMahasiswaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mahasiswaPilihanLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(mahasiswaPilihanScrollPane))))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(judulLabel)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(daftarMahasiswaLabel)
                    .addComponent(mahasiswaPilihanLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(pilihButton)
                        .addGap(34, 34, 34)
                        .addComponent(kembalikanButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mahasiswaPilihanScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(daftarMahasiswaListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(resetButton))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }                       

    private void setDefaultList ( ) {
        listModelDaftarMahasiswa.removeAllElements ( ) ;
        
        for (int i=65; i<=79; i++) {
            listModelDaftarMahasiswa.addElement ("Nama Mahasiswa" + (char) i) ;
        }
        
        daftarMahasiswaList.setModel (listModelDaftarMahasiswa) ;
        listModelMahasiswaPilihan.removeAllElements();
        mahasiswaPilihanList.setModel (listModelMahasiswaPilihan) ;
        
        
        
    }
    
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
        
        if (mahasiswaPilihanList.getModel ( ) .getSize ( ) == 0 ) {
            JOptionPane.showMessageDialog(this, "silahkan pilih mahasiswa dari daftar list mahasiswa!" , " eror" ,JOptionPane. ERROR_MESSAGE );
            
        } else {
            hasilPilihanMahasiswa = "";
            for (int i=0;  i <mahasiswaPilihanList.getModel ( ) .getSize ( ) ; i ++ ) {
                hasilPilihanMahasiswa += "\n" + mahasiswaPilihanList.getModel().getElementAt(i);
            }
            JOptionPane.showMessageDialog (this, hasilPilihanMahasiswa, "Mahasiswa Pilihan", JOptionPane.INFORMATION_MESSAGE ) ;
        }
        
    }                                            

    private void pilihButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
        if (daftarMahasiswaList.getSelectedIndex ( ) == -1) {
            
            JOptionPane.showMessageDialog (this , "silahkan pilih nama mahasiswa dari list daftar mahasiswa!" , "eror" ,  JOptionPane.ERROR_MESSAGE) ;
            
        } else {
            
            indeksPilihan = daftarMahasiswaList.getSelectedIndices ( ) ;
            
            for ( int i: indeksPilihan) {
                listModelMahasiswaPilihan.addElement(listModelDaftarMahasiswa.get (i).toString());
            }
            
            for (int i =indeksPilihan.length-1; i>=0; i-- ) {
                listModelDaftarMahasiswa.removeElementAt (indeksPilihan [i] ) ;
                
            } 
               
        }
    }                                           

    private void kembalikanButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        
        
        if (mahasiswaPilihanList.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog (this , "silahkan pilih nama mahasiswa dari list  mahasiswa pilihan!" , "eror" ,  JOptionPane.ERROR_MESSAGE) ;
            
        } else {
            indeksPilihan = mahasiswaPilihanList.getSelectedIndices ( ) ;
            
            for (int i : indeksPilihan) {
                
                listModelDaftarMahasiswa.addElement(listModelMahasiswaPilihan.get(i) .toString() );
                
            }
            
            for ( int i = indeksPilihan.length-1; i>=0; i--) {
               listModelMahasiswaPilihan.removeElementAt (indeksPilihan [i] ) ;
            }
            
            arrListDaftarMahasiswa = Collections.list (listModelDaftarMahasiswa.elements ( )) ;
            Collections.sort(arrListDaftarMahasiswa);
            listModelDaftarMahasiswa.removeAllElements ( ) ;
            listModelDaftarMahasiswa.addAll (arrListDaftarMahasiswa) ;
        }
        
    }                                                

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
        setDefaultList ( ) ;
    }                                           

   
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ContohSwingList2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContohSwingList2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContohSwingList2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContohSwingList2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContohSwingList2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel daftarMahasiswaLabel;
    private javax.swing.JList<String> daftarMahasiswaList;
    private javax.swing.JScrollPane daftarMahasiswaListScrollPane;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JButton kembalikanButton;
    private javax.swing.JLabel mahasiswaPilihanLabel;
    private javax.swing.JList<String> mahasiswaPilihanList;
    private javax.swing.JScrollPane mahasiswaPilihanScrollPane;
    private javax.swing.JButton pilihButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton submitButton;
    // End of variables declaration                   

DefaultListModel listModelDaftarMahasiswa = new DefaultListModel ( ) ;
DefaultListModel listModelMahasiswaPilihan = new DefaultListModel ( ) ;
int [ ] indeksPilihan;
ArrayList <String> arrListDaftarMahasiswa ;
String hasilPilihanMahasiswa = "" ;


}
