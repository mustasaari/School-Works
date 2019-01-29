class Sovellus {
    public static void main(String [] args){
        Piste origo = new Piste();
        Piste origo3 = new Piste();

        System.out.println(origo.x);    // nolla
        System.out.println(origo.y);    // nolla

        System.out.println(origo);      //Piste@368239c8

        Piste origo2 = origo;

        System.out.println(origo2);     //Piste@368239c8

        origo.x = 9;
        origo.y = 5;

        System.out.println(origo2.x);   //9
        System.out.println(origo2.y);   //5

        origo.tulostaArvot();
        origo.kukaMinaOlen();           //Piste@368239c8    //muistipaikkaan
        origo2.kukaMinaOlen();          //Piste@368239c8
        origo3.kukaMinaOlen();          //Piste@24273305


        Piste p = new Piste();          //teht 5
        System.out.println("p : " +p);
        p = null;
        kaynnistaRoskienKeruu();        //p : Piste@12bc6874
                                        //    Deleting: Piste@12bc6874

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
    public int x;
    public int y;

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