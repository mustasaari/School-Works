import java.lang.IllegalArgumentException;

class Main {

    public static void main(String[] args) {
        
        MyColor vari = new MyColor();
        vari.setR(100);
        vari.setG(300);
    }
}

class MyColor {
    int r;
    int g;
    int b;

    public void setR(int x) {
        if ( checkValues(x) ) {
            r = x;
        }
    }

    public boolean checkValues(int i) throws IllegalArgumentException { //at MyColor.checkValues(Main.java:27)                                                                                                                         
        if (i >= 0 && i < 256) {                                        //at MyColor.setR(Main.java:18)
            System.out.println("this is fine");                         //at Main.main(Main.java:8)
        } else {
            throw new IllegalArgumentException();
        }
        return true;
    }

    public void setG(int x) throws IllegalArgumentException {           //at MyColor.setG(Main.java:37)
                                                                        //at Main.main(Main.java:9)
        if (x >= 0 && x < 256) {
            g = x;
        } else {
            throw new IllegalArgumentException();
        }
    }

}