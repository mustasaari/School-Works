import java.util.ArrayList;

class Sovellus {
      public static void main(String... args) {

          Piste alkupiste = new Piste(7,7);

          Line line = new Line(5,5,10,10);

          System.out.println(line);

          line.setStartingPoint(alkupiste);
          System.out.println(line);

          alkupiste.setX(12);
          alkupiste.setY(17);

          System.out.println(line);

      }
}


class Line {
    private Piste startingPoint;
    private Piste endingPoint;

    public Line(int startX, int startY, int endX, int endY) {
        startingPoint = new Piste(startY, startX);
        endingPoint = new Piste(endX, endY);
    }

    void setStartingPoint(Piste piste) {
        startingPoint.setX(piste.getX());
        startingPoint.setY(piste.getY());
    }
    void setEndingPoint(Piste piste) {
        endingPoint.setX(piste.getX());
        endingPoint.setY(piste.getY());
    }
    void setStartingPoint(int x, int y) {
        startingPoint.setX(x);
        startingPoint.setY(y);
    }
    void setEndingPoint(int x, int y) {
        endingPoint.setX(x);
        endingPoint.setY(y);
    }
    public Piste getStartingPoint() {
        return startingPoint;
    }
    public Piste getEndingPoint() {
        return endingPoint;
    }

    public String toString() {
        String returnString = "";
        returnString = "[x = " +startingPoint.getX() +" y = " +startingPoint.getY() +"], [x = " +endingPoint.getX() +" y = " +endingPoint.getY() + "]";
        return returnString;
    }
}






    /**
     *
     *
     *
     *
     */


class Piste {
    private int x;      //y has private access in Piste
    private int y;         //private eli pääsee käsiksi vaan luokan sisältä

    public Piste(){
        setX(0);
        setY(0);
    }

    public Piste(int x, int y) {
        setX(x);
        setY(y);
    }

    public void setX(int xPos) {
        if ( xPos >= 0) {
            x = xPos;
        }
        else {
            x = 0;
        }
    }

    public void setY(int yPos) {
        if ( yPos >= 0) {
            y = yPos;
        }
        else {
            y = 0;
        }
    }

    public boolean equals(Piste x) {
        boolean returnValue;
        if (x.getX() == this.x && x.getY() == this.y) {
            returnValue = true;
        }
        else {
            returnValue = false;
        }
        return returnValue;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    void tulostaArvot() {
        System.out.println("X : " +x);
        System.out.println("Y : " +y);
    }

    void kukaMinaOlen() {
        System.out.println(this);  
    }

    protected void finalize() {
        System.out.println("Deleting: " + this);
   }
}