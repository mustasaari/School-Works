package coordinate;

public class Point {
        private int x;
        private int y;   

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