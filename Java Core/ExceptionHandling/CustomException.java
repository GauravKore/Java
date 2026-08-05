public class CustomException {

    static void checkAge(int age)  {

        if (age < 18) {
            throw new InvalidAgeException("Minimum age is 18.");
        }

        System.out.println("Eligible");

    }

    public static void main(String[] args) {

        try {
            checkAge(20);
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

    }

}
class InvalidAgeException extends RuntimeException {

    public InvalidAgeException(String message) {
        super(message);
    }

}