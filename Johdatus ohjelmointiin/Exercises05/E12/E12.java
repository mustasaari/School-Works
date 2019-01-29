import java.util.*;

class E12 {
    public static void main(String [] args) {
        Scanner syote = new Scanner(System.in);
        String mj1 = "ABCDE:FGHIJKLMNOPQ:RSTUVWXYZ";
        String mj2 = MyString.replaceAll(mj1, ':', "moi");
        System.out.println(mj2);
    }


}

class MyString {

    public static String replaceAll(String yksi, char kaksi, String kolme) {
        String siivottu = "";

        for (int i = 0; i < yksi.length(); i++) {
            if (yksi.charAt(i) == kaksi ) {
                siivottu += kolme;
            }
            else {
                siivottu += yksi.charAt(i);
            }
        }

        return siivottu;
    }

}