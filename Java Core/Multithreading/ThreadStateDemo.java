class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class ThreadStateDemo {

    public static void main(String[] args) {

        MyThread t = new MyThread();

        System.out.println("Before start(): " + t.getState());

        t.start();

        System.out.println("After start(): " + t.getState());
    }
}