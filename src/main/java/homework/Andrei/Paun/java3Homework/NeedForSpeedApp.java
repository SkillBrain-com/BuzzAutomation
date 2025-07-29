package homework.Andrei.Paun.java3Homework;

public class NeedForSpeedApp {


        public static void main(String[] args) {
            // TASK 1: Creăm o mașină personalizată
            NeedForSpeed car1 = new NeedForSpeed(5, 2);
            car1.drive();
            System.out.println("Distance driven: " + car1.distanceDriven()); // 5
            System.out.println("Battery drained: " + car1.batteryDrained()); // false

            // TASK 5: Nitro car
            NeedForSpeed nitroCar = NeedForSpeed.nitro();
            nitroCar.drive();
            System.out.println("Nitro distance driven: " + nitroCar.distanceDriven()); // 50

            // TASK 2 + 6: Pista + verificăm dacă mașina poate termina
            RaceTrack race = new RaceTrack(100);
            System.out.println("Can car1 finish 100m? " + race.carCanFinish(car1)); // true
            System.out.println("Can nitro finish 1000m? " + new RaceTrack(1000).carCanFinish(NeedForSpeed.nitro())); // false
        }
    }

    class NeedForSpeed {
        private int speed;
        private int batteryDrain;
        private int battery = 100;
        private int distance = 0;

        // TASK 1: Constructor
        public NeedForSpeed(int speed, int batteryDrain) {
            this.speed = speed;
            this.batteryDrain = batteryDrain;
        }

        // TASK 3 & 4: drive și distance
        public void drive() {
            if (!batteryDrained()) {
                distance += speed;
                battery -= batteryDrain;
            }
        }

        public int distanceDriven() {
            return distance;
        }

        public boolean batteryDrained() {
            return battery < batteryDrain;
        }

        // TASK 5: Nitro car
        public static NeedForSpeed nitro() {
            return new NeedForSpeed(50, 4);
        }

        // getter necesar pentru carCanFinish
        public int getSpeed() {
            return speed;
        }

        public int getBatteryDrain() {
            return batteryDrain;
        }
    }

    class RaceTrack {
        private int distance;

        // TASK 2: Constructor
        public RaceTrack(int distance) {
            this.distance = distance;
        }

        // TASK 6: Verificăm dacă mașina poate termina cursa
        public boolean carCanFinish(NeedForSpeed car) {
            int maxDrives = 100 / car.getBatteryDrain(); // de câte ori poate conduce
            int maxDistance = maxDrives * car.getSpeed(); // cât poate parcurge
            return maxDistance >= distance;
        }
    }


