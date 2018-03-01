import third.Pickup;
import third.Sedan;
import third.Truck;

public class Test3 {
    public static void main(String[] args){
        Pickup pickup = new Pickup();
        Sedan sedan = new Sedan();
        Truck truck = new Truck();
        pickup.iLostMyKey();
        truck.moveCargo();
        pickup.moveCargo();
        pickup.movePassengers();
        sedan.movePassengers();
    }
}
