import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.*;
import java.util.EventObject;

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

    public MyWindow() {
        nappi = new JButton("Ok");
        HandleButtonClick handeler = new HandleButtonClick();
        nappi.addActionListener(handeler);
        add(nappi);
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