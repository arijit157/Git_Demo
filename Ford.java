public class Ford extends Car{
    private String modelName;
    private int price;
    
    public Ford(int wheels, int airBags, String modelName, int price) {
        super(wheels, airBags);
        this.modelName = modelName;
        this.price = price;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ford: "+this.getWheels()+" "+this.getAirBags()+" "+this.getModelName()+" "+this.getPrice();
    }

}
