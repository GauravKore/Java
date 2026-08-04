import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TypesOfInter3 {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0 ;
        System.out.println(isEven.test(8));
        System.out.println(isEven.test(7));

        Consumer <String> print = x -> System.out.println(x);
        print.accept("Hello Gaurav");

        Supplier<Integer> number = () -> 100;
        System.out.println(number.get());

        Function<String, Integer> length = str -> str.length();
        System.out.println(length.apply("Java"));

    }
    
}
