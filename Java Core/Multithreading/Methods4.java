public class Methods4 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() ->{
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Running");
            }
        });

        t1.start();
        Thread.sleep(2000);
        t1.interrupt();
        
    }
    
}
/*
    Thread --> interrupt flag (default false )
    t1.interrupt --> flag= true 
    t1.interrupt() --> sends a signal to t1 thread that it should doing what its doing

    we can gracefully handle 
    1. you can make a thread run until condition 
    2. cancelling a long running task 
    3. used to stop thread pool

    isInterrupted --> return Interrupted flag value(T/F)
    Interrupted --> return Interrupted flag value(T/F) but also set it back to false 


*/
