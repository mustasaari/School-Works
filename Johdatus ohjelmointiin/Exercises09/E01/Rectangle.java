import java.util.*;



class Rectangle {
    public int w;                           // <<--- intissä tästä tulee null ?
    public int h;
}

class TestRectangle {

        public static void main(String [] args) {
    
         Rectangle rect = new Rectangle();
         System.out.println(rect);
         System.out.println(rect.h);        // 0
         System.out.println(rect.w);        // 0

        }
}