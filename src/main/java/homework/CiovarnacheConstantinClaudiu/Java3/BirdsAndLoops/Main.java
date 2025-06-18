package homework.CiovarnacheConstantinClaudiu.Java3.BirdsAndLoops;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] birdsThisWeek = {2, 5, 0, 7, 4, 1};
        BirdWatcher watcher = new BirdWatcher(birdsThisWeek);

        System.out.println(Arrays.toString(BirdWatcher.getLastWeek())); // [0, 2, 5, 3, 7, 8, 4]
        System.out.println("Today: " + watcher.getToday());              // 1
        watcher.incrementTodaysCount();
        System.out.println("Today after increment: " + watcher.getToday()); // 2
        System.out.println("Any day without birds? " + watcher.hasDayWithoutBirds()); // true
        System.out.println("Birds in first 4 days: " + watcher.getCountForFirstDays(4)); // 14
        System.out.println("Number of busy days: " + watcher.getBusyDays()); // 2
    }
}
