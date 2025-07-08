package Java3;

    public class RaceTrack {
        private final int distance;

        // Constructor
        public RaceTrack(int distance) {
            this.distance = distance;
        }

        // Method to check if a car can finish the race
        public boolean carCanFinish(NeedForSpeed car) {
            int maxDrives = 100 / car.batteryDrain; // total number of drives before battery runs out
            int totalDistance = maxDrives * car.speed;
            return totalDistance >= distance;
        }
    }

