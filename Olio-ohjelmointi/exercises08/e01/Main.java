import java.lang.Math;
import java.util.Optional;
import java.util.Scanner;
import java.util.ArrayList;

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
    }

    public Person (String name, int age, String gender, int libido, int attractiveness, Person spouse) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.libido = libido;
        this.attractiveness = attractiveness;
        this.spouse = Optional.ofNullable(spouse);
        this.alcoholLevel = 0;
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
        libido = x;
    }
    public void setAttractiveness(int x) {
        attractiveness = x;
        if (this instanceof Programmer) {
            System.out.println("Se on koodari");
            attractiveness = 0;
        }
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

    public void drink() {
        alcoholLevel += 1;
    }
    public int getAlcoholLevel() {
        return alcoholLevel;
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

    public Kayttoliittyma() {
        sc = new Scanner(System.in);
        persons = new ArrayList<>();

        //Programmer two = new Programmer("Olli", 30, "Male", 50 , 50, null);

        persons.add( new Programmer("Testiukko konstruktorista") );
    }

    public void doStuff() {
        System.out.println("\ntotally GREAT UI");
        System.out.println("1. Show persons");
        System.out.println("2. Add Random person");
        System.out.println("3. Show all stats");
        System.out.println("4. Add Custom person");
        System.out.println("9. End");
        int i = sc.nextInt();

        if (i == 1) {
            int l = 1;
            System.out.println();
            for(Person x : persons) {
                System.out.println(l +". " +x.getName() );
                l++;
            }
        }
        if (i == 2) {
            System.out.println("Name for new person : ");
            sc.nextLine();
            String newName = sc.nextLine();
            persons.add( new Programmer(newName) );
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

        if (i == 9) {
            Main.programEnd = true;
        }
    }

}