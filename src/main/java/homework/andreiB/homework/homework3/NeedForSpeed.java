package homework.andreiB.homework.homework3;

public class NeedForSpeed {

    public class Main {

        static int speed;
        static int batteryDrain;
        static int distanceDriven;
        static int battery;

        static void setupCar(int spd, int drain) {
            speed = spd;
            batteryDrain = drain;
            distanceDriven = 0;
            battery = 100;
        }

        static void drive() {
            if (battery >= batteryDrain) {
                distanceDriven += speed;
                battery -= batteryDrain;
            }
        }

        static int distanceDriven() {
            return distanceDriven;
        }

        static boolean batteryDrained() {
            return battery < batteryDrain;
        }

        static int maxDistance() {
            return (battery / batteryDrain) * speed;
        }

        static boolean carCanFinish(int raceDistance) {
            return maxDistance() >= raceDistance;
        }

        public static void main(String[] args) {
            setupCar(5, 2);

            int raceDistance = 100;
            System.out.println("Can car finish race? " + carCanFinish(raceDistance));

            while (!batteryDrained()) {
                drive();
            }

            System.out.println("Distance driven: " + distanceDriven());
        }
    }


}
