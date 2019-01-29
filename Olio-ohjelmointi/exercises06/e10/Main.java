import javax.swing.*;
import javax.swing.JButton;
import java.awt.event.*;
import java.util.EventObject;
import java.awt.*;
import java.awt.Graphics;

class Main {
    public static void main(String[] args) {
        MyWindow ikkuna = new MyWindow();
        ikkuna.setSize(400,400);
        ikkuna.setTitle("kek");
        ikkuna.setVisible(true);
    }
}

class MyWindow extends JFrame implements ActionListener {

    JButton nappi;
    JButton cancelButton;

    public MyWindow() {

        BorderLayout layout = new BorderLayout();   //2. layoutmanageria toteuttaa myös FlowLayout
        setLayout(layout);  // 1. tähän menee layoutmanager
        MyMouseListener mouse = new MyMouseListener();

        nappi = new JButton("Ok");
        //HandleButtonClick handeler = new HandleButtonClick();
        nappi.addActionListener(this);
        add(nappi, layout.PAGE_START);

        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(this);
        add(cancelButton, layout.PAGE_END);

        MyDrawingAreaComponent drawComponent = new MyDrawingAreaComponent();
        drawComponent.addMouseListener(mouse);
        add(drawComponent, layout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nappi) {
            System.out.println ("Ok");
        } else if(e.getSource() == cancelButton) {
            System.out.println ("Cancel");
        }
    }

}

class MyDrawingAreaComponent extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        //g.drawOval(0,0,10,10);
        g.fillOval(175,125,50,50);
    }
}

class MyMouseListener implements MouseListener {
    public void mouseExited (MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseClicked(MouseEvent e) {
        System.out.println("x :" +e.getX() );
        System.out.println("y :" +e.getY() );
    }
}

class HandleButtonClick implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        //System.out.println("cklick" +e.getSource() );
        //Object bur = e.getSource();
        //JButton kek = (JButton)bur;
        //kek.setText("nonon");
        //if (e.getSource() == nappi) {
        //    System.out.println ("Ok");
        //} else if(e.getSource() == cancelButton) {
        //    System.out.println ("Cancel");
        //}
    }
}