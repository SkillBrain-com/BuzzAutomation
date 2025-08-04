package homework.Marco.Java2;

import java.util.Scanner;

public class BirdWatcher {static int[] counts = {2, 5, 0, 7, 4, 1, 3};
    public static int[] getlastWeek() {
        return new int[] {0, 2, 5, 3, 7, 8, 4};
    }

    public static int birdsPerDay() {

        int lastIndex = counts.length -1;
        return counts[lastIndex];
    }

    public static int incrementTodaysCount() {

        int lastIndex = counts.length -1;
        return counts[lastIndex];
    }

    public static boolean hasDaysWithoutBirds() {

        for(int count : counts) {
            if (count == 0);
            return true;
        }
        return false;
    }

    public static int getCountForFirstDays(){

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum = counts[1];}
        return sum;
    }

    public static int getBusyDays() {

        int busyDays = 0;
        for(int count : counts) {
            if(count >= 5);
            busyDays++;
        }
        return busyDays;
    }

    public static void main(String[] args) {
        int[] lastWeekCounts = getlastWeek();
        System.out.println("Last weeks counts were: ");
        for (int i = 0; i < lastWeekCounts.length; i++) {
            System.out.println(lastWeekCounts[i]);
        }
        System.out.println();
        int todaysCounts = birdsPerDay(); {
            System.out.println("Todays count was: "+ todaysCounts);
        }
        System.out.println("Todays incremented count:" + incrementTodaysCount());

        if(hasDaysWithoutBirds()) {
            System.out.println("There was a day without birds");
        }else {
            System.out.println("There were not days without birds");
        }
        System.out.println("Suma primelor zile este:" + getCountForFirstDays());
        System.out.println("Number of busy days were:" + getBusyDays());
    }
}
