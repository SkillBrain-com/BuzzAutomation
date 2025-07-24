package homework.andreiB.homework.homework2;

public class Lasagna {


        public int expectedMinutesInOven() {
            return 40;
        }

        public int remainingMinutesInOven(int minuteInCuptor) {
            return expectedMinutesInOven() - minuteInCuptor;
        }

        public int preparationTimeInMinutes(int numarStraturi) {
            return numarStraturi * 2;
        }

        public int totalTimeInMinutes(int numarStraturi, int minuteInCuptor) {
            return preparationTimeInMinutes(numarStraturi) + minuteInCuptor;
        }

    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        System.out.println("Timp așteptat în cuptor: " + lasagna.expectedMinutesInOven());
        System.out.println("Timp rămas în cuptor: " + lasagna.remainingMinutesInOven(30));
        System.out.println("Timp pregătire (2 straturi): " + lasagna.preparationTimeInMinutes(2));
        System.out.println("Timp total (3 straturi, 20 min cuptor): " + lasagna.totalTimeInMinutes(3, 20));
    }
    }

