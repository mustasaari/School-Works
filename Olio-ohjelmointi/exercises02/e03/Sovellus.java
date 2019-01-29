class Sovellus {
    public static void main(String [] args){
        Piste origo = new Piste();

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

    }
}

class Piste {
    public int x;
    public int y;

    void tulostaArvot() {
        System.out.println("X : " +x);
        System.out.println("Y : " +y);
    }
}