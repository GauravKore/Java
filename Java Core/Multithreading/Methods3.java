public class Methods3 {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            for(int i = 1 ; i <= 10 ; i++){
                System.out.println("T1 :" +i);
                Thread.yield();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 1 ; i <= 10 ; i++){
                System.out.println("T2 :" +i);
            }
        });

        t1.start();
        t2.start();
        
    }
    
}
 /*
Thread.yeild() --> I am willing to give my cpu time to someone else with  same priority 
and that wants to run

it is request for os --> os reject most of the  times 
current thread does not go to --> WAITING , TIMED_WAITING , TERMINATED
it goes to only runnable star=te

 */
