public class ExceptionHandling1 {
    public static void main(String[] args) {
        // Exception Handling 
        
        System.out.println("step 1");
        try {
            // risky code 
            int a = 9 ; 
            int b = 0 ;
            System.out.println(a/b);
        } catch (Exception e) {
            // preventive code 
            // TODO: handle exception
            System.out.println("Divide by zero is not allowed");
        }
        finally{
            // this always runs
            // no matter wether exception is occurs or not  
            // clean up code  (optional)
            // resources close , logging 
            System.out.println("Heyyy");
        }
        System.out.println("step 2 ");
    }
    
}
