package homework.MihaiAlexe.Java2;

import java.util.Scanner;

public class AnnHomework {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        canFastAttack(scanner);
        canSpy(scanner);
        canSignalPrisoner(scanner);
        canFreePrisoner(scanner);
        scanner.close();
    }
    public static void canFastAttack(Scanner scanner) {
        System.out.println("Is the knight awake? true/false");
        boolean knightIsAwake = scanner.nextBoolean();
        if (!knightIsAwake) {
            System.out.println("Can fast Attack. The knight is sleeping. Continue your rescue mission!");
        } else {
            System.out.println("Cannot fast attack. The knight is awake. Try option 2");
        }
    }
    public static void canSpy(Scanner scanner) {
        System.out.println("Option 2: Is the archer awake? true/false");
        boolean archerIsAwake = scanner.nextBoolean();
        System.out.println("Is the knight awake? true/false");
        boolean knightIsAwake = scanner.nextBoolean();
        if (knightIsAwake || archerIsAwake) {
            System.out.println("Can be spied on. Continue your rescue mission!");
        } else {
            System.out.println("Can not be spied on, it's a waste of time. Try another option!");
        }
    }
    public static void canSignalPrisoner(Scanner scanner) {
        System.out.println("Is the Prisoner awake? true/false");
        boolean prisonerIsAwake = scanner.nextBoolean();
        System.out.println("Is the Archer awake? true/false ");
        boolean archerIsAwake = scanner.nextBoolean();
        if (!archerIsAwake && prisonerIsAwake) {
            System.out.println("The prisoner can be signalled. Carry on with your rescue mission!");
        } else {
            System.out.println("The prisoner can not be signalled. Try last option!");
        }
    }
    public static void canFreePrisoner(Scanner scanner) {
        System.out.println("Is the archer awake? true/false");
        boolean archerIsAwake = scanner.nextBoolean();
        System.out.println("Is the pet dog present? true/false");
        boolean petDogIsPresent = scanner.nextBoolean();
        System.out.println("Is the knight awake? true/false");
        boolean knightIsAwake = scanner.nextBoolean();
        System.out.println("Is the prisoner awake? true/false");
        boolean prisonerIsAwake = scanner.nextBoolean();

        if (!archerIsAwake && petDogIsPresent) {
            System.out.println("Great! The archer is asleep and the dog helped you to rescue the prisoner!");
        } else if (archerIsAwake && petDogIsPresent) {
            System.out.println("Sorry, the archer is awake and you did not manage to rescue the prisoner :( ");
        } else if (!archerIsAwake && !knightIsAwake && prisonerIsAwake && !petDogIsPresent) {
            System.out.println("Great! Both the archer and the k night are asleep, the prisoner is awake; You've rescued the prisoner alone!");
        } else {
            System.out.println("Sorry, you did not manage to rescue the prisoner :(");
        }
    }

}




