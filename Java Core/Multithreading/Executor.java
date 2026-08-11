import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor{
    public static void main(String[] args) {
        // Executor framework
        ExecutorService executor = Executors.newFixedThreadPool(2);
        // number of tasks = 5

        for(int i = 1 ; i <= 5 ; i++ ){
            int TaskId = i;

            executor.execute(() ->{
                System.out.println("Task " + TaskId + "is performed by" + 
                Thread.currentThread().getName());
            } );
        }
        executor.shutdown();
    }
}