public class AirPort extends AirPlane{
    private AirPlane airplane;
    private String name;

    public AirPort(String name) {
        this.name = name;
    }

    public String givePermissionToLand(IFlyer flyer) {
        if (flyer instanceof AirPlane) {
            return "Permission granted to land.";
        } else {
            return "Permission denied to land.";
        }
    }

    @Override
    public double calcFuelEfficency(){
        return 0;
    }

    @Override
    public double calcTripDistance(){
        return 0;
    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {
  
    }

    @Override
    public void fly() {
     
    }
}
