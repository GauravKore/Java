import java.util.Objects;

public class MyObjectClass3 {
    public static void main(String[] args) {
        Student s1 = new Student("Gaurav",21);
        Student s2 = new Student("Gaurav", 21);
        System.out.println(s1.equals(s2));


        System.out.println(s1.hashCode() == s2.hashCode());
        System.out.println(s1.getClass().getName());

        System.out.println(s1 instanceof Student); // true 
        System.out.println(s1 instanceof Object); // true 
        
    }
    
}
// instanceOf operator --> check if an object is instance of of a class or any of its subclass

class Student {
    String name ;
    int age ;

    Student(String name , int age ){
        this.name = name ;
        this.age = age;
    }

    @Override
    public String toString(){
        return (name + " ,"+ age );
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true ;
        
        // nullpointerexception
        if(obj == null){
            return false;
        }
        // check if both classes are of type student 
        // if not checked --> classCastException 
        if(obj.getClass() != this.getClass()){
                return false;
        }
        Student s = (Student) obj;
        return(this.name == s.name && this.age ==s.age);
    }

    @Override
    public int hashCode(){
        // int result = 17;
        // result = result * 17 + age ;
        // result = result * 31 + ((name == null) ? 0 : name.hashCode()) ;

        // return result;

        return Objects.hash(name ,age);
    }
}

