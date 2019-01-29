class Sovellus {
    public static void main(String [] args){
        Piste origo = new Piste();

        System.out.println(origo.x);    // nolla
        System.out.println(origo.y);    // nolla
    }
}

class Piste {
    public int x;
    public int y;
}