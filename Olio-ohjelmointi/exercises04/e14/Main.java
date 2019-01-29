
class Main {      
    public static void main(String[] Args) {

        Employee mikko = new Employee("Mikko", "12.12.1983",  250, "20.08.2017");
        System.out.println(mikko.toString());

    }
}

class Employee extends Person {
    private double wage;
    private String startDate = "00.00.0000";
    Date date;

    public Employee(String name, String birthday,double wage,String startday) {
        super(name);
        setWage(wage);
        setStartDate(startday);
        date = new Date(birthday);

    }

    public String toString() {
        String tmp = "Name : ";
        tmp += getName();
        tmp += "\nWage : ";
        tmp += Double.toString(wage);
        tmp += "\nBirthdate : ";
        tmp += date.getDate();
        tmp += "\nStartdate : ";
        tmp += startDate;
        return tmp;
    }

    public void setWage(double a) {
        this.wage = a;
    }
    public void setStartDate(String a) {
        this.startDate = a;
    }

}

class Person {
    private String name = "";

    public Person(String a) {
        setName(a);
    }

    public void setName(String a) {
        name = a;
    }
    public String getName() {
        return name;
    }
}

class Date {

    private String date = "00.00.0000";

    public Date(String a) {
        setDate(a);
    }

    public String getDate(){
        return date;
    } 
    public void setDate(String a) {
        date = a;
    }
}