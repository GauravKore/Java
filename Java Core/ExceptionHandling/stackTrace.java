// default exception handling
     public class stackTrace {
     public static void main(String[] args) {
        int a = 7 ;
        int b = 0 ;
         
        methodA(a,b);
    }

    private static void methodA(int a , int b){
        methodB(a, b);
    }

    private static void methodB(int a , int b){
        System.out.println(a/b);

     }
}