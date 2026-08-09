public class Methods7 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() ->{
            while (true) {
                System.out.println("Running");
            }
        });

        t1.setDaemon(true );
        t1.start();

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return; 
    }
    
}
/*
    Daemon thread --> Background running threads --> stops immediately 
    when main threads ends 

    Threads --> user threads , daemon threads 
    Garbage collection --> Daemon thread 
*/
