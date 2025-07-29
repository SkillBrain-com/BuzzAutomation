package homework.GabrielaDumitru.Selenium.java.Tema5Selenium;

public class BirdWatcher {
    private int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }

    // Task 1: Return last week's bird counts
    public static int[] getLastWeek() {
        return new int[] { 0, 2, 5, 3, 7, 8, 4 };
    }

    // Task 2: Return today's count (last element in the array)
    public int getToday() {
        if (birdsPerDay.length == 0) {
            return 0;
        }
        return birdsPerDay[birdsPerDay.length - 1];
    }

    // Task 3: Increment today's count
    public void incrementTodaysCount() {
        if (birdsPerDay.length > 0) {
            birdsPerDay[birdsPerDay.length - 1]++;
        }
    }

    // Task 4: Check for any day with 0 birds
    public boolean hasDayWithoutBirds() {
        for (int birds : birdsPerDay) {
            if (birds == 0) {
                return true;
            }
        }
        return false;
    }

    // Task 5: Get count of birds for the first 'n' days
    public int getCountForFirstDays(int numberOfDays) {
        int total = 0;
        int daysToCount = Math.min(numberOfDays, birdsPerDay.length);
        for (int i = 0; i < daysToCount; i++) {
            total += birdsPerDay[i];
        }
        return total;
    }

    // Task 6: Count number of busy days (5 or more birds)
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
