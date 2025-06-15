package homework.CiovarnacheConstantinClaudiu.Java2;

public class AnnalynsInfiltration {

    // 1. Fast attack can be made if the knight is sleeping
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    // 2. Can spy if at least one of them is awake
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    // 3. Can signal prisoner if the archer is sleeping and the prisoner is awake
    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }

    // 4. Can free prisoner based on pet and characters' states
    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        // If the dog is present, only archer must be asleep
        if (petDogIsPresent) {
            return !archerIsAwake;
        } else {
            // Without the dog: prisoner must be awake, knight and archer must be asleep
            return prisonerIsAwake && !knightIsAwake && !archerIsAwake;
        }
    }

    // Optional: metoda main pentru testare
    public static void main(String[] args) {
        System.out.println("Fast attack: " + canFastAttack(false)); // true
        System.out.println("Can spy: " + canSpy(false, true, false)); // true
        System.out.println("Can signal prisoner: " + canSignalPrisoner(false, true)); // true
        System.out.println("Can free prisoner: " + canFreePrisoner(false, true, false, false)); // false
    }
}
