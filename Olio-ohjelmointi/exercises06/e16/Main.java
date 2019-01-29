import javax.swing.*;
import javax.swing.JButton;
import java.awt.event.*;
import java.util.EventObject;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Component;

class Main {
    public static void main(String[] args) {
        MyWindow ikkuna = new MyWindow();
        ikkuna.setSize(400,400);
        ikkuna.setTitle("kek");
        ikkuna.setVisible(true);
        

        //TESTAUS
        Component[] components = ikkuna.getContentPane().getComponents();
        MyDrawingAreaComponent tmp = (MyDrawingAreaComponent)components[2];
        for (int i = 0; i < 300; i++ ) {
            tmp.setX(i);
            tmp.setY(i);
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {}

        }
    }
}

class MyWindow extends JFrame implements ActionListener {

    JButton nappi;
    JButton cancelButton;

    public MyWindow() {

        BorderLayout layout = new BorderLayout();   //2. layoutmanageria toteuttaa myös FlowLayout
        setLayout(layout);  // 1. tähän menee layoutmanager

        nappi = new JButton("Ok");
        //HandleButtonClick handeler = new HandleButtonClick();
        nappi.addActionListener(this);
        add(nappi, layout.PAGE_START);

        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(this);
        add(cancelButton, layout.PAGE_END);

        MyDrawingAreaComponent drawComponent = new MyDrawingAreaComponent();
        MyMouseListener mouse = new MyMouseListener(drawComponent);
        //drawComponent.addMouseListener(mouse);
        drawComponent.addMouseMotionListener(mouse);
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

    int x = 50;
    int y = 50;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        //g.drawOval(0,0,10,10);
        g.fillOval(x,y,50,50);
    }

    public void setX(int x) {
        this.x = x;
        repaint();
        invalidate();
    }
    public void setY(int y) {
        this.y = y;
        repaint();
        invalidate();
    }

}

class MyMouseListener extends MouseAdapter {

    private MyDrawingAreaComponent host;

    public MyMouseListener(MyDrawingAreaComponent a) {
        host = a;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("x :" +e.getX() );
        System.out.println("y :" +e.getY() );
        host.setX(e.getX());
        host.setY(e.getY());
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        host.setX(e.getX() -25);
        host.setY(e.getY() -25);
    }
}

class HandleButtonClick implements ActionListener {
    public void actionPerformed(ActionEvent e) {
    }
}