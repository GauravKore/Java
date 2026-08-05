public class ArithmeticExceptionDemo {

    public static void main(String[] args) {

        try {
            System.out.println(5 / 0);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
            System.out.println(e.getMessage());
        }

        System.out.println("Program End");
    }
}
