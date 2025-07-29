package homework.Andrei.Paun.java3Homework;

public class ElonsToyCarApp {


        public static void main(String[] args) {
            ElonsToyCar car = ElonsToyCar.buy();

            // Exemplu de rulare
            System.out.println(car.distanceDisplay()); // "Driven 0 meters"
            System.out.println(car.batteryDisplay());  // "Battery at 100%"

            // Conduce de 2 ori
            car.drive();
            car.drive();
            System.out.println(car.distanceDisplay()); // "Driven 40 meters"
            System.out.println(car.batteryDisplay());  // "Battery at 98%"

            // Conduce până se termină bateria
            for (int i = 0; i < 200; i++) {
                car.drive();
            }

            System.out.println(car.distanceDisplay()); // "Driven 2000 meters"
            System.out.println(car.batteryDisplay());  // "Battery empty"
        }
    }

    class ElonsToyCar {
        private int battery = 100;
        private int distance = 0;

        // Task 1: creăm o nouă mașinuță
        public static ElonsToyCar buy() {
            return new ElonsToyCar();
        }

        // Task 2: afișăm distanța parcursă
        public String distanceDisplay() {
            return "Driven " + distance + " meters";
        }

        // Task 3: afișăm starea bateriei
        public String batteryDisplay() {
            return battery == 0 ? "Battery empty" : "Battery at " + battery + "%";
        }

        // Task 4, 5, 6: conducerea mașinii, scădere baterie, oprire dacă e 0%
        public void drive() {
            if (battery > 0) {
                distance += 20;
                battery -= 1;
            }
        }
    }

