public abstract class Vehicle {
    public abstract double calcFuelEfficency();
    public abstract double calcTripDistance();

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}