package homework.GabrielaDumitru.javabasics2;

public class BirdsLoops {

    public static int[] getLastWeek() {
        return new int[] {0, 2, 5, 3, 7, 8, 4};
    }

    public static int birdsPerDay() {
        int[] counts = { 2, 5, 0, 7, 4, 1 };
        int lastIndex = counts.length - 1;
        return counts[lastIndex];
    }

    public static int incrementTodaysCount() {
        int[] counts = { 2, 5, 0, 7, 4, 1 };
        int lastIndex = counts.length - 1;
        return ++counts[lastIndex];
    }

    public static boolean hasDayWithhoutBirds() {
        int[] counts = { 2, 5, 0, 7, 4, 1 };
        for (int count : counts) {
            if (count == 0){
            return true;}
        }
        return false;

    }

    public static int getCountForFirstDays() {
        int[] counts = { 2, 5, 0, 7, 4, 1 };
        int sum = 0;
        for (int i = 0; i < 4; i++){
        sum += counts[i];}
        return sum;
    }

    public static int getBusyDays() {
        int[] counts = { 2, 5, 0, 7, 4, 1 };
        int busyDays = 0;
        for (int count : counts) {
            if (count >= 5){
            busyDays++;}
        }
        return busyDays;
    }

    public static void main(String[] args) {
//        int[] lastWeeksCounts = getLastWeek();
//        System.out.println("Las weeks counts were: ");
//        for (int i = 0; i < lastWeeksCounts.length; i++) {
//            System.out.println(lastWeeksCounts[i] + ",");
//        }
//        System.out.println();
//        int todayCounts = birdsPerDay();{
//            System.out.println("Todays count was: ");
//            System.out.println(todayCounts);
//        }
//        System.out.println("Todays incremented count: ");
//        System.out.println(incrementTodaysCount());

        if (hasDayWithhoutBirds()) {
            System.out.println("There was a day without birds");
        }
//        else {
//            System.out.println("There was no day without birds");
//        }
//        System.out.println("Suma primelor zile este:" + getCountForFirstDays());
//        System.out.println("Number of busy days: " + getBusyDays());
    }
}
