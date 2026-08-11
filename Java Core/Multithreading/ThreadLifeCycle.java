public class ThreadLifeCycle{
    public static void main(String[] args) {
        // Thread new stage 

        Thread mainThread = Thread.currentThread();
        Thread t1 = new Thread(() -> {
            System.out.println("name of current thread is "+ Thread.currentThread().getName());
            System.out.println("main thread state "+ mainThread.getState());
        });
        System.out.println(t1.getState());

        // Runnable stage 
        t1.start();
        System.out.println(t1.getState()); // RUNNABLE , TERMINATED(rare)

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println(t1.getState()); // TERMINATED 
    }
}