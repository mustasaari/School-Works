import java.lang.Math;
import java.util.Optional;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Main {

    static boolean programEnd;

    public static void main(String[] args) {

        System.out.println("--Program Start--");
        Kayttoliittyma kl = new Kayttoliittyma();
        programEnd = false;
        while (!programEnd) {
            kl.doStuff();
        }

        /*
        Person one = new Person("Mikko");
        Programmer two = new Programmer("Olli", 30, "Male", 50 , 50, null);
        Programmer three = new Programmer("Juha", 30, "Male", 50 , 50, one);
        one.printPerson();
        two.printPerson();
        three.printPerson();

        one.setAttractiveness(80);
        two.setAttractiveness(80); */

    }

}

class Person {

    //name, age, gender, spouse (Person),  libido (percent 0 - 100) and attractiveness (percent 0 - 100). 
    private String name;
    private int age;
    private String gender;
    Optional<Person> spouse;
    private int libido;
    private int attractiveness;
    private int alcoholLevel;

    private int baseLibido;

    List<ActionListener> listeners = new ArrayList<>();                                 //5. Luokalla on lista kuuntelijoista

    //Constructor random
    public Person (String name) {
        this.name = name;
        this.age = (int) (Math.random() * 100);
        this.libido = (int) (Math.random() * 100);
        this.attractiveness = (int) (Math.random() * 100);
        int rndGender = (int) (Math.random() * 100);
        if (rndGender < 50 ) {
            this.gender = "Male";
        } else {
            this.gender = "Female";
        }
        this.alcoholLevel = 0;
        spouse = Optional.empty();
        this.baseLibido = this.libido;
    }

    public Person (String name, int age, String gender, int libido, int attractiveness, Person spouse) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.libido = libido;
        this.attractiveness = attractiveness;
        this.spouse = Optional.ofNullable(spouse);
        this.alcoholLevel = 0;
        this.baseLibido = this.libido;
    }

    public void printPerson() {
        System.out.println("Name : " +name);
        System.out.println("Age : " +age);
        System.out.println("Gender : " +gender);
        System.out.println("Libido : " +libido);
        System.out.println("Attractiveness : " +attractiveness);
        System.out.println("Spouse : " +spouse);
        if (this instanceof Programmer) {
            System.out.println("Is Programmer");
        } else {
            System.out.println("Is normal person");
        }
        System.out.println("Alcohol Level : " +alcoholLevel);
    }

    public void setName(String x) {
        name = x;
    }
    public void setAge(int x) {
        age = x;
    }
    public void setGender(String x) {
        gender = x;
    }
    public void setLibido(int x) {
        if (x > 100) {
            x = 100;
        }
        libido = x;
    }
    public void setAttractiveness(int x) {
        attractiveness = x;
        if (this instanceof Programmer) {
            System.out.println("Se on koodari eika voi olla viehattava");
            attractiveness = 0;
        }
    }
    public void setSpouse(Person x) {
        spouse = Optional.ofNullable(x);
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public int getLibido() {
        return libido;
    }
    public int getAttractiveness() {
        return attractiveness;
    }
    public Optional<Person> getSpouse() {
        return spouse;
    }
    public int getBaseLibido() {
        return baseLibido;
    }

    public void drink() {
        alcoholLevel += 5;
    }
    public int getAlcoholLevel() {
        return alcoholLevel;
    }

    public void addActionListener(ActionListener toAdd) {                                   //4. Personille metodi lisätä actionlisteneri
        listeners.add(toAdd);
    }

    public void olenKuullutTapahtuman() {
        System.out.println("Olen kuullut tapahtuman ja mun nimi oli : " +name);
    }

    public void check() {
        if ( libido > baseLibido * 1.2f ) {
            ActionEvent e = new ActionEvent();
            e.setSource(this);
            e.setLibidoPercentage( (int)(   (((float)libido/ (float)baseLibido) -1f) * 100f)) ;       //tässä lasketaan bibido prosentti toivottavasti :|
            System.out.println("Libidoprosentti muutos : " +e.getLibidoPercentage() );

            if ( getLibido() > 20 && getLibido() < 39  ) {
                e.setLibidoString("Mild libido");
            } else if ( getLibido() > 40 && getLibido() < 59 ) {
                e.setLibidoString("Medium libido");
            } else if ( getLibido() > 60 && getLibido() < 79 ) {
                e.setLibidoString("Hot libido");
            } else if ( getLibido() > 80 && getLibido() < 99 ) {
                e.setLibidoString("Extra Hot libido");
            } else if ( getLibido() > 100) {
                e.setLibidoString("Suicide");
            } else {
                e.setLibidoString("none");
            }




            for(ActionListener bl : listeners) {
                bl.actionPerformed(e);
            }
        }
    }

    public String getMyHotness() {
        String hotness = "none";
        if (getLibido() > 20 && getLibido() < 39  ) {
            hotness = "none";
        } else if ( getLibido() > 20 && getLibido() < 39  ) {
            hotness = "Mild libido";
        } else if ( getLibido() > 40 && getLibido() < 59 ) {
             hotness = "Medium libido";
        } else if ( getLibido() > 60 && getLibido() < 79 ) {
            hotness = "Hot libido";
        } else if ( getLibido() > 80 && getLibido() < 99 ) {
             hotness = "Extra Hot libido";
        } else {
            hotness = "Suicide";
        }
        return hotness;
    }

}

class Programmer extends Person {

    int wage;

    public Programmer(String name) {
        super(name);
        wage = 0;
    }

    public Programmer (String name, int age, String gender, int libido, int attractiveness, Person spouse) {
        super(name, age, gender,libido,attractiveness, spouse);
        wage = 0;
    }

}

class Kayttoliittyma {

    Scanner sc;
    ArrayList<Person> persons;

    Listener kuuntelija = new Listener();                                                   //3. tehdään olio Listenerista
    //Person one = new Programmer("Olli", 30, "Male", 30 , 30, null);
    //Person two = new Programmer("Mikko", 35, "Male" ,30 ,30, null);

    Person one = new Programmer("Mikko");
    Person two = new Programmer("Olli");
    Person three = new Person("Henna");
    Person four = new Person("Juha");
    Person five = new Person("Sanna");
    Person six = new Person("Matti");

    public Kayttoliittyma() {
        sc = new Scanner(System.in);
        persons = new ArrayList<>();


        //persons.add( new Programmer("Testiukko") ); //ei lähetä tapahtumaa
        one.addActionListener(kuuntelija);                                                  //6. lisää kuuntelija olioon
        two.addActionListener(kuuntelija);
        three.addActionListener(kuuntelija);
        four.addActionListener(kuuntelija);
        five.addActionListener(kuuntelija);
        six.addActionListener(kuuntelija);

        //two.setSpouse(one);
        //one.setSpouse(two);

        persons.add(one);
        persons.add(two);
        persons.add(three);
        persons.add(four);
        persons.add(five);
        persons.add(six);
    }

    public void doStuff() {
        System.out.println("\ntotally GREAT UI");
        System.out.println("1. Show persons");
        System.out.println("2. Add Random person");
        System.out.println("3. Show all stats tarpeeeeton");
        System.out.println("4. Add Custom person");
        System.out.println("5. Drink");
        System.out.println("9. End");
        int i = sc.nextInt();

        if (i == 1) {
            int l = 1;
            System.out.println();
            for(Person x : persons) {
                //Optional<Person> printSpouse = x.getSpouse();
                //printSpouse.ifPresent( (a) -> System.out.println( a.getName() )  );
                //x.getSpouse().ifPresent( a -> {System.out.println("xxxName : " +a.getName() ); }  );

                System.out.print(l +".   Name : " +x.getName() );
                for (int j = 0; j < 15 - x.getName().length(); j++ ) { System.out.print(" "); }
                System.out.print("     Age : " +x.getAge() +"     Alc : " +x.getAlcoholLevel() +"     Lib : " +x.getLibido() +"     Att : " +x.getAttractiveness() +"     Spouse : " );
                x.getSpouse().ifPresent( a -> {System.out.print( a.getName() ); }  );
                System.out.println();
                l++;
            }
        }
        if (i == 2) {
            System.out.println("Name for new person : ");
            sc.nextLine();
            String newName = sc.nextLine();
            Person tmpPerson = new Person(newName); //
            tmpPerson.addActionListener(kuuntelija);
            persons.add( tmpPerson );
            //persons.add( new Programmer(newName) );

        }
        if ( i == 3) {
            System.out.println("Give name of person : ");
            sc.nextLine();
            String search = sc.nextLine();
            for(Person x : persons) {
                if (x.getName().equals(search)) {
                    x.printPerson();
                }
            }
        }
        if (i == 4) {       //Create custom person/programmer
            boolean programmer;
            sc.nextLine();
            System.out.println("Give name : ");
            String newName = sc.nextLine();
            System.out.println("Is programmer? Y/N");
            String isProgrammer = sc.nextLine();
            if (isProgrammer.equals("Y")) {
                programmer = true;
            } else {
                programmer = false;
            }
            System.out.println("Male or Female? M/F");
            String newGender = sc.nextLine();
            if (newGender.equals("M")) {
                newGender = "Male";
            } else {
                newGender = "Female";
            }


            System.out.println("Age :");
            int newAge = sc.nextInt();
            System.out.println("Libido :");
            int newLibido = sc.nextInt();
            System.out.println("Attractiveness");
            int newAttractiveness = sc.nextInt();

            if (programmer) {
                persons.add( new Programmer(newName, newAge, "male", newLibido, 0, null) );
            } else {
                persons.add( new Person(newName, newAge, "male", newLibido, newAttractiveness, null) );
            }

        }

        if(i == 5) {
            System.out.println("Who should drink?");
            sc.nextLine();
            String drinkname = sc.nextLine();
            for(Person x : persons) {
                if (x.getName().equals(drinkname) ) {
                    x.drink();
                    if (x.getAlcoholLevel() >= 5 && x.getAlcoholLevel() <= 30) {
                        x.setLibido(x.getLibido() +10);
                    }
                    if (x.getAlcoholLevel() > 30) {
                        x.setLibido(x.getLibido() - 5);
                    }

                        //notifyObservers(new LibidoEvent(..));
                        x.check();
                }
            }

        }

        if (i == 9) {
            Main.programEnd = true;
        }
    }

    class Listener implements ActionListener {                                          //2. luokka eventille LISÄTTY
        public void actionPerformed(ActionEvent e) {                    //actioneventistä saadaan source selville
            System.out.println("Tapahtuma tapahtuu");               //ja tänne tulee tieto kun jotain tapahtuu
            System.out.println(e.getLibidoString() + "   " +e.getLibidoPercentage() );
            for(Person x : persons) {
                if (e.getSource() != x ) {      // != x checkkaa että ei itsensä kanssa
                    x.olenKuullutTapahtuman();
                }
                if (x.getMyHotness().equals(e.getLibidoString()) && !x.getMyHotness().equals("none") && e.getSource() != x ) {

                    System.out.println("MATCH MADE IN HEAVEN" +x.getMyHotness() +e.getLibidoString());


                    Person y = (Person) e.getSource();

                    if ( !x.getSpouse().isPresent() && !y.getSpouse().isPresent() ) {       //Sinkkutarkistus
                        System.out.println("CheckSpuse");
                        x.setSpouse(y);
                        y.setSpouse(x);
                    }

                }

            }

        }
    }

}



interface ActionListener {
    public void actionPerformed(ActionEvent e);                                         //1.  interface
}

class ActionEvent {     //actionevent objectin tekoon
    private Object source;
    private int libidoPercentage;
    private String libidoString = "";

    public void setSource(Object source) {
        this.source = source;
    }
    public Object getSource() {
        return this.source;
    }

    public void setLibidoPercentage(int x) {
        libidoPercentage = x;
    }
    public void setLibidoString(String x) {
        libidoString = x;
    }
    public String getLibidoString() {
        return libidoString;
    }
    public int getLibidoPercentage() {
        return libidoPercentage;
    }

}