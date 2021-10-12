import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.util.*;
import javax.swing.JOptionPane;

public class SwingCheckBox extends JFrame{
    JLabel judul,judulbahasa,judulFasilitas;
    JButton submitButton,resetButton;
    JCheckBox bahasaIndonesiaCheckBox,bahasaInggrisCheckBox,bahasaJermanCheckBox,bahasaBelandaCheckBox,
                proyektorCheckBox,papanTulisCheckBox,laptopCheckBox,smartphoneCheckBox,internetCheckBox,mejaBelajarCheckBox;

    String bahasaYangDiKuasai = "";
    String fasilitasBelajar = "";
    JCheckBox[] arrJFasilitasCheckBox;
    JCheckBox[] arrJBahasaCheckBox;

    public SwingCheckBox(){
        this.initComponents();
    }

    public void initComponents() {
        //------------------------------------------------------
        setSize(800,600);
        // membuat judul
        setTitle("Tantangan JCheckBox");
        // close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        // mengatur layout di tengah
        setLocationRelativeTo(null);
        // mengatur warna
        // getContentPane().setBackground(new Color(243, 240, 215));
        setLayout(null);
        //---------------------------------------------------------

        // add label sebagai judul
        judul = new JLabel("Contoh Swing Checkbox 1");
        // set font label judul
        judul.setFont(new Font("Ubuntu",1,24));
        judul.setBounds(75,30,350,70); // mengatur posisi 
        add(judul);

        // add label bahasa yang dikuasai 
        judulbahasa = new JLabel("Bahasa yang dikuasai :");
        // set font label judulbahasa
        judulbahasa.setFont(new Font("Ubuntu",1,17));
        judulbahasa.setBounds(75,100,250,50); // mengatur posisi 
        add(judulbahasa);

        // add checkbox bahasa
        bahasaIndonesiaCheckBox = new JCheckBox("Bahasa Indonesia");
        bahasaIndonesiaCheckBox.setBounds(300,100,170,50);
        bahasaIndonesiaCheckBox.setVisible(true);
        bahasaIndonesiaCheckBox.setFont(new Font("Ubuntu",0,17));
        add(bahasaIndonesiaCheckBox);

        bahasaInggrisCheckBox = new JCheckBox("Bahasa Inggris");
        bahasaInggrisCheckBox.setBounds(500,100,170,50);
        bahasaInggrisCheckBox.setVisible(true);
        bahasaInggrisCheckBox.setFont(new Font("Ubuntu",0,17));
        add(bahasaInggrisCheckBox);

        bahasaBelandaCheckBox = new JCheckBox("Bahasa Belanda");
        bahasaBelandaCheckBox.setBounds(300,150,170,50);
        bahasaBelandaCheckBox.setVisible(true);
        bahasaBelandaCheckBox.setFont(new Font("Ubuntu",0,17));
        add(bahasaBelandaCheckBox);

        bahasaJermanCheckBox = new JCheckBox("Bahasa Jerman");
        bahasaJermanCheckBox.setBounds(500,150,170,50);
        bahasaJermanCheckBox.setVisible(true);
        bahasaJermanCheckBox.setFont(new Font("Ubuntu",0,17));
        add(bahasaJermanCheckBox);
        // -------------------------------------------------------------

        // add label bahasa yang dikuasai 
        judulFasilitas = new JLabel("Fasilitas Belajar :");
        // set font label judulFasilitas
        judulFasilitas.setFont(new Font("Ubuntu",1,17));
        judulFasilitas.setBounds(75,250,250,50); // mengatur posisi 
        judulFasilitas.setVisible(true);
        add(judulFasilitas);

        // add checkbox fasilitas
        papanTulisCheckBox = new JCheckBox("Papan Tulis");
        papanTulisCheckBox.setBounds(300,250,170,50);
        papanTulisCheckBox.setVisible(true);
        papanTulisCheckBox.setFont(new Font("Ubuntu",0,17));
        add(papanTulisCheckBox);

        mejaBelajarCheckBox = new JCheckBox("Meja Belajar");
        mejaBelajarCheckBox.setBounds(500,250,170,50);
        mejaBelajarCheckBox.setVisible(true);
        mejaBelajarCheckBox.setFont(new Font("Ubuntu",0,17));
        add(mejaBelajarCheckBox);

        internetCheckBox = new JCheckBox("Internet");
        internetCheckBox.setBounds(700,250,170,50);
        internetCheckBox.setVisible(true);
        internetCheckBox.setFont(new Font("Ubuntu",0,17));
        add(internetCheckBox);

        proyektorCheckBox = new JCheckBox("Proyektor");
        proyektorCheckBox.setBounds(300,300,170,50);
        proyektorCheckBox.setVisible(true);
        proyektorCheckBox.setFont(new Font("Ubuntu",0,17));
        add(proyektorCheckBox);

        smartphoneCheckBox = new JCheckBox("Smartphone");
        smartphoneCheckBox.setBounds(500,300,170,50);
        smartphoneCheckBox.setVisible(true);
        smartphoneCheckBox.setFont(new Font("Ubuntu",0,17));
        add(smartphoneCheckBox);

        laptopCheckBox = new JCheckBox("Laptop");
        laptopCheckBox.setBounds(700,300,170,50);
        laptopCheckBox.setVisible(true);
        laptopCheckBox.setFont(new Font("Ubuntu",0,17));
        add(laptopCheckBox);
        // -------------------------------------------------------------

        // add button Submit
        submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Ubuntu",1,15));
        submitButton.setBackground(new Color(206, 229, 208));
        submitButton.setBounds(75,400,100,30); // mengatur posisi button
        add(submitButton);
        // add button Reset
        resetButton = new JButton("Reset");
        resetButton.setFont(new Font("Ubuntu",1,15));
        resetButton.setBackground(new Color(255, 120, 120));
        resetButton.setBounds(200,400,100,30); // mengatur posisi button
        add(resetButton);

        // add action button
        submitButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                bahasaYangDiKuasai = "Bahasa Yang Anda Kuasai:\n";
        
                if(bahasaIndonesiaCheckBox.isSelected()){
                    bahasaYangDiKuasai += "\n" + bahasaIndonesiaCheckBox.getText();
                }
                
                if(bahasaInggrisCheckBox.isSelected()){
                    bahasaYangDiKuasai += "\n" + bahasaInggrisCheckBox.getText();
                }
                
                if(bahasaJermanCheckBox.isSelected()){
                    bahasaYangDiKuasai += "\n" + bahasaJermanCheckBox.getText();
                }
                
                if(bahasaBelandaCheckBox.isSelected()){
                    bahasaYangDiKuasai += "\n" + bahasaBelandaCheckBox.getText();
                }
                
                
                if(bahasaYangDiKuasai.equals("Bahasa Yang Anda Kuasai:\n")){
                    JOptionPane.showMessageDialog(this, "Silahkan pilih bahasa yang dikuasai" ,"ERROR", JOptionPane.ERROR_MESSAGE);
                }else{
                    fasilitasBelajar = "Fasilitas Belajar:\n";
                    arrJFasilitasCheckBox = new JCheckBox[]{laptopCheckBox,mejaBelajarCheckBox,papanTulisCheckBox,
                                                proyektorCheckBox,smartphoneCheckBox,internetCheckBox};
                    for(int i = 0; i < arrJFasilitasCheckBox.length;i++){
                        if(arrJFasilitasCheckBox[i].isSelected()){
                            fasilitasBelajar += "\n" + arrJFasilitasCheckBox[i].getText();
                        }
                    }
                    if(fasilitasBelajar.equals("Fasilitas Belajar:\n")){
                        JOptionPane.showMessageDialog(this, "Silahkan pilih fasilitas belajar" ,"ERROR", JOptionPane.ERROR_MESSAGE);  
                    }else{
                        JOptionPane.showMessageDialog(this, bahasaYangDiKuasai +"\n\n" + fasilitasBelajar ,"Hasil Pilihan CheckBox", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        });

        resetButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                arrJBahasaCheckBox = new JCheckBox[]{bahasaIndonesiaCheckBox,bahasaInggrisCheckBox,bahasaJermanCheckBox,bahasaBelandaCheckBox};
        
                arrJFasilitasCheckBox = new JCheckBox[]{laptopCheckBox,mejaBelajarCheckBox,papanTulisCheckBox,
                                                proyektorCheckBox,smartphoneCheckBox,internetCheckBox};
                
                for(int i = 0; i < arrJFasilitasCheckBox.length;i++){
                    arrJFasilitasCheckBox[i].setSelected(false);
                }
                
                for(int i = 0; i < arrJBahasaCheckBox.length;i++){
                    arrJBahasaCheckBox[i].setSelected(false);
                }
            }
        });

    }

    public static void main(String[] args) {
        SwingCheckBox app = new SwingCheckBox();
    }
}
