
package methodOverridng;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.engine();
        
        Car car = new Car();
        car.engine();
        
        Bike bike = new Bike();
        bike.engine();
    }
    
}
