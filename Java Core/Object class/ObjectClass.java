public class ObjectClass {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Gaurav";
        s1.age = 21;
        // s1 means s1.toString() --> automatically by java 
        System.out.println(s1);
        
    }
    
}
// extends Object is optional

class Student extends Object{
    String name ;
    int age ;

    @Override
    public String toString(){
        return (name + " , " + age);
        }
}
