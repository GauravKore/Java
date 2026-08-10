import java.util.*;
public class Methods1{
    public static void main(String[] args){
        Collection<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add(3);

        // Size 
        System.out.println(c.size());

        System.out.println(c.isEmpty());
        
        // boolean contains (Object o) --> 1,2,3 --> equals()
        System.out.println(c.contains(2));

        // T[] toArray(T[] a)

        Integer[] arr = c.toArray(new Integer[0]);
        for(Integer i : arr){
            System.out.println(i);
        }

        // boolean add(E e)
        boolean b = c.add(4);
        System.out.println(b);

        // boolean Remove(Object obj)
            System.out.println(c.remove(3));
    }
}