public class demo3 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
    

    Thread t1 = new Thread(() -> {
        System.out.println("Name of my thread is "+ Thread.currentThread().getName());
        System.out.println("Id of my thread is " + Thread.currentThread().getName());
    });

    t1.start();
   }
}
