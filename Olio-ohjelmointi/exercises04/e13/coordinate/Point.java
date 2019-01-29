package coordinate;

public class Point {
        private int x;
        private int y;   

        public Point() {
            System.out.println("Point Created");
        }

        public Point(int x, int y) {
            System.out.println("Point Created (parameter contructor)");
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            String tmp = "x : ";
            tmp += Integer.toString(x);
            tmp += "  y : ";
            tmp += Integer.toString(y);
            return tmp;
        }

        public void print() {
            System.out.println("Print : x = " +x +" y = " +y);
        }

        public int getY() {
            return y;
        }
        public int getX() {
            return x;
        }
        public void setX(int par) {
            x = par;
        }
        public void setY(int par) {
            y = par;
        }
}