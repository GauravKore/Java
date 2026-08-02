public class inheritance {
    public static void main(String[] args) {
        enginneringStudent e1 = new enginneringStudent();
        e1.markAttdence();

        Student s1 = new Student();
        s1.markAttdence();
        
    }
    
}

class Student {
    String name ;
    int age ; 
    String college;
    
    public void markAttdence(){
        System.out.println("Attdence is maarked");
    }
}

class enginneringStudent extends Student{

    void attendLabs(){
        System.out.println("labs are attended");

    }
}