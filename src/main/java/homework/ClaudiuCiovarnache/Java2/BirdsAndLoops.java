package homework.ClaudiuCiovarnache.Java2;


public class BirdsAndLoops {
    private int[] birdsPerDay;
    private static final int[] LAST_WEEK_COUNTS = {0, 2, 5, 3, 7, 8, 4};

    public BirdsAndLoops(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }

    public static int[] getLastWeek() {
        return LAST_WEEK_COUNTS;
    }

    public int getToday() {
        return birdsPerDay.length > 0 ? birdsPerDay[birdsPerDay.length - 1] : 0;
    }

    public void incrementTodaysCount() {
        if (birdsPerDay.length > 0) {
            birdsPerDay[birdsPerDay.length - 1]++;
        }
    }

    public boolean hasDayWithoutBirds() {
        for (int count : birdsPerDay) {
            if (count == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int days) {
        int sum = 0;
        for (int i = 0; i < Math.min(days, birdsPerDay.length); i++) {
            sum += birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int count = 0;
        for (int birds : birdsPerDay) {
            if (birds >= 5) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] birdsPerDay = {2, 5, 0, 7, 4, 1};
        BirdsAndLoops birdCount = new BirdsAndLoops(birdsPerDay);

        System.out.println("Last week's counts: " + java.util.Arrays.toString(getLastWeek()));
        System.out.println("Today's count: " + birdCount.getToday());
        birdCount.incrementTodaysCount();
        System.out.println("After increment, today's count: " + birdCount.getToday());
        System.out.println("Count for first 4 days: " + birdCount.getCountForFirstDays(4));
        System.out.println("Number of busy days: " + birdCount.getBusyDays());
    }
}