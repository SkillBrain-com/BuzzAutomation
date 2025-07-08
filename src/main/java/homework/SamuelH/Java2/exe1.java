package Java2;

public class exe1 {
    public static void main(String[] args) {

    }

    private static class Lasagna {

        private static final int EXPECTED_OVEN_TIME = 40;

        public int expectedMinutesInOven() {
            return EXPECTED_OVEN_TIME;
        }

        public int remainingMinutesInOven(int minutesInOven) {
            return EXPECTED_OVEN_TIME - minutesInOven;
        }

        public int preparationTimeInMinutes(int numberOfLayers) {
            return numberOfLayers * 2;
        }

        public int totalTimeInMinutes(int numberOfLayers, int minutesInOven) {
            return preparationTimeInMinutes(numberOfLayers) + minutesInOven;
        }

        public static void main(String[] args) {
            Lasagna lasagna = new Lasagna();

            System.out.println(lasagna.expectedMinutesInOven()); // 40
            System.out.println(lasagna.remainingMinutesInOven(30)); // 10
            System.out.println(lasagna.preparationTimeInMinutes(2)); // 4
            System.out.println(lasagna.totalTimeInMinutes(3, 20)); // 26
        }
    }
}
