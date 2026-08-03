public class LooseCouplingInterfaces{
    public static void main(String[] args) {
        Car c1 = new Car(new PetrolEngine());

        Car c2 = new Car(new DieselEngine());
        c1.drive();
        
    }
}

interface Engine {
    void start();
}

class PetrolEngine implements Engine {

    public void start() {
        System.out.println("Petrol Engine Started");
    }
}

class DieselEngine implements Engine {

    public void start() {
        System.out.println("Diesel Engine Started");
    }
}

class Car {

    private Engine engine;

    Car(Engine engine) {
        this.engine = engine;
    }

    void drive() {
        engine.start();
    }
}