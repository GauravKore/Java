public class StaticNested{
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner o1 = new Outer.Inner(outer);
        o1.fun();
    }
}

// static nested class 

class Outer{

    private static int x = 4 ;
    int y ;

    static class Inner {
        Outer outer;
        String name ; 
        static int number ;

        Inner(Outer outer){
            this.outer = outer;
        }

        void fun(){
            System.out.println(x);
            System.out.println(outer.y);
        }

        static void fun2(){

        }
    }


}
/* use cases of static nested class 
1.As helper class for any outer class
2.Used in builder design pattern
3.if you want to static methods inside a nested class 
*/