package homework.andreiB.homework.homework3;

import java.util.Arrays;


    public class BirdWatcher {
        private int[] birdsPerDay;

        public BirdWatcher(int[] birdsPerDay) {
            this.birdsPerDay = birdsPerDay;
        }

        public static int[] getLastWeek() {
            return new int[] {0, 2, 5, 3, 7, 8, 4};
        }

        public int getToday() {
            return birdsPerDay[birdsPerDay.length - 1];
        }

        public void incrementTodaysCount() {
            birdsPerDay[birdsPerDay.length - 1]++;
        }

        public boolean hasDayWithoutBirds() {
            for (int count : birdsPerDay) {
                if (count == 0) return true;
            }
            return false;
        }

        public int getCountForFirstDays(int numberOfDays) {
            int sum = 0;
            for (int i = 0; i < numberOfDays && i < birdsPerDay.length; i++) {
                sum += birdsPerDay[i];
            }
            return sum;
        }

        public int getBusyDays() {
            int busyDays = 0;
            for (int count : birdsPerDay) {
                if (count >= 5) busyDays++;
            }
            return busyDays;
        }

        public static void main(String[] args) {
            int[] birdsPerDay = {2, 5, 0, 7, 4, 1};
            BirdWatcher watcher = new BirdWatcher(birdsPerDay);
            System.out.println(Arrays.toString(BirdWatcher.getLastWeek()));
            System.out.println(watcher.getToday());
            watcher.incrementTodaysCount();
            System.out.println(watcher.getToday());
            System.out.println(watcher.hasDayWithoutBirds());
            System.out.println(watcher.getCountForFirstDays(4));
            System.out.println(watcher.getBusyDays());
        }
    }


