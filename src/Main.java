public class Main {
    public static void main(String[] args) {
        Car car = new Car("Audi", 2021, "XXX");
        System.out.println(car.toString());

        Vehicle vehicle = new Vehicle("Audi", 2021);
        vehicle.displayInfo();

        car.displayInfo();



    }
}