public class DiamondProjava8 {
    public static void main(String[] args) {
        
    }
    
}

interface A {
        void fun();
}

interface B extends A{
        default void fun(){
            System.out.println("B");
        }
}

interface C extends A{
        default void fun(){
            System.out.println("B");
        }

}

class D implements B , C {


}