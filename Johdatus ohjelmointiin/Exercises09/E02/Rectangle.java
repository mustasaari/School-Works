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
         Rectangle rect1 = rect;
         System.out.println(rect);          // muistipaikka
         System.out.println(rect1.h);       // 0
         System.out.println(rect1.w);       // 0
         rect.h = 5; rect.w = 6;            //Viittaavat samaan muistipaikaan rect ja rect1
         System.out.println(rect1.h);       // 5
         System.out.println(rect1.w);       // 6

        }
}