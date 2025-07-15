package homework.AndreiB.Homework.homework2;

public class AnnalynsInfiltration {

    static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return prisonerIsAwake && !archerIsAwake;
    }

    static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if (petDogIsPresent) {
            return !archerIsAwake;
        } else {
            return prisonerIsAwake && !knightIsAwake && !archerIsAwake;
        }
    }

    public static void main(String[] args) {
        System.out.println("Poate ataca rapid (cavaler treaz): " + canFastAttack(true));                      // false
        System.out.println("Poate ataca rapid (cavaler doarme): " + canFastAttack(false));                   // true

        System.out.println("Poate spiona (archer treaz): " + canSpy(false, true, false));                    // true
        System.out.println("Poate spiona (toți dorm): " + canSpy(false, false, false));                      // false

        System.out.println("Poate semnaliza prizonierul: " + canSignalPrisoner(false, true));                // true
        System.out.println("Nu poate semnaliza (archer treaz): " + canSignalPrisoner(true, true));           // false

        System.out.println("Poate elibera (cu câine, arcaș treaz): " + canFreePrisoner(false, true, false, true)); // false
        System.out.println("Poate elibera (cu câine, arcaș doarme): " + canFreePrisoner(false, false, false, true)); // true
        System.out.println("Poate elibera (fără câine, prizonier treaz, toți dorm): " + canFreePrisoner(false, false, true, false)); // true
        System.out.println("Nu poate elibera (fără câine, prizonier doarme): " + canFreePrisoner(false, false, false, false)); // false
    }

}
