class Main {

    public static void main(String[] Args) {

        Point po = new Point();
        Pixel pi = new Pixel();

        po.x = 15;
        po.y = 16;
        pi.x = 6;
        pi.y = 5;
        pi.color = "Keltainen";

        System.out.println("Vastaus on : " +po.x +" " +po.y +" " +pi.x +" " +pi.y +" " + pi.color);
        
    }

}

class Point {
        public int x;
        public int y;
}

class Pixel extends Point {
    public String color = "";
}