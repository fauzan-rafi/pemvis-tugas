import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.util.*;
import javax.swing.Icon.*;
import javax.swing.ImageIcon.*;
import javax.swing.Box.*;

public class Latihan2 extends JFrame{
    // instance obj
    JLabel judul,lblNim,lblNama,lblNilai;
    JTextField fldNim,fldNama,fldNilai;
    JTextArea txtShow;
    TitledBorder border1;
    JScrollPane scrollPane1;
    JButton btnSubmit,btnReset,btnAtas,btnBawah;

    public Latihan2() {
        this.initComponents();
    }

    public void initComponents() {
        setSize(960, 700);
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
        judul.setBounds(420,30,170,50); // mengatur posisi 
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

        // add text area
        txtShow = new JTextArea();
        txtShow.setBounds(300, 375, 200, 200);
        txtShow.setSize(450,250);  
        txtShow.setLayout(null);  
        txtShow.setVisible(true);  
        // txtShow.setEditable(false);
        txtShow.setFont(new Font("Ubuntu",1,15));
        txtShow.setLineWrap(true);
        txtShow.setWrapStyleWord(true);
        txtShow.setBackground(new Color(224, 192, 151));
        scrollPane1 = new JScrollPane(txtShow);
        scrollPane1.setBorder(new TitledBorder("Data Mahasiswa"));
        add(txtShow);

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
        // add buttonIcon Atas
        Icon icon = new ImageIcon("E:\\211623_b_up_arrow_icon.PNG");
        btnAtas  = new JButton(icon);
        btnAtas.setBounds(500,305,70,30); // mengatur posisi button
               add(btnAtas);
        
        // add buttonIcon Bawah
        Icon icon1 = new ImageIcon("E:\\211614_down_b_arrow_icon.PNG");
        btnBawah = new JButton(icon1);
        btnBawah.setBounds(500,335,70,30); // mengatur posisi button
        add(btnBawah);
       
        
        


       
       
        


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
                refreshData(txtShow, input);
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
    public void refreshData(JTextArea txtAr, ArrayList<Data> input) {
        String output = "";
        for(int i = 0; i < input.size();i++){
            output += input.get(i).nama +","+ input.get(i).nim +","+ input.get(i).nilai;
            output += "\n";
       }
       txtAr.setText(output);

    }

    public static void main(String[] args) {
        Latihan2 app = new Latihan2();
    }
}