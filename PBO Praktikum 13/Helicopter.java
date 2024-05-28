public class Helicopter extends AirPlane {
    private double maxLoad;
    
    public Helicopter(double maxLoad){
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
    public void takeOff() {
        System.out.println("Helicopter take-off.");
    }

    @Override
    public void land() {
        System.out.println("Helicopter mendarat.");
    }

    @Override
    public void fly() {
        System.out.println("Helicopter terbang.");
    }

    @Override
    public String toString() {
        return "Helicopter hanya memerlukan landasan kecil";
    }
}
