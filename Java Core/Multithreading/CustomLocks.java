public class CustomLocks {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        Thread t1 = new Thread(() -> b1.deposit());
        Thread t2 = new Thread(() -> b1.Withdraw());
        
        t1.start();
        t2.start();
    }
    
}

class Bank {
    Object lock1 = new Object();
    Object lock2 = new Object();

    void deposit(){
        synchronized(lock1){
            System.out.println("Deposit Logic");
        }
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        System.out.println("deposit logic ends");
    }

    void Withdraw(){
        synchronized(lock2){
            System.out.println("Withdraw Logic");
        }
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            
        }
         System.out.println("withdraw logic ends");

    }
}
