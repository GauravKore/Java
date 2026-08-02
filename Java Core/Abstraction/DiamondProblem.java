public class DiamondProblem {
    public static void main(String[] args) {
        D d = new D();
        d.fun();
        
    }
    
}

interface A {
        void fun();
}

interface B extends A{

}

interface C extends A{

}

class  D implements B ,C {
    @Override
    public void fun(){
            System.out.println("Diamond problem solved ");
    }

}