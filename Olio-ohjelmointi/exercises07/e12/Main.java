import java.util.Optional;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Computer kone;

        Scanner sc = new Scanner(System.in);
        System.out.println("Computer name :");
        String name = sc.nextLine();
        System.out.println("Has hisplay? Y/N :");
        String hasdisplay = sc.nextLine();
        if (hasdisplay.equals("Y")) {
            System.out.println("Resolution :");
            String hasreso = sc.nextLine();
            kone = new Computer(name, new Display(hasreso) );
        } else {
            kone = new Computer(name);
        }

        //Computer tietsikka = new Computer("Compaq", new Display("640x480") );
        //Computer tietsikka2 = new Computer("Compaq2");

        System.out.println("Computer info : \n\n");
        System.out.println("Brand : " +kone.getBrand());
        kone.getDisplay().ifPresent( reso -> {System.out.println("Resolution : " +reso.getResolution() ); }  );
        //tietsikka2.getDisplay().ifPresent( reso -> {System.out.println(reso.getResolution() ); }  );

    }

}

class Computer {

    String brand;
    Optional<Display> display;

    public Computer(String b, Display d) {

        System.out.println("Computer Created");
        brand = b;
        display = Optional.ofNullable(d);
    }

    public Computer(String b) {

        System.out.println("Computer Created");
        brand = b;
        display = Optional.empty();
    }

    public void setDisplay(Display d) {
        display = Optional.of(d);
    }

    public Optional<Display> getDisplay() {
        return display;
    }

    public String getBrand() {
        return brand;
    }
}

class Display {

    String resolution;

    public Display(String reso) {
        System.out.println("Display Created");
        resolution = reso;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String r) {
        resolution = r;
    }

}