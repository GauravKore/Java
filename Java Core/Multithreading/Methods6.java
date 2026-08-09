public class Methods6 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() ->{
            System.out.println("custom thread is running ");
        });
        
        Thread t2 = new Thread(() ->{
            System.out.println("custom-2 thread is running ");
        });

        t1.start();
        t2.start();
        t1.setPriority(10);

        System.out.println(t1.getPriority());

    }
    
}

/*
    Thread priority --> 
    MAX_PRIORITY = 10
    MIN_PRIORITY = 1
    NORM_PRIORITY = 5

    depends on os
    --> may respect PRIORITY
    --> may partial respect 
    --> may not at all
*/
