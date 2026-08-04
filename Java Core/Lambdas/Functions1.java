import java.util.*;
import java.util.stream.Stream;
public class Functions1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,4,11,13,34,13,34));

        // Intermediate Function

        list.stream()
            .filter(x -> x > 10)
            .map(x -> x * 2)
            .peek(System.out :: println)
            .sorted((a,b) -> b-a)
            .distinct()
            .forEach(System.out::println);

        List<List<Integer>> list2 = List.of(
            List.of(1,2),
            List.of(3,4)
        );

        list2.stream()
             .flatMap(x -> x.stream())
             .map(x -> x * 2)
             .forEach(System.out :: println);

        Stream.iterate(1,x -> x + 1)
            .limit(20)
            .skip(6)
            .forEach(System.out :: println);
    }
    
}

//filter()
// map()
// flatMap() --> flatening operation 
// sorted() --> Stateful 
// distinct() --> keep unique values(Hashing) --> Stateful
// Skip() , Limit()
// peek() --> to see into pipeline (Debugging)