package homework.Andrei.Paun.java3Homework;

public class BirdWatcherRun {

        public static void main(String[] args) {
            // Test cerința 1
            int[] lastWeek = BirdWatcher.getLastWeek();
            System.out.print("Last week: ");
            for (int n : lastWeek) {
                System.out.print(n + " ");
            }
            System.out.println();

            // Test alte cerințe
            int[] birdsToday = {2, 5, 0, 7, 4, 1};
            BirdWatcher birdWatcher = new BirdWatcher(birdsToday);

            // 2. Câte păsări azi?
            System.out.println("Today: " + birdWatcher.getToday());

            // 3. Incrementăm azi
            birdWatcher.incrementTodaysCount();
            System.out.println("After increment: " + birdWatcher.getToday());

            // 4. A fost vreo zi fără păsări?
            System.out.println("Any day without birds? " + birdWatcher.hasDayWithoutBirds());

            // 5. Total pentru primele 4 zile
            System.out.println("Count for first 4 days: " + birdWatcher.getCountForFirstDays(4));

            // 6. Zile aglomerate
            System.out.println("Busy days: " + birdWatcher.getBusyDays());
        }
    }


