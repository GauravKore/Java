public class Demo1{
    public static void main(String[] args){
        Mythread t1 = new Mythread();
        t1.start();

    }
}
 class Mythread extends Thread{
    @Override
    public void run(){
        System.out.println("Thread is running");
    }
}