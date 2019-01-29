
class Main {

    public static void main(String[] args) {
        System.out.println(" ");
        int one = Integer.parseInt(args[0]);
        int two = Integer.parseInt(args[1]);
        try {
            int result = one / two;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Nollalla ei voi jakaa");
        }

    }

}