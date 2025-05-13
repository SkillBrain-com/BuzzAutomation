package homework.ClaudiuCiovarnache.Java2;

public class AnnalynsInfiltration {

    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return prisonerIsAwake && !archerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if (petDogIsPresent) {
            return !archerIsAwake;
        } else {
            return prisonerIsAwake && !knightIsAwake && !archerIsAwake;
        }
    }

    public static void main(String[] args) {

        boolean knightIsAwake = true;
        System.out.println(canFastAttack(knightIsAwake));

        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        System.out.println(canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));

        archerIsAwake = false;
        prisonerIsAwake = true;
        System.out.println(canSignalPrisoner(archerIsAwake, prisonerIsAwake));

        boolean petDogIsPresent = false;
        System.out.println(canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent));
    }
}