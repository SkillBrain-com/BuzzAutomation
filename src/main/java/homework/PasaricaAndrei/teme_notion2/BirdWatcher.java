package homework.PasaricaAndrei.teme_notion2;

public class BirdWatcher {

    public static int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    private int[] birdsPerDay;


    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }

    // metoda sa numaram birds
    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }
    public boolean hasDayWithoutBirds() {
        for (int count : birdsPerDay) {
            if (count == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        int limit = Math.min(numberOfDays, birdsPerDay.length);
        for (int i = 0; i < limit; i++) {
            sum += birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int busyDaysCount = 0;
        for (int count : birdsPerDay) {
            if (count >= 5) {
                busyDaysCount++;
            }
        }
        return busyDaysCount;
    }

    public static void main(String[] args) {

        int[] lastWeek = BirdWatcher.getLastWeek();
        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
        //1
        for (int count : lastWeek) {
            System.out.print(count + " ");// 0 2 5 3 7 8 4
        }
        //2
        System.out.println(birdCount.getToday());  // 1

        //3
        birdCount.incrementTodaysCount();
        System.out.println(birdCount.getToday());  // 2

        //4
        System.out.println(birdCount.hasDayWithoutBirds());  // adev

        //5
        System.out.println(birdCount.getCountForFirstDays(4)); // 14

        //6
        System.out.println(birdCount.getBusyDays()); // 2
    }
}
