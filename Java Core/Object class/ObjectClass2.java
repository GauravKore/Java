public class ObjectClass2 {
    public static void main(String[] args) {
        Student s1 = new Student("Gaurav",21);
        Student s2 = new Student("Gaurav", 21);
        System.out.println(s1.equals(s2));

        Student s3 = null;
         Integer i = 21;

        System.out.println(s1.equals(i));

    }
    
}

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
}
