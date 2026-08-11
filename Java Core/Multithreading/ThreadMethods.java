public class ThreadMethods {
    public static void main(String[] args) {
        System.out.println("Main thread starts");
        try {
            Thread.sleep(2000); // does not release locks 
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
        System.out.println("main thread ends");
    }
    
}
// Thread methods 
// Thread.sleep(Miliseconds) --> TIMED_WAITING
// RUNNABLE --> TIMED_WAITING --> RUNNABLE
