import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.util.*;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JSpinnerDateEditor;

public class AppCalendar extends JFrame{

    JLabel judulLabel, JudulLabelStandar, JudulLabelDefault, JudulLabelSpinner, JudulLabelMasking;
    JDateChooser jDateChooserDefault, jDateChooserMasking, jDateChooserSpinner, jDateChooserStandar;
    JButton resetButton, submitButton;              
    SimpleDateFormat sdf = new SimpleDateFormat();
    String tanggal1, tanggal2, tanggal3, tanggal4;

    public AppCalendar() {
        this.initComponents();
    }

    public void initComponents() {
        //------------------------------------------------------
        setSize(700,650);
        // membuat judul
        setTitle("Tantangan JCalendar");
        // close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        // mengatur layout di tengah
        setLocationRelativeTo(null);
        // mengatur warna
        // getContentPane().setBackground(new Color(243, 240, 215));
        setLayout(null);
        //---------------------------------------------------------

        // membuat judul
        judulLabel = new JLabel("Contoh Swing Lib JCalendar");
        // set font
        judulLabel.setFont(new Font("Ubuntu",1,24));
        judulLabel.setBounds(50,30,350,70); // mengatur posisi 
        add(judulLabel);

        // add label JudulLabelStandar
        JudulLabelStandar = new JLabel("JDate Chooser (Standar)");
        // set font label JudulLabelStandar
        JudulLabelStandar.setFont(new Font("Ubuntu",1,17));
        JudulLabelStandar.setBounds(50,130,250,30); // mengatur posisi 
        add(JudulLabelStandar);

        // add JDateChooser
        jDateChooserStandar = new JDateChooser();
        jDateChooserStandar.setBounds(350,130,250,30);
        add(jDateChooserStandar);

        // add label JudulLabelDefault
        JudulLabelDefault = new JLabel("JDate Chooser (Default)");
        // set font label JudulLabelDefault
        JudulLabelDefault.setFont(new Font("Ubuntu",1,17));
        JudulLabelDefault.setBounds(50,220,250,30); // mengatur posisi 
        add(JudulLabelDefault);

        // add JDateChooser
        jDateChooserDefault = new JDateChooser(new Date());
        jDateChooserDefault.setBounds(350,220,250,30);
        add(jDateChooserDefault);

        
        // add label JudulLabelSpinner
        JudulLabelSpinner = new JLabel("JDate Chooser (Spinner)");
        // set font label JudulLabelSpinner
        JudulLabelSpinner.setFont(new Font("Ubuntu",1,17));
        JudulLabelSpinner.setBounds(50,310,250,30); // mengatur posisi 
        add(JudulLabelSpinner);

        // add JDateChooser
        jDateChooserSpinner = new JDateChooser(null,null,null,new JSpinnerDateEditor());
        jDateChooserSpinner.setBounds(350,310,250,30);
        add(jDateChooserSpinner);


        // add label JudulLabelMasking
        JudulLabelMasking = new JLabel("JDate Chooser (Masking)");
        // set font label JudulLabelMasking
        JudulLabelMasking.setFont(new Font("Ubuntu",1,17));
        JudulLabelMasking.setBounds(50,400,250,30); // mengatur posisi 
        add(JudulLabelMasking);

        // add JDateChooser
        jDateChooserMasking = new JDateChooser("yyyy/MM/dd","####/##/##",'_');
        jDateChooserMasking.setBounds(350,400,250,30);
        add(jDateChooserMasking);

        // add button
        // add button Submit
        submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Ubuntu",1,15));
        submitButton.setBackground(new Color(206, 229, 208));
        submitButton.setBounds(50,500,100,30); // mengatur posisi button
        add(submitButton);
        // add button Reset
        resetButton = new JButton("Reset");
        resetButton.setFont(new Font("Ubuntu",1,15));
        resetButton.setBackground(new Color(255, 120, 120));
        resetButton.setBounds(200,500,100,30); // mengatur posisi button
        add(resetButton);

        // add action button
        submitButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(jDateChooserStandar.getDate() == null){
                    JOptionPane.showMessageDialog(null, "Silahkan pilih tanggal pada JDateChooser (Standar)", "Error" , JOptionPane.ERROR_MESSAGE);
                }else if(jDateChooserDefault.getDate() == null ){
                    JOptionPane.showMessageDialog(null, "Silahkan pilih tanggal pada JDateChooser (Default)", "Error" , JOptionPane.ERROR_MESSAGE);
                }else if(jDateChooserSpinner.getDate() == null ){
                    JOptionPane.showMessageDialog(null, "Silahkan pilih tanggal pada JDateChooser (Spinner)", "Error" , JOptionPane.ERROR_MESSAGE);
                }else if(jDateChooserMasking.getDate() == null ){
                    JOptionPane.showMessageDialog(null, "Silahkan pilih tanggal pada JDateChooser (Masking)", "Error" , JOptionPane.ERROR_MESSAGE);
                }else{
                    sdf.applyPattern(jDateChooserStandar.getDateFormatString());
                    tanggal1 = sdf.format(jDateChooserStandar.getDate());
                    
                    sdf.applyPattern(jDateChooserDefault.getDateFormatString());
                    tanggal2 = sdf.format(jDateChooserDefault.getDate());
                    
                    sdf.applyPattern(jDateChooserSpinner.getDateFormatString());
                    tanggal3 = sdf.format(jDateChooserSpinner.getDate());
                    
                    sdf.applyPattern(jDateChooserMasking.getDateFormatString());
                    tanggal4 = sdf.format(jDateChooserMasking.getDate());
                    
                    JOptionPane.showMessageDialog(null,"\nJDateChooserStandar :" + tanggal1 +
                                                       "\nJDateChooserDefault :" + tanggal2 +
                                                       "\nJDateChooserSpinner :" + tanggal3 +
                                                       "\nJDateChooserMasking :" + tanggal4 ,
                                                        "Pilihan tanggal",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        resetButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                jDateChooserStandar.setDate(null);
                jDateChooserDefault.setDate(new Date());
                jDateChooserSpinner.setDate(null);
                jDateChooserMasking.setDate(null);
            }
        });
        
    }

    public static void main(String[] args) {
        AppCalendar app = new AppCalendar();
    }
    
}
