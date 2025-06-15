package homework.CiovarnacheConstantinClaudiu.Java3.BirdsAndLoops;

import java.util.Arrays;

import java.util.Arrays;

public class BirdWatcher {

    private int[] birdsPerDay;

    // Constructor care primește un array cu vizitele zilnice
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }

    // Task 1: Returnează numărul de păsări de săptămâna trecută (fix)
    public static int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    // Task 2: Returnează numărul de păsări din ziua de azi (ultimul element)
    public int getToday() {
        if (birdsPerDay.length == 0) return 0;
        return birdsPerDay[birdsPerDay.length - 1];
    }

    // Task 3: Crește numărul de păsări din ziua de azi cu 1
    public void incrementTodaysCount() {
        if (birdsPerDay.length == 0) return;
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    // Task 4: Verifică dacă există o zi fără păsări (valoarea 0)
    public boolean hasDayWithoutBirds() {
        for (int count : birdsPerDay) {
            if (count == 0) {
                return true;
            }
        }
        return false;
    }

    // Task 5: Calculează totalul păsărilor pentru primele `numberOfDays` zile
    public int getCountForFirstDays(int numberOfDays) {
        int total = 0;
        for (int i = 0; i < numberOfDays && i < birdsPerDay.length; i++) {
            total += birdsPerDay[i];
        }
        return total;
    }

    // Task 6: Numără zilele cu 5 sau mai multe păsări
    public int getBusyDays() {
        int busyDays = 0;
        for (int count : birdsPerDay) {
            if (count >= 5) busyDays++;
        }
        return busyDays;
    }
}
