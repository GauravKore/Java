import java.util.*;
public class ListMethods{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list.get(1));
        list.set(2, 7);

        list.addAll(0,List.of(8,9));

        list.remove(2);

        list.indexOf(2);
        list.lastIndexOf(3);
        System.out.println(list);


        ListIterator<Integer> it = list.listIterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        List<Integer> l = List.of(1,2,3,4,5,6,7,8);
        // l.add(9); --> list is immutable 

        List<Integer> l2 = List.copyOf(l);
        // l2.add(9); --> list is immutable 

        System.out.println(l2);








    }
}