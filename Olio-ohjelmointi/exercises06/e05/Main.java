import javax.swing.*;
import javax.swing.JButton;
import java.awt.event.*;
import java.util.EventObject;
import java.awt.*;

class Main {
    public static void main(String[] args) {
        MyWindow ikkuna = new MyWindow();
        ikkuna.setSize(400,400);
        ikkuna.setTitle("kek");
        ikkuna.setVisible(true);
    }
}

class MyWindow extends JFrame {

    JButton nappi;
    JButton cancelButton;

    public MyWindow() {

        FlowLayout layout = new FlowLayout();   //2. layoutmanageria toteuttaa myös FlowLayout
        setLayout(layout);  // 1. tähän menee layoutmanager

        nappi = new JButton("Ok");
        HandleButtonClick handeler = new HandleButtonClick();
        nappi.addActionListener(handeler);
        add(nappi);

        cancelButton = new JButton("Cancel");
        add(cancelButton);
    }
}

class HandleButtonClick implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("cklick" +e.getSource() );
        Object bur = e.getSource();
        JButton kek = (JButton)bur;
        kek.setText("nonon");
    }
}