import javax.swing.JFrame;

class Main {
    public static void main(String[] args) {
        MyWindow ikkuna = new MyWindow();
        ikkuna.setSize(400,400);
        ikkuna.setTitle("kek");
        ikkuna.setVisible(true);
    }
}

class MyWindow extends JFrame {

}