import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        // Set<String> set = new HashSet<>();
        // set.add("Aditya");
        // set.add("Rohan");
        // set.add("Rohit");

        // System.out.println(set.contains("Varad"));

        // Map<Integer,String> map = new HashMap<>();
        // map.put(101,"Aditya");
        // map.put(102,"Rohit");
        // map.put(103, "Aditya");
        
        // System.out.println(map.containsKey(101));
        // System.out.println(map.get(103));

         Map<Integer, String> map = new HashMap<>();

map.put(101, "Rahul");
map.put(102, "Amit");
map.put(101, "Priya");

System.out.println(map);
System.out.println(map.size());
    }
    
}
