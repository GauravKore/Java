public class Throw {
    public static void main(String[] args) {
        checkEligibility(-10);
    }
    private static void checkEligibility(int age ){
        if(age <= 0){
            throw new IllegalArgumentException("Age cannot be negative");
        }
        if(age > 18){
            System.out.println("you are eligible to vote");
        }
    }
    
}
