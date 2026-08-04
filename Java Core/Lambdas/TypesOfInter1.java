import java.util.function.Consumer;
import java.util.function.Function;

public class TypesOfInter1 {
    public static void main(String[] args) {
        Function<Integer , Integer>  sqaure = x -> x * x ;
        System.out.println(sqaure.apply(5));

        Consumer<Integer> print = x -> System.out.println(x);
        print.accept(87);
    }
    
}
