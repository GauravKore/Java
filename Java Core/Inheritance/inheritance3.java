public class inheritance3 {
    public static void main(String[] args) {

        student p = new student();
        p.age = 27;
        p.course = "JAVA ";
        p.name = "Gaurav ";
        p.rollno = 2303087 ;

        p.displaypersoninfo();
        p.displayStudentInfo();


    }
    
}

class person {
    String name ;
    int age ;

    void displaypersoninfo(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

class student extends person {
    int rollno ; 
    String course ;
     
    void displayStudentInfo(){
        System.out.println("rollno  : " + rollno);
        System.out.println("course  : " + course);
    }
}
