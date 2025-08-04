interface Vehicle{
    void start();
    void stop();
}
class Bike implements Vehicle{
    public void start(){
        System.out.println("Bike started with key.");
    }
    public void stop(){
        System.out.println("Bike stopped.");
    }
}

class Car implements Vehicle{
    public void start(){
        System.out.println("Car started with push button.");
    }
    public void stop(){
        System.out.println("Car stopped.");
    }
}
public class VehicleInterface {
    public static void main(String[] args) {
        Vehicle v1= new Bike();
        Vehicle v2= new Car();
        v1.start();
        v1.stop();
        
        v2.start();
        v2.stop();
    }
}
