public class Methods2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread starts ");

        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
            System.out.println("Thread 0 Starts");
        });
        t1.start();

        // t1.join(1000);
        t1.join(); // let the t1 first complete its execution 

        System.out.println("Main thread ends ");
    }
}

// join()
/*
main thread --> WAITING
t1 thread --> RUNNABLE --> TERMINATED
main thread --> WAITING --> RUNNABLE--> TERMINATED 
 */
