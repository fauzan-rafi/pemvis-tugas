import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;
import java.util.*;

public class Latihan2 extends JFrame{
    // instance obj
    JLabel judul,lblNim,lblNama,lblNilai;
    JTextField fldNim,fldNama,fldNilai;
    JButton btnSubmit,btnReset;

    public Latihan2() {
        this.initComponents();
    }

    public void initComponents() {
        setSize(960, 600);
        // membuat judul
        setTitle("Tantangan JTextField & Textarea");
        // close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        // mengatur layout di tengah
        setLocationRelativeTo(null);
        // mengatur warna
        getContentPane().setBackground(new Color(243, 240, 215));
        setLayout(null);
        //-------------------------------------------------------------------

        // add label sebagai judul
        judul = new JLabel("Program mahasiswa");
        // set font label judul
        judul.setFont(new Font("Ubuntu",1,17));
        judul.setBounds(400,30,170,50); // mengatur posisi 
        add(judul);

        // add component lbl nim
        lblNim = new JLabel("Nim :");
        lblNim.setFont(new Font("Ubuntu",1,15));
        lblNim.setBounds(200,100,150,40); // mengatur posisi 
        add(lblNim);
        // add component lbl nama
        lblNama = new JLabel("Nama :");
        lblNama.setFont(new Font("Ubuntu",1,15));
        lblNama.setBounds(200,175,150,40); // mengatur posisi 
        add(lblNama);
        // add component lbl nilai
        lblNilai = new JLabel("Nilai :");
        lblNilai.setFont(new Font("Ubuntu",1,15));
        lblNilai.setBounds(200,250,150,40); // mengatur posisi 
        add(lblNilai);

        // add component nim
        fldNim = new JTextField();
        fldNim.setBounds(300,100,170,40); // mengatur posisi 
        fldNim.setBorder(new LineBorder(Color.BLACK,2));
        add(fldNim);

        // add component nama
        fldNama = new JTextField();
        fldNama.setBounds(300,175,170,40); // mengatur posisi 
        fldNama.setBorder(new LineBorder(Color.BLACK,2));
        add(fldNama);

        // add component nilai
        fldNilai = new JTextField();
        fldNilai.setBounds(300,250,170,40); // mengatur posisi 
        fldNilai.setBorder(new LineBorder(Color.BLACK,2));
        add(fldNilai);

        // add button Submit
        btnSubmit = new JButton("Submit");
        btnSubmit.setFont(new Font("Ubuntu",1,15));
        btnSubmit.setBackground(new Color(206, 229, 208));
        btnSubmit.setBounds(375,315,100,30); // mengatur posisi button
        add(btnSubmit);
        // add button Reset
        btnReset = new JButton("Reset");
        btnReset.setFont(new Font("Ubuntu",1,15));
        btnReset.setBackground(new Color(255, 120, 120));
        btnReset.setBounds(200,315,100,30); // mengatur posisi button
        add(btnReset);
        // ---------------------------------------------------------------
        ArrayList<Data> input = new ArrayList<Data>();

       
        // menambah action pada button
        btnSubmit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String x = fldNama.getText();
                int y = Integer.parseInt(fldNim.getText());
                float z = Float.parseFloat(fldNilai.getText());
                Data mhs = new Data(x,y,z);
    	        input.add(mhs);
                fldNim.setText("");
                fldNama.setText("");
                fldNilai.setText("");
            }
        });
        

        
        // menambah action pada button
        btnReset.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                fldNim.setText("");
                fldNama.setText("");
                fldNilai.setText("");
            }
        });
        
        

    }

    public void runProg() {
        


    }
    public static void main(String[] args) {
        Latihan2 app = new Latihan2();
    }
}