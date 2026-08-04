public class ObjectClass4 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal d = new Dog();

        System.out.println(a.getClass().getName()); // animal 
        System.out.println(d.getClass().getName()); // Dog 

        System.out.println(a instanceof Animal); // true 
        System.out.println(d instanceof Dog);  // true 

        System.out.println(a instanceof Dog ); // false
    }
    
}

class Animal{

}

class Dog extends Animal {


}
