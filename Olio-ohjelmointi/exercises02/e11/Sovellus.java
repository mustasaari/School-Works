class Sovellus {
    public static void main(String [] args){

        Piste origo = new Piste(); // error: constructor Piste in class Piste cannot be applied to given types;
        Piste origo2 = new Piste(6,6);
        Piste origo3 = new Piste(8,4);

        origo.tulostaArvot();
        origo2.tulostaArvot();

        origo.setX(6);
        origo.setY(6);

        if (origo.equals(origo2) ) {
            System.out.println("Is true");
        }
        else {
            System.out.println("Is false");
        }
    }

    public static void tulostaPiste(Piste x) {
        System.out.println("metodi joka tulostaa : ");
        x.tulostaArvot();
    }

    public static void kaynnistaRoskienKeruu() {
        // Käynnistetään roskien keruu.
        System.gc();

        // Odotellaan sekunnin verran.
        try {
            Thread.sleep(1000);
            } catch(InterruptedException e) { 
                e.printStackTrace();
            }
        }
}

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