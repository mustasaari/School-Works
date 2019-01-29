class Sovellus {
    public static void main(String [] args){
        Piste origo = new Piste();
        origo.tulostaArvot();

        origo.setX(-99);
        origo.setY(80);

        origo.tulostaArvot();
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