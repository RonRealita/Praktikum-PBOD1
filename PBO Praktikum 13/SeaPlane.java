public class SeaPlane extends AirPlane {
    private double maxLoad;
    
    public SeaPlane(double maxLoad){
        this.maxLoad = maxLoad;
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
    public void takeOff(){
        System.out.println("Sea Plane take-off");
    }

    @Override
    public void land(){
        System.out.println("Sea Plane mendarat");
    }

    @Override
    public void fly(){
        System.out.println("Sea Plane sterbang");
    }

    @Override
    public String toString(){
        return("SeaPlane dapat take-off dan mendarat di perairan laut" );
    }
    
}
