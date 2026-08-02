// types of inheritance 
  public class inheritance2 {
    public static void main(String[] args) {
      
    }
    
}

class Student {
  String name ;
  int age ;
  int rollNumber ;

  Student(){}
  Student(String name , int age , int rollNumber ){
      this.name = name ;
      this.age = age ;
      this.rollNumber = rollNumber;
}
}

class engineeringStudent extends Student {
  engineeringStudent(){
      super();
  }


}