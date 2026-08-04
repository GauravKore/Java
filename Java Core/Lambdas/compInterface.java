import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class compInterface {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Aditya", 101, 85) );
        list.add(new Student("Rohit", 102, 89));
        list.add(new Student("Rohan", 103, 90));
        list.add(new Student("Sonu", 10, 95));

        Comparator<Student> c1 = new SortByName();
        Comparator<Student> c2 = new SortByRollNo();
        Comparator<Student> c3 = new SortByMarks();

        Collections.sort(list , c1);

        for(Student s : list){
            System.out.println(s.name + " ," + s.rollNo + " ," + s.marks);

        }


    }
}

class SortByName implements Comparator<Student>{
    @Override
    public int compare(Student s1 , Student s2){
        return s1.name.compareTo(s2.name);
    }
}

class SortByRollNo implements Comparator<Student>{
    @Override
    public int compare(Student s1 , Student s2){
        return s1.rollNo - s2.rollNo;
    }
}

class SortByMarks implements Comparator<Student>{
    @Override
    public int compare(Student s1 , Student s2){
        return s1.marks - s2.marks;
    }
}
class Student  {
    String name ;
    int rollNo ;
    int marks;

    public Student(String name , int rollNo , int marks){
        this.name = name ;
        this.rollNo = rollNo;
        this.marks = marks;
    }
}