import javax.swing.JFrame;
import javax.swing.JButton;

//add(Component comp) löytyy class "Containerista"
//public class Container extends Component

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
        add(nappi);
    }
}