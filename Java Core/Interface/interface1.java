public class interface1 {
    public static void main(String[] args){
        car c1 = new electricCar();
        c1.Start();
        c1.accelerate();
        c1.brake();

    }

    
}

interface  car {
     void Start();
     void  accelerate();
     void brake();
}

class electricCar implements car{

    @Override
    public void Start(){
        System.out.println("electric car is started");
    }

    @Override
    public void accelerate(){
        System.out.println("electric car is accelerating at speed 100");
    }

    @Override
    public void brake(){
        System.out.println("electric car is stopping");
    }

}


class fuelCar implements car{

    @Override
    public void Start() {
        System.out.println("fuel car is started");
        
    }
    @Override
    public void accelerate(){
        System.out.println("fuel car is accelerating at speed 100");
    }

    @Override
    public void brake(){
        System.out.println("fuel car is stopping");
    }

}
