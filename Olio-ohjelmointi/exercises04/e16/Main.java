import javax.swing.JFrame;

class Main {      
    public static void main(String[] Args) {
        MyWindow ikkuna = new MyWindow("yay2", 300,300);
        //ikkuna.setTitle("yay");
        //ikkuna.setSize(300,300);
        //ikkuna.setVisible(true);
    }
}

class MyWindow extends JFrame {

    public MyWindow(String a, int b, int c) {
        super(a);
        //setTitle(a);
        setSize(b,c);
        setVisible(true);
    }
}