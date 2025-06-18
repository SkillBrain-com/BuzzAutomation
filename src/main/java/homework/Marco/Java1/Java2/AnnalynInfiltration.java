package Java2;

import java.util.Scanner;

public class AnnalynInfiltration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        canFastAttack(scanner);
        canSpy(scanner);
        canSignalPrisoner(scanner);
        canFreePrisoner(scanner);


    }

    //Implement the (static) AnnalynsInfiltration.canFastAttack() method that takes a boolean value that indicates if the knight is awake.
    // This method returns true if a fast attack can be made based on the state of the knight. Otherwise, returns false:
    static void canFastAttack(Scanner scanner) {
        System.out.println("Is the knight awake ? true/false");
        boolean knightIsAwake = scanner.nextBoolean();
        if (!knightIsAwake) {
            System.out.println("Very good. You used \"Fast Attack\" on the knight");
        } else {
            System.out.println("Thats bad, lets choose another option");
        }
        System.out.println("===================================");
    }

    //Implement the (static) AnnalynsInfiltration.canSpy() method that takes three boolean values,
    // indicating if the knight, archer and the prisoner, respectively, are awake.
    // The method returns true if the group can be spied upon, based on the state of the three characters. Otherwise, returns false:
    static void canSpy(Scanner scanner) {
        System.out.println("Is the archer awake ? true/false");
        boolean archerIsAwake = scanner.nextBoolean();
        System.out.println("Is the knight awake ? true/false");
        boolean knightIsAwake = scanner.nextBoolean();

        if (knightIsAwake && !archerIsAwake || !knightIsAwake && archerIsAwake) {
            System.out.println("Great ! You can spy them.");
        } else {
            System.out.println("Oh no! You can not spy them.");
        }
        System.out.println("===================================");
    }

    //Implement the (static) AnnalynsInfiltration.canSignalPrisoner() method that takes two boolean values,
    //indicating if the archer and the prisoner, respectively, are awake.
    // The method returns true if the prisoner can be signalled, based on the state of the two characters. Otherwise, returns false:
    static void canSignalPrisoner(Scanner scanner) {
        System.out.println("Is the prisoner awake ? true/false");
        boolean prisonerIsAwake = scanner.nextBoolean();
        System.out.println("Is the archer awake ? true/false");
        boolean archerIsAwake = scanner.nextBoolean();

        if (prisonerIsAwake && !archerIsAwake) {
            System.out.println("Great! The prisoner can be signalled!");
        } else {
            System.out.println("You can not signal the prisoner.");
        }
        System.out.println("===================================");
    }

    //Implement the (static) AnnalynsInfiltration.canFreePrisoner() method that takes four boolean values.
    // The first three parameters indicate if the knight, archer and the prisoner, respectively, are awake.
    // The last parameter indicates if Annalyn's pet dog is present. The method returns true if the prisoner can be freed based on the
    // state of the three characters and Annalyn's pet dog presence. Otherwise, it returns false:
    static void canFreePrisoner(Scanner scanner) {
        System.out.println("Is the dog present? true/false");
        boolean PetDogIsPresent = scanner.nextBoolean();
        System.out.println("Is the archer awake? true/false");
        boolean archerIsAwake = scanner.nextBoolean();
        System.out.println("Is the prisoner awake? true/false");
        boolean prisonerIsAwake = scanner.nextBoolean();
        System.out.println("Is the knight awake ? true/false");
        boolean knightisAwake = scanner.nextBoolean();

        if (PetDogIsPresent && !archerIsAwake) {
            System.out.println("Great Job ! You saved the prisoner");
        } else {
            System.out.println("You can not save the prisoner.");
        }

        if (prisonerIsAwake && !knightisAwake && !archerIsAwake) {
            System.out.println("Great Job ! You saved the prisoner");
        } else if (!prisonerIsAwake && !knightisAwake && !archerIsAwake) {
            System.out.println("Upon seeing you, the prisoner woke up the enemies.");
        } else if (!prisonerIsAwake && knightisAwake && !archerIsAwake) {
            System.out.println("You can not save the prisoner.");
        }

        System.out.println("==========================================================");

        System.out.println("Thank You For Playing Our Game !");
    }
}
