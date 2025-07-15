package homework.MihaiAlexe.Java3;

public class BirdsHomework {
    static int[] counts = {2, 5, 0, 7, 4, 1};

    //1. Check what the counts were last week
    public static int[] getLastWeek = {0, 2, 5, 3, 7, 8, 4};

    //2.Check how many birds visited today
    public static int birdsPerDay() {
        int lastIndex = counts.length - 1;
        return counts[lastIndex];
    }

    //3. Increment today's count
    public static int incrementTodaysCount() {
        int lastIndex = counts.length - 1;
        return counts[lastIndex] + 1;
    }

    //4. Check if there was a day with no visiting birds
    public static boolean hasDayWithoutBirds() {
        for (int count : counts) {
            if (count == 0)
                return true;
        }
        return false;
    }

    // 5. Calculate the number of visiting birds for the first number of days
    public static int getCountForFirstDays(int days) {
        int sum = 0;
        for (int i = 0; i < days; i++) {
            sum += counts[i];
        }
        return sum;
    }

    //    6. Calculate the number of busy days
    public static int getBusyDays() {
        int busyDays = 0;
        for (int count : counts) {
            if (count >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }

    public static void main(String[] args) {
        System.out.print("Last week's counts were: ");
        for (int i = 0; i < getLastWeek.length; i++) {
            System.out.print(getLastWeek[i] + ", ");
        }
        System.out.println();
        int todayCounts = birdsPerDay();
        {
            System.out.print("Today's count was: ");
            System.out.println(todayCounts);
        }
        System.out.print("Today's incremented count: ");
        System.out.println(incrementTodaysCount());

        if (hasDayWithoutBirds()) {
            System.out.println("There was a day without birds");
        } else {
            System.out.println("There was no day without birds");
        }
        System.out.println("Sum of first days is: " + getCountForFirstDays(4));

        System.out.println("Number of busy days: " + getBusyDays());

    }


}


