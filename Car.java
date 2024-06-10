public class Car {
    private int wheels;
    private int airBags;
    
    public Car(int wheels, int airBags){
        this.wheels=wheels;
        this.airBags=airBags;
    }

    public int getWheels() {
        return wheels;
    }

    public int getAirBags() {
        return airBags;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setAirBags(int airBags) {
        this.airBags = airBags;
    }

    @Override
    public String toString() {
        return "Car [wheels=" + wheels + ", airBags=" + airBags + "]";
    }

}
