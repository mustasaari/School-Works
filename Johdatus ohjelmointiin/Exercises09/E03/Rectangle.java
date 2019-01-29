import java.util.*;



class Rectangle {
    public int w;                           // <<--- intissä tästä tulee null ?
    public int h;

    public void printMe() {
        System.out.println("leveys : " +w);
        System.out.println("korkeus : " +h);
    }

    public void whoAmI() {
        System.out.println(this);           //  this is a reference to the current object — the object whose method or constructor is being called. 
    }

    

}

class TestRectangle {

        public static void main(String [] args) {
    
         Rectangle rect = new Rectangle();
         System.out.println(rect);
         System.out.println(rect.h);        // 0
         System.out.println(rect.w);        // 0
         Rectangle rect1 = rect;
         System.out.println(rect);
         System.out.println(rect1.h);
         System.out.println(rect1.w);
         rect.h = 5; rect.w = 6;            //Viittaavat samaan muistipaikaan rect ja rect1
         System.out.println(rect1.h);
         System.out.println(rect1.w);
         rect.printMe();                    // 5 ja 6
         rect.whoAmI();                     //muistipaikka

        }
}