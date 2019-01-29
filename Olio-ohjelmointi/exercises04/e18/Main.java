import javax.swing.*;
import java.awt.*;

class Main {      
    public static void main(String[] Args) {
        MyWindow ikkuna = new MyWindow("yay2", 300,300);
        //ikkuna.setTitle("yay");
        //ikkuna.setSize(300,300);
        //ikkuna.setVisible(true);
    }
}

class MyWindow extends JFrame {

    JButton nappi;

    public MyWindow(String a, int b, int c) {
        super(a);
        //setTitle(a);
        setSize(b,c);
        nappi = new JButton("Clear");
        setLayout(new BorderLayout() );
        add(nappi, BorderLayout.PAGE_START);

        JTextArea myArea = new JTextArea("area");
        add(myArea, BorderLayout.CENTER);

        setVisible(true);
    }
}