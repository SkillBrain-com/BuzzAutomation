package homework.Andrei.Paun.java3Homework;

public class BirdWatcher {

        private final int[] birdsPerDay;

        public BirdWatcher(int[] birdsPerDay) {
            this.birdsPerDay = birdsPerDay;
        }

        // 1. Returnează valorile de săptămâna trecută
        public static int[] getLastWeek() {
            return new int[]{0, 2, 5, 3, 7, 8, 4};
        }

        // 2. Returnează numărul de păsări de azi (ultimul element)
        public int getToday() {
            return birdsPerDay[birdsPerDay.length - 1];
        }

        // 3. Incrementează numărul de păsări de azi
        public void incrementTodaysCount() {
            birdsPerDay[birdsPerDay.length - 1]++;
        }

        // 4. Verifică dacă a existat o zi cu 0 păsări
        public boolean hasDayWithoutBirds() {
            for (int birds : birdsPerDay) {
                if (birds == 0) {
                    return true;
                }
            }
            return false;
        }

        // 5. Returnează totalul păsărilor din primele n zile
        public int getCountForFirstDays(int numberOfDays) {
            int sum = 0;
            for (int i = 0; i < numberOfDays && i < birdsPerDay.length; i++) {
                sum += birdsPerDay[i];
            }
            return sum;
        }

        // 6. Returnează numărul de zile aglomerate (5+ păsări)
        public int getBusyDays() {
            int count = 0;
            for (int birds : birdsPerDay) {
                if (birds >= 5) {
                    count++;
                }
            }
            return count;
        }
    }


