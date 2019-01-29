import javax.swing.JFrame;

class Main {      
    public static void main(String[] Args) {
        MyWindow ikkuna = new MyWindow();
        ikkuna.setTitle("yay");
        ikkuna.setSize(300,300);
        ikkuna.setVisible(true);
    }
}

class MyWindow extends JFrame {

}