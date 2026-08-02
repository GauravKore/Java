public class abstraction {
    public static void main(String[] args) {
        car c = new fuelCar();
        c.Start();
        c.accelerate();
        c.brake();

            
        
        
    }
    
}

abstract class car {
    void Start(){
        System.out.println(" Car is started");
    }

    abstract void accelerate();
    abstract void brake();
}

class electricCar extends car{

    @Override
    void accelerate(){
        System.out.println("electric car is accelerating at speed 100");
    }

    @Override
    void brake(){
        System.out.println("electric car is stopping");
    }

}


class fuelCar extends car{
    @Override
    void accelerate(){
        System.out.println("fuel car is accelerating at speed 100");
    }

    @Override
    void brake(){
        System.out.println("fuel car is stopping");
    }

}
