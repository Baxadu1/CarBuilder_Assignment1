public class Car {
    private final int seats;
    private final String engine;
    private final boolean hasGPS;
    private final boolean hasTripComputer;

    private Car(Builder builder) {
        this.seats = builder.seats;
        this.engine = builder.engine;
        this.hasGPS = builder.hasGPS;
        this.hasTripComputer = builder.hasTripComputer;
    }
    public String toString() {
        return "Car [Seats=" + seats +
                ", Engine=" + engine +
                ", GPS=" + hasGPS +
                ", TripComputer=" + hasTripComputer + "]";
    }

    public static class Builder {
        private int seats;
        private String engine;
        private boolean hasGPS;
        private boolean hasTripComputer;

        public Builder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public Builder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder setGPS(boolean gps) {
            this.hasGPS = gps;
            return this;
        }

        public Builder setTripComputer(boolean tripComputer) {
            this.hasTripComputer = tripComputer;
            return this;
        }

}
