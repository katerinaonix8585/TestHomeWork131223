public class Car extends Vehicle{
    public String model;

    public Car(String brand, int year, String model) {
        super(brand, year);
        this.model = model;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", this.model, this.brand, this.year);
}
}