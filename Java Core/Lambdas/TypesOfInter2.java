import java.util.function.Predicate;
import java.util.function.Supplier;

public class TypesOfInter2 {
    public static void main(String[] args) {
        Supplier<Double> RandomValue = () -> Math.random();
        System.out.println(RandomValue.get());

        Predicate<Integer> isEven = x -> x % 2 == 0 ;
        System.out.println(isEven.test(10));
    }
    
}
