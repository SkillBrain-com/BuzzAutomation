package homework.Andrei.Paun.java2Homework;

public class AnnalynsInfiltration {


        // Atacă rapid dacă cavalerul doarme
        public static boolean canFastAttack(boolean knightIsAwake) {
            return !knightIsAwake;
        }

        // Poți spiona dacă cineva e treaz
        public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
            return knightIsAwake || archerIsAwake || prisonerIsAwake;
        }

        // Poți semnaliza prizonierul dacă el e treaz și arcașul doarme
        public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
            return !archerIsAwake && prisonerIsAwake;
        }

        // Poți elibera prizonierul în două cazuri
        public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake,
                                              boolean prisonerIsAwake, boolean petDogIsPresent) {
            return (petDogIsPresent && !archerIsAwake)
                    || (!petDogIsPresent && !knightIsAwake && !archerIsAwake && prisonerIsAwake);
        }
    }


