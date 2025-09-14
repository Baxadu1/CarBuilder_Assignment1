//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car sportsCar = new Car.Builder()
                .setSeats(2)
                .setEngine("Sport Engine")
                .setGPS(true)
                .setTripComputer(true)
                .build();

        Car familyCar = new Car.Builder()
                .setSeats(5)
                .setEngine("Eco Engine")
                .setGPS(false)
                .setTripComputer(true)
                .build();

        System.out.println(sportsCar);
        System.out.println(familyCar);
        }
}
