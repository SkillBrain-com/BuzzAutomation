package homework.GabrielaDumitru.javabasics2;

import java.util.Scanner;

public class Annalyn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        canFastAttack(scanner);
        canSpy(scanner);
        canSignaPrisoner(scanner);
        canFreePrisoner(scanner);
        scanner.close();

    }

    public static void canFastAttack(Scanner scanner){
        System.out.println("Is the knight awake? true/false");
        boolean knightIsAwake = scanner.nextBoolean();
        if (!knightIsAwake) {
            System.out.println("Grate! Continue the mission!");
        } else {
            System.out.println("This is bad! Please choose next option!");
        }
    }

    public static void canSpy(Scanner scanner) {
        System.out.println("Is the archer awake? true/false");
        boolean archerIsAwake = scanner.nextBoolean();
        System.out.println("Is the archer awake? true/false");
        boolean knightIsAwake = scanner.nextBoolean();
        if (knightIsAwake || archerIsAwake) {
            System.out.println("Grate! Continue the mission!");
        } else {
            System.out.println("Oh no! He can not be spied on. Please choose another option!");
        }
    }

    public static void canSignaPrisoner(Scanner scanner) {
        System.out.println("Is the prisoner awake? true/false");
        boolean prisonerIsAwake = scanner.nextBoolean();
        System.out.println("Is the prisoner awake? true/false");
        boolean archerIsAwake = scanner.nextBoolean();
        if (!archerIsAwake && prisonerIsAwake) {
            System.out.println("Cool! The prisoner can be signalled!");
        } else {
            System.out.println("The prisonner can not be signalled! You have to try the last option.");
        }
    }

    public static void canFreePrisoner(Scanner scanner) {
        System.out.println("Is the archer awake? true/false");
        boolean archerIsAwake = scanner.nextBoolean();
        System.out.println("Is the dog present? true/false");
        boolean petDogIsPresent = scanner.nextBoolean();
        System.out.println("Is the knight awake? true/false");
        boolean knightIsAwake = scanner.nextBoolean();
        System.out.println("Is the prisoner awake? true/false");
        boolean prisonerIsAwake = scanner.nextBoolean();
        if (!archerIsAwake && petDogIsPresent) {
            System.out.println("Grate! The archer is asleep and the dog help you!");
        } else if (archerIsAwake && petDogIsPresent) {
            System.out.println("This is bad! The archer is awake and the dog can not help you!");
        }else if (!archerIsAwake && !knightIsAwake && prisonerIsAwake && !petDogIsPresent){
            System.out.println("You have rescued the prisoner!");
        } else {
            System.out.println("You have not rescued the prisonner!");
        }
    }


}
