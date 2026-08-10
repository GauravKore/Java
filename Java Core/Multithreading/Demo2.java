  public class Demo2 {
    public static void main(String[] args) {
        Myrunnable r1 = new Myrunnable();
        Thread t1 = new Thread(r1);
        
        t1.start();
    }
    
}

class Myrunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("thread is running ");
    }
}
 
    

 
    

