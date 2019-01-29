
class Main {

    public static void main(String[] args) {

        int one = Integer.parseInt(args[0]);
        int two = Integer.parseInt(args[1]);

        try {
           division(one, two);
        } catch (CannotBeTenException e) { 
            e.error();
        }
    }

    public static int division (int a, int b) throws CannotBeTenException {
        int result;
        result = a/b;
            if (result == 10) {
                CannotBeTenException olio = new CannotBeTenException();
                System.out.println("1. virheolio luotu");
                throw olio;
            }
        System.out.println(result);
        return result;
    }
}

class CannotBeTenException extends RuntimeException {
    public void error() {
        System.out.println("2. ei voi kymppi tulla");
    }
}