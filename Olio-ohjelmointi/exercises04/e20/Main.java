import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main {      
    public static void main(String[] Args) {
        MyWindow ikkuna = new MyWindow("BMI Calculator", 300,300);
    }
}

class MyWindow extends JFrame {

    JButton nappi;
    int heightInt;
    int weightInt;

    JTextArea pituus;
    JTextArea paino;

    JLabel labelH;
    JLabel labelW;
    JLabel tulos;

    public MyWindow(String a, int b, int c) {
        super(a);
        setSize(b,c);
        setLayout( new GridLayout(3,2) );
        weightInt = 0;
        heightInt = 0;


        nappi = new JButton("Calculate");
        nappi.addActionListener(this::calculateButtonClicked);

        labelW = new JLabel("PAINO");
        labelH = new JLabel("PITUUS");
        tulos = new JLabel("BMI : ");

        pituus = new JTextArea("pituus");
        paino = new JTextArea("paino");

        add(labelH);    //add components
        add(pituus);
        add(labelW);
        add(paino);
        add(nappi);
        add(tulos);

        setVisible(true);
    }

    public void calculateButtonClicked(ActionEvent e) {
        String tmp = pituus.getText();
        int pituusInt;
        int painoInt;

        pituusInt = stringToInt (pituus.getText() );
        painoInt = stringToInt ( paino.getText() );
        
        if (painoInt > 0 && pituusInt > 0) {
            float result = ((float)painoInt/(float)pituusInt/(float)pituusInt) * 10000;
            tulos.setText(Float.toString(result));
        }
        else {
            tulos.setText("Invalid values");
        }
    }

    public int stringToInt (String a) {
        int tmpInt = 0;
        try {
             tmpInt = Integer.parseInt (a);
        } catch (NumberFormatException e) {
            tmpInt = 0;
        }
        return tmpInt;
    }

}