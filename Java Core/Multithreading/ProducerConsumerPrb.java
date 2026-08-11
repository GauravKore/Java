public class ProducerConsumerPrb{
    public static void main(String[] args) {
        Box box = new Box();
        Thread t1 = new Thread(() -> {
            for(int i = 0 ; i <= 20 ; i++){
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    // TODO: handle exception
                }
                box.producer(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i = 0 ; i <= 20 ; i++){
                try {
                    Thread.sleep(70);
                } catch (Exception e) {
                    // TODO: handle exception
                }
                box.consumer();
            }
        });
        t1.start();
        t2.start();;
    }
}

class Box {
    Integer item  ;
    Boolean flag = false;

    synchronized void producer(int value){
        while (flag  == true) {
            
        }
        item = value;
        flag = true;
        System.out.println("Producer produced "+ item);
    }

    synchronized void consumer(){
        System.out.println("Consumer consumes "+item);
        item = null;
        flag = false;
    }

}