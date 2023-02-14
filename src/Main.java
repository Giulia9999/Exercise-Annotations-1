public class Main {
    @SuppressWarnings(value = "deprecation")

    public static void main(String[] args) {
        Car car = new Car("A4", 200000);
        car.printCarDetails();
        car.getCarDetails();
    }
}
