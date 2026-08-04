public class InnerClass {
    public static void main(String[] args) {
    
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.show();

     A.B obj = new A.B();   // Create object of static nested class
    obj.show();  // call method 

        
    }

    
}

// inner class

class Outer {
    int x = 10;

    class Inner {
// if we don't write in inner class int x = 20 ; then it will print 10 
// java automatically Outer outer ; and outer.x 
        int x  = 20;
        void show(){
            System.out.println(x);
            System.out.println(Outer.this.x);
            System.out.println("hello");
        }
    }
}


// if we make inner class static then 

class A {

    static class B {
        void show(){
            System.out.println("Static hello ");
        }
    }

// old java doesn't allow static method in inner class
    static void fun2(){
        System.out.println("good bye");
    }
}