// author fauzan,khamim,dafa,inas

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;


public class App extends JFrame implements ActionListener{

    //initiate componen
    private JPanel mainPanel,aPanel,bPanel,cPanel,dPanel,ePanel;
    private JButton kembaliButton,lanjutButton,aButton,bButton,cButton,dButton,eButton;
    private JLabel aPanelLabel,bLabelPanel,cLabelPanel,dLabelPanel,eLabelPanel,judulLabel;
    private JSeparator jSeparator;

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

    @Override
    public void actionPerformed(ActionEvent e){
        
    }
    

    public App() {
        
    }


    public static void main(String[] args) throws Exception {
        
    }
}
