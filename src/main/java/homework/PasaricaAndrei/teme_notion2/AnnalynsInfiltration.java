package homework.PasaricaAndrei.teme_notion2;

public class AnnalynsInfiltration {

    public static void main(String[] args) {
        boolean knightIsAwake = false;// fals pentru 2
        boolean archerIsAwake = true;//fals pentru 3
        boolean prisonerIsAwake = false;//fals pentru 3
        boolean petDogIsPresent = false;
        //pentru restul raman valorile prestabilite

        //1
        boolean result = AnnalynsInfiltration.canFastAttack(knightIsAwake);
        System.out.println("Can fast attack: " + result); // fals

        //2
//        boolean result = AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake);
//        System.out.println(result); // adev

        //3
//        boolean result = AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake);
//        System.out.println(result); // adev

        //4
        boolean canFree = AnnalynsInfiltration.canFreePrisoner(
                knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent
        );

        System.out.println(canFree); // fals
    }


//      Verifică dacă se poate face un atac rapid.
//     @param knightIsAwake adev dacă knight-ul este treaz, false dacă doarme
//     @return adev dacă se poate face atacul rapid

    //1
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    //2
//     Returnează adev dacă se poate spiona grupul — adică dacă cel puțin unul este treaz.
//     @param knightIsAwake adev dacă knight-ul este treaz
//     @param archerIsAwake adev dacă arcașul este treaz
//     @param prisonerIsAwake adev dacă prizonierul este treaz
//     @return adev dacă se poate spiona

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    //3
//     Returnează adev dacă prizonierul poate fi semnalizat.
//     @param archerIsAwake adev dacă arcașul este treaz
//     @param prisonerIsAwake adev dacă prizonierul este treaz
//     @return adev dacă se poate semnaliza prizonierul

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }
    //4
    public static boolean canFreePrisoner(boolean knightIsAwake,
                                          boolean archerIsAwake,
                                          boolean prisonerIsAwake,
                                          boolean petDogIsPresent) {
        if (petDogIsPresent) {
            return !archerIsAwake;
        } else {
            return prisonerIsAwake && !knightIsAwake && !archerIsAwake;
        }
    }
}



