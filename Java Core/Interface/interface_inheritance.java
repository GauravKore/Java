public class interface_inheritance {
    public static void main(String[] args) {
    StreetDog d1 =  new StreetDog();
    d1.eat();
    d1.bark();
        
    }
    
}

interface Animal {
    void eat();
}

interface Dog extends Animal {
    void bark();
}

class StreetDog implements Dog{
    @Override
    public void eat(){
            System.out.println("eating ");
    }

    @Override 
    public void bark(){
        System.out.println("Barking");
    }
}
